package Session4;

public class Rectangle {
    int width;
    int height;

    Rectangle(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Rectangle(int width,int height){
        System.out.println("Parameterized Constructor");
        this.width = width;
        this.height = height;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
