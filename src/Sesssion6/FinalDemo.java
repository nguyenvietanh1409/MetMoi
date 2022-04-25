package Sesssion6;

public class FinalDemo {
    final float PI = 3.14F;
    public void display(float pi){
        System.out.println("The value of PI is "+PI);
    }
    public static void main(String[] args){
        final FinalDemo objFD = new FinalDemo();
        objFD.display(22.7F);
    }
}
