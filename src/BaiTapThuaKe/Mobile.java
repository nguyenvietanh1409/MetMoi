package BaiTapThuaKe;

public class Mobile extends Product{
    private String manufacturer;
    private String operatingSystem;

    public Mobile(){
        super();
        manufacturer = "Empty";
        operatingSystem = "Empty";
    }
    public Mobile(int id,String name,double price, String manufacturer, String operatingSystem){
        super(id,name,price);
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "manufacturer='" + manufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
