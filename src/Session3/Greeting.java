package Session3;

public class Greeting {
    public static void main(String[] args){
        String day = "Monday";
        String hour = "am";
        switch (day){
            case "Sunday":
                System.out.printf("Sunday is a Holiday...");
            switch (hour){
                case "am":
                    System.out.println("Good Morning");
                    break;
                case "pm":
                    System.out.println("Good Evening");
                    break;
            }
                break;
            case "Monday":
                System.out.printf("Monday is a Working...");
                switch (hour){
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
