package BaiTapThuaKe;

public class TV extends Product{
    private String operatingSystem;
    private float inch;
    public TV(){
        super();
        operatingSystem = "None";
        inch = 0;
    }
    public TV(int id,String name,double price, String operatingSystem,float inch){
        super(id,name,price);
        this.operatingSystem = operatingSystem;
        this.inch = inch;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public float getInch() {
        return inch;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setInch(float inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "TV{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", inch=" + inch +
                '}';
    }
}
