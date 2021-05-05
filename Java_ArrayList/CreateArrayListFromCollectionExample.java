package Java_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers= new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        //Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumber= new ArrayList<>(firstFivePrimeNumbers);
        List<Integer>nextFive=new ArrayList<>();
        firstTenPrimeNumber.add(13);
        firstTenPrimeNumber.add(17);
        firstTenPrimeNumber.add(19);
        firstTenPrimeNumber.add(23);
        firstTenPrimeNumber.add(29);
        //Adding an entire collection to an ArrayList
        firstTenPrimeNumber.addAll(nextFive);
        System.out.println(firstTenPrimeNumber);
    }

}
