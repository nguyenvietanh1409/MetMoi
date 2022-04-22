package Task03;

public class OddEvenSum {
    public static void main(String[] args)
    {
        int lowerbound = 1;
        int upperbound = 1000;
        int summOdd = 0;
        int sumEven = 0;
        int number = lowerbound;
        while(number <= upperbound)
        {
            if (number % 2 == 0)
            {
                sumEven += number;
            }
            else
            {
                summOdd += number;
            }
            ++number;
        }
        System.out.println("The sum of odd numbers from "+ lowerbound +" to "+ upperbound +" is "+ summOdd);
        System.out.println("The sum of even numbers from "+ lowerbound +" to "+ upperbound +" is "+ sumEven);
        System.out.println("The difference between the two sums is "+ (summOdd - sumEven));
    }
}