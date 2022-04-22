package Session4;

public class Student {
    int rollNo;
    String name;
    String address;
    float marks;
    public Student(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    public Student(int rNo,String name){
        rollNo = rNo;
        this.name = name;
    }
    public Student(int rollNo,float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public Student(String name,String address){
        this.name = name;
        this.address = address;
    }

    public Student(int rollNo,String name,float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Rollno: "+ rollNo);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args){
        Student objStu = new Student("David","302, Washington Street");
        objStu.display();
    }
}
