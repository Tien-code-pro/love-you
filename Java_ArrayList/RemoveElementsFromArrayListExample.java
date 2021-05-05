package Java_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List:  "+programmingLanguages);
        //Remove the element at index '5';
        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+programmingLanguages);
        //Remove the first occurrence of the given element from the array list
        //The remove () method returns false if the element does not exist in the ArrayList
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\")"+programmingLanguages);
        //Remove all the elements that exist in a the given collection
        List<String> scriptLanguages=new ArrayList<>();
        scriptLanguages.add("Python");
        scriptLanguages.add("Ruby");
        scriptLanguages.add("Perl");
        programmingLanguages.removeAll(scriptLanguages);
        System.out.println("After removeAll(ScriptLanguages):"+programmingLanguages);
        //Remove all the elements that satisfy the given predicate
        programmingLanguages.removeIf(n -> (n.charAt(0)=='C'));
        System.out.println("After removing all elements that start with\"C\":"+programmingLanguages);
        //Remove all elements form the ArrayList
        programmingLanguages.clear();
        System.out.println("After Clear (): "+programmingLanguages);
        }
}
