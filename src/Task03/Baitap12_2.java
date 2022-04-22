package Task03;

public class Baitap12_2 {
    public static void main(String[] args)
    {
        int loweryear = 999;
        int upperyear = 2010;
        int count = 0;
        int year = loweryear;

        while(year <= upperyear)
        {
            if (year%4==0 && year%100!=0 || year%400==0)
            {
                count++;
            }
            ++year;
        }
        System.out.println("LeapYears: "+ count);
    }
}
