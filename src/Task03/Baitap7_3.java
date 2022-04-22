package Task03;

public class Baitap7_3 {
    public static void main(String[] args)
    {
        double total;
        System.out.println("San pham 1 - Gia: 100.000 - So luong: 2");
        System.out.println("San pham 2 - Gia: 200.000 - So luong: 1");
        System.out.println("San pham 3 - Gia: 300.000 - So luong: 3");
        System.out.println("San pham 4 - Gia: 400.000 - So luong: 2");
        System.out.println("San pham 5 - Gia: 500.000 - So luong: 1");
        total = 100000*2 + 200000 + 300000*3 + 400000*2 + 500000;
        System.out.println("Tong gia: "+ total);
    }
}