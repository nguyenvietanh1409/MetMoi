package DemoTinhKeThua;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }
    public Rectangle(double length){
        this.length = length;
        width = 1.0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
