package Session4;

public class Calculator {
    public void add(int num1,int num2 ) {
        int num3;
        num3 = num1+num2;
        System.out.println("Result after addition is: "+num3);
    }
    public void sub(int num1,int num2 ) {
        int num3;
        num3 = num1-num2;
        System.out.println("Result after subtraction is: "+num3);
    }
    public void mul(int num1,int num2 ) {
        int num3;
        num3 = num1*num2;
        System.out.println("Result after multiplication is: "+num3);
    }
    public void div(int num1,int num2 ) {
        int num3;
        num3 = num1/num2;
        System.out.println("Result after division is: "+num3);
    }

    public static void main(String [] args){
        Calculator obj = new Calculator();
        obj.add(3,4);
    }
}
