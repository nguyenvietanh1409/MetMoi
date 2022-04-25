package Session7;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Vehicle(String vID, String vName,int numWheels){
        vehicleNo = vID;
        vehicleName = vName;
        wheels = numWheels;
    }


    public void accelerate(int speed){
        System.out.println("Acclerating at: "+ speed+ " kmph");
    }
}
