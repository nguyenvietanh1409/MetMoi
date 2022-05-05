package DemoPolymorphism;

public class FullTime extends Staff{
    int month;
   long salary;

    public FullTime(String name, int age, int month, long salary){
        super(name,age);
        this.month = month;
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public long getSalary() {
        return salary*month;
    }
    @Override
    public String toString() {
        return "Staff: Full Time\n"+super.toString()+ "\nSalary: "+ salary+"\nSalary per year: "+ getSalary()+"\n===========================";
    }
}
