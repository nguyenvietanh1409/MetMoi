package Task8;

public class Student {
    private int rollNo;
    private String name;
    private ClassRoom myClass;

    public Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(int rollNo,String name, ClassRoom myClass){
        this.rollNo = rollNo;
        this.name = name;
        this.myClass = myClass;
    }

    @Override
    public String toString() {
        return "Rollno: "+rollNo+", Name: "+ name+", Class ID: "+myClass.getClassID()+", Class name: "+myClass.getClassName();
    }
}
