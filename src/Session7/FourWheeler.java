package Session7;

public class FourWheeler extends  Vehicle{
    private boolean powerSteer;
    public FourWheeler(String vID, String vName,int numWheels, boolean pSteer){
        super(vID,vName,numWheels);
        powerSteer = pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no: "+ vehicleNo);
        System.out.println("Vehicle Name: "+ vehicleName);
        System.out.println("Number of Wheels: "+ wheels );
        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }
    public class TestVehicle{
        public static void main(String[] args){
            FourWheeler objFour = new FourWheeler("LA-09 CS-1406","Volkswagen",4,true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
}
