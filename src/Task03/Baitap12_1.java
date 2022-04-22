package Task03;

public class Baitap12_1 {
    public static void main(String[] args)
    {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;

        int number = lowerbound;
        while(number <= upperbound)
        {
            if ((number%3==0 || number%5==0 || number%7==0) || number%15!=0 || number%21!=0 || number%35!=0 || number%105!=0){
                sum = sum + number;
            }
            ++number;
        }
        System.out.println("The sum is: "+ sum);
    }
}
