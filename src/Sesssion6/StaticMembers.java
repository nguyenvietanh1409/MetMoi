package Sesssion6;

public class StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;

    static {
        System.out.println("I am a static block");
    }
    public static void staticMethod(){
        System.out.println("I am static method");
    }
    public  void  displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is: "+ staticCounter);
        System.out.println("Instance counter is: "+ instanceCounter);
    }
    public static void main(String[] args ){
        System.out.println("I am the main method");
        StaticMembers.staticMethod();
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();
        StaticMembers objStatic2 = new StaticMembers();
        objStatic2.displayCount();
        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();
    }
}
