package Ngay25Thang4;

public class TestStudent {
    public static void main(String[]args ){
        ClassRoom cl1 = new ClassRoom(1,"T2109A");
        ClassRoom cl2 = new ClassRoom(1,"A1.2108M");
        Student st1 = new Student(1,"Nguyen Viet Anh", cl1);
        Student st2 = new Student(2,"Le Hoang Minh", cl2);

        System.out.println(st1);
        System.out.println(st2);
    }
}
