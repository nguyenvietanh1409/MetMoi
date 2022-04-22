package Session3;

public class PrintMultiplesWithWhileLoop {
    public static void main(String[ ]args){
        int num = 1;
        int produc = 0;
        while (num<=5){
            produc = num * 10;
            System.out.printf("\n %d * 10 = %d", num, produc);
            num++;
        }
        System.out.println("\nOutside the Loop");
    }
}
