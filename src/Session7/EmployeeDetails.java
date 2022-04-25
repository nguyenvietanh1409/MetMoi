package Session7;

public class EmployeeDetails{
    public static void main(String[] args){
        Employee objEmp = new Employee("E001","Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.diplayDetails();
        System.out.println("------------------------");
        Employee objEmp1 = new PartTimeEmployee("E002","Rob Smith",30000,"Day");
        objEmp1.diplayDetails();
    }
}