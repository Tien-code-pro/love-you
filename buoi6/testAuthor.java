package buoi6;

public class testAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan ah tack","teck@nowhere.com",'m');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("name is :"+ ahTeck.getName());

        System.out.println("gender is: "+ ahTeck.getGender());

        System.out.println("email is: "+ ahTeck.getEmail());
    }
}
