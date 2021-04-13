package buoi6;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck","ahTeck@somewhere.com",'m');
        System.out.println(ahTeck);

        Book dummyBook = new Book("java for dummies",ahTeck,9.99,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: "+dummyBook.getName());
        System.out.println("Price is: "+dummyBook.getPrice());
        System.out.println("qty is: "+dummyBook.getQty());
        System.out.println("author is: "+dummyBook.getAuthor());

        Book moreDummyBook = new Book("java for more dummies",new Author("Peter Lee","peter@nowhere.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}
