package DemoPolymorphism;

public class PartTime extends Staff{
    int time;
    final double salary = 23500;

    public PartTime(String name, int age, int time){
        super(name, age);
        this.time = time;
    }

    public double getSalary(){
        return salary*time;
    }

    @Override
    public String toString() {
        return "Staff: Part Time\n"+super.toString()+ "\nSalary: "+ salary+"\nSalary per month: "+ getSalary()+"\n===========================";
    }
}
