package Task03;

import java.util.Scanner;
public class Baitap8_2 {
    public static void main(String[] args)
    {
        double radius, height, surfaceArea, baseArea, volume, PI;
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = ip.nextFloat();
        System.out.println("Enter Height: ");
        height = ip.nextFloat();
        ip.close();
        PI = 3.14159265;
        surfaceArea = 2*PI*radius*height;
        baseArea = surfaceArea + 2*PI*radius*radius*radius;
        volume =  PI*radius*radius*height;
        System.out.print("SurfaceArea = ");
        System.out.println(surfaceArea);
        System.out.print("BaseArea = ");
        System.out.println(baseArea);
        System.out.print("Volume = ");
        System.out.println(volume);
    }
}
