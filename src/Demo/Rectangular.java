package Demo;

public class Rectangular extends Rectangle{
    private double height;

    public Rectangular(){
        super();
        height = 1.0;
    }
    public Rectangular(double height){
        super();
        this.height = height;
    }
    public Rectangular(double height, double length){
        super(length);
        this.height = height;
    }
    public Rectangular(double height, double length, double width){
        super(length,width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height*super.getWidth()*super.getLength();
    }

}


