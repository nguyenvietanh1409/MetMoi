package Demo;

public class TestRectangular {
    public static void main(String[] args){
        Rectangular rec1 = new Rectangular();
        System.out.println("Width: "+ rec1.getWidth());
        System.out.println("Length: "+ rec1.getLength());
        System.out.println("Height: "+ rec1.getHeight());
        System.out.println("Area: "+ rec1.getArea());
        System.out.println("Volume: "+ rec1.getVolume());

        Rectangular rec2 = new Rectangular(5.0,8.0,7.0);
        System.out.println("Width: "+ rec2.getWidth());
        System.out.println("Length: "+ rec2.getLength());
        System.out.println("Height: "+ rec2.getHeight());
        System.out.println("Area: "+ rec2.getArea());
        System.out.println("Volume: "+ rec2.getVolume());
    }
}
