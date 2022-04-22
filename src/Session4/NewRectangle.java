package Session4;

public class NewRectangle {
    private int width;
    private int height;
    public NewRectangle(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height=10;
    }

    public NewRectangle(int width, int height){
        this.width = width;
        this. height = height;
    }
    public void display(){
        System.out.println("Width: "+ width);
        System.out.println("Height: "+ height);
    }

}
