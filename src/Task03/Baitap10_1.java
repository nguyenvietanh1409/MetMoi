package Task03;

public class Baitap10_1 {
    public static void main(String[] args)
    {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;

        //Print results
        System.out.println("The sum, difference, product, quotient, remainder of "+ number1 + " and "+ number2 +" are "+ sum +", "+ difference +", "+ product +", "+ quotient +", "+ remainder);

    }
}