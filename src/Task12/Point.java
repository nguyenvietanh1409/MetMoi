package Task12;

public class Point {
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance(Point another){
        return Math.sqrt((another.x - this.x)* (another.x - this.x) + (another.y- this.y)*(another.y- this.y));
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }
}
