package Session4;

import com.sun.nio.sctp.AbstractNotificationHandler;

class Circle{
    public double getPI(){
        return 3.14;
    }
}
public class PassByRef {
    public void calcAre(Circle objPI,double rad){
        double area = objPI.getPI() * rad *rad;
        System.out.println("Area of the circle is: "+ area);
    }
    public static void main(String[] args){
        PassByRef p1 = new PassByRef();
        p1.calcAre(new Circle(),2);
    }
}
