package Session7;

public class Employee {
    String empID;
    String empName;
    int salary;
    float commission;
    public Employee(String empID,String empName,int salary){
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }
    public void calcCommission(float sales){
        if(sales>10000)
            commission = salary*20/100;
        else
            commission = 0;
    }
    public void calcCommission(int overTime){
        if (overTime>8)
            commission = salary/30;
        else
            commission = 0;
    }
    public void diplayDetails(){
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Commission: "+ commission);
    }

}
