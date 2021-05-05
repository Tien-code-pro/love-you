package Java_ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIteratorRemoveList {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(14);
        numbers.add(25);
        numbers.add(40);
        Iterator<Integer>numbersIterator= numbers.iterator();
        while (numbersIterator.hasNext()){
            Integer num= numbersIterator.next();
            if (num %2 !=0){
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
