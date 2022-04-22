package Session4;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;

    void displayEmp(){
        System.out.println("Name: "+ employeeName);
        System.out.println("Age: "+ employeeAge);
        System.out.println("Salary" + employeeSalary);
        System.out.println("Marital Status: "+ maritalStatus);
    }
}
