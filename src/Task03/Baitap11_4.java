package Task03;

public class Baitap11_4 {
    public static void main(String[] args)
    {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;

        int number = lowerbound;
        while(number <= upperbound)
        {
            sum = sum + number*number;
            ++number;
        }
        System.out.println("The sum from "+ lowerbound +" to "+ upperbound +" is "+ sum);
    }
}
