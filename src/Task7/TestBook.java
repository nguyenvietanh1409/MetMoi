package Task7;

public class TestBook {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Teck","teck@somewhere.com",'m');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummies", ahTeck,9.99,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("Name: "+dummyBook.getName());
        System.out.println("Price: "+dummyBook.getPrice());
        System.out.println("Qty: "+dummyBook.getQty());
        System.out.println("Author: "+dummyBook.getAuthor());

        System.out.println("Author name is: "+ dummyBook.getAuthor().getName());
        System.out.println("Author email is: "+ dummyBook.getAuthor().getEmail());
        System.out.println("Author gender is: "+ dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee","peter@nowhere.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}
