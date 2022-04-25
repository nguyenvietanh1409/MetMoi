package Session7;

public class PartTimeEmployee extends Employee{
    String shift;
    public PartTimeEmployee(String id,String name,int sal,String shift){
        super(id,name,sal);
        this.shift = shift;
    }
    public void displayDetails(){
        calcCommission(12);
        super.diplayDetails();
        System.out.println("Working shift: "+shift);
    }

}
