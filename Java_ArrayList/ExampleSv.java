package Java_ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ExampleSv {
    public static void main(String[] args) {
        List<String>nameSv = new ArrayList<>();
        nameSv.add("Tom");
        nameSv.add("Jerry");
        nameSv.add("Batman");
        nameSv.add("Superman");
        nameSv.add("Wonder Woman");
        System.out.println(nameSv);
        //Creating an ArrayList from another collection
        List<String>addNameSv = new ArrayList<>(nameSv);
        List<String>nextNameSv = new ArrayList<>();
        nextNameSv.add("Loki");
        nextNameSv.add("Thor");
        nextNameSv.add("SpiderMan");
        //Adding an entire collection to an ArrayList
        addNameSv.addAll(nextNameSv);
        System.out.println(addNameSv);
        //Check if an ArrayList is empty?
        System.out.println("Is the nameSv list empty? : " +nameSv);
        //Find the size of an ArrayList
        System.out.println("Here are the name "+addNameSv.size()+"All nameSv in Class");
        System.out.println(addNameSv);
        //Retrieve the element at a given index
        String name = nameSv.get(0);
        String secondName = nameSv.get(1);
        String lastName= nameSv.get(nameSv.size()-1);
        System.out.println("Name:"+name);
        System.out.println("Second Name: "+secondName);
        System.out.println("LastName : "+lastName);
        //Modify the element at a given index
        nameSv.set(3,"Ngo Chi Thanh Dat");
        System.out.println("Modifier name list:"+nameSv);
        //Remove the element at index '2'
        nameSv.remove(2);
        System.out.println("After remove(2): "+nameSv);
        //Remove All the elements that exist in a given collection
        List<String>nameAnimation= new ArrayList<>();
        nameAnimation.add("Tom");
        nameAnimation.add("Jerry");
        //Remove all the elements that satisfy the given predicate
        nameSv.removeIf(n->(n.charAt(0)=='T'));
        System.out.println("After removing elements that start with\"T\" :"+nameSv);
        //remove all element from the ArrayList
        nameSv.clear();
        System.out.println("After Clear():"+nameSv);
        //Duyet qua phan tu cua mang
        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        addNameSv.forEach(names->{
            System.out.println(names);
        });
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String>NameSvIterator =addNameSv.iterator();
        while (NameSvIterator.hasNext()){
            String nameShow= NameSvIterator.next();
            System.out.println(nameShow);
        }
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String>NameSvListIterator =  addNameSv.listIterator(addNameSv.size());
        while (NameSvListIterator.hasPrevious()){
            String namesShow = NameSvListIterator.previous();
            System.out.println(namesShow);
        }
    }
}
