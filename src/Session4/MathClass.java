package Session4;

public class MathClass {
    public void add(int num1, int num2){
        System.out.println("Result after addition: "+(num1+num2));
    }
    public void add(int num1,int num2, int num3){
        System.out.println("Result after addition: "+(num1+num2+num3));
    }
    public void add(float num1,int num2){
        System.out.println("Result after addition: "+(num1+num2));
    }
    public void add(int num1,float num2){
        System.out.println("Result after addition: "+(num1+num2));
    }
    public void add(float num1,float num2){
        System.out.println("Result after addition: "+(num1+num2));
    }
    public static void main(String[] args){
        MathClass objMath = new MathClass();
        objMath.add(3.4F,2);
    }
}
