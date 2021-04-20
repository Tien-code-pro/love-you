package buoi8;

public class testAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tien bro","teck@nowhere.com",'v');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("name is :"+ ahTeck.getName());

        System.out.println("gender is: "+ ahTeck.getGender());

        System.out.println("email is: "+ ahTeck.getEmail());
    }
}
