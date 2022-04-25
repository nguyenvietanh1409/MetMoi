package Task8;

public class ClassRoom {
    private int classID;
    private String className;

    public ClassRoom(){
        classID = 0;
        className = "Empty";
    }
    public ClassRoom(int classID, String className){
        this.classID = classID;
        this.className = className;
    }

    public int getClassID() {
        return classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classID=" + classID +
                ", className='" + className + '\'' +
                '}';
    }
}
