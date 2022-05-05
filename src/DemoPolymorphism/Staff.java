package DemoPolymorphism;

public class Staff {
    private String name;
    private int age;
    public Staff(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: "+ getName()+"\nAge: "+ getAge();
    }
}
