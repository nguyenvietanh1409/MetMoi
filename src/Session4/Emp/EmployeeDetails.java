package Session4.Emp;

public class EmployeeDetails {
    public static void main(String[] args){
        Employee objEmp = new Employee(1300,"Clara Smith");
        objEmp.empDesig = "Receptionist";
        objEmp.setSSN("987-654-321");
        objEmp.display();
    }
}
