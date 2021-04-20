package buoi8;

public class testBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck","ahTeck@somewhere.com",'m');
        System.out.println(ahTeck);

        book dummybook = new book("java for dummies",ahTeck,9.99,99);
        System.out.println(dummybook);

        dummybook.setPrice(8.88);
        dummybook.setQty(88);
        System.out.println("name is: "+dummybook.getName());
        System.out.println("Price is: "+dummybook.getPrice());
        System.out.println("qty is: "+dummybook.getQty());
        System.out.println("author is: "+dummybook.getAuthor());

        book moreDummyBook = new book("java for more dummies",new Author("Peter Lee","peter@nowhere.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}

