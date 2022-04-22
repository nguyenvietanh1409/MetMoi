package Session4;

public class TestObjectReferences {
    public static void main(String[ ] args){
        Rectangle objRec1 = new Rectangle(10,20);
        Rectangle objRec2;
        objRec2 = objRec1;
        objRec1.displayDimensions();

        objRec2.displayDimensions();
    }
}
