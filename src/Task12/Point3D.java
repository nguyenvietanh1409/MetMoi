package Task12;

public class Point3D extends Point2D {
    private int z;
    public Point3D(){
        super();
        this.z = 0;
    }

    public Point3D(int z,int x,int y){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+ getX() + ", "+ getY() + ", "+ getZ()+")";
    }
}
