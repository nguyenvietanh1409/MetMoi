package Task12;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius: "+ cy1.getRadius());
        System.out.println("Height: "+ cy1.getHeight());
        System.out.println("Color: "+ cy1.getColor());
        System.out.println("Area: "+ cy1.getArea());
        System.out.println("Volume: "+ cy1.getVolume());


        Cylinder cy2 = new Cylinder(5.0,2.0);
        System.out.println("Radius: "+ cy2.getRadius());
        System.out.println("Height: "+ cy2.getHeight());
        System.out.println("Color: "+ cy2.getColor());
        System.out.println("Area: "+ cy2.getArea());
        System.out.println("Volume: "+ cy2.getVolume());
    }
}
