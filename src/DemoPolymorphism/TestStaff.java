package DemoPolymorphism;

public class TestStaff {
    public static void main(String[] args){
        Staff s1 = new PartTime("Nguyen Viet Anh", 19, 120);
        System.out.println(s1);

        Staff s2 = new FullTime("Hoang Van A", 19, 9, 5800000);
        System.out.println(s2);
    }
}
