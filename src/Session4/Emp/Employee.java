package Session4.Emp;

public class Employee {
    int empID;
    String empName;

    private String SSN;
    protected String empDesig;
    public Employee(int ID, String name){
        empID = ID;
        empName = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setEmpDesig(String empDesig) {
        this.empDesig = empDesig;
    }

    public void display(){
        System.out.println("ID: "+empID);
        System.out.println("Name: "+empName);
        System.out.println("Designation: "+empDesig);
        System.out.println("SSN: "+ SSN);
    }

    public static void main(String[] args){
        Employee objEmp1 = new Employee(1200,"Roger Steven");
        objEmp1.empDesig = "Manager";
        objEmp1.SSN = "123-456-789";
        objEmp1.display();
    }
}
