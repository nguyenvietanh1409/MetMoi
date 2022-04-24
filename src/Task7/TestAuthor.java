package Task7;

public class TestAuthor {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Teck","teck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck);

        System.out.println("Name: "+ ahTeck.getName());
        System.out.println("Gender: "+ ahTeck.getGender());
        System.out.println("Email: "+ ahTeck.getEmail());
    }
}
