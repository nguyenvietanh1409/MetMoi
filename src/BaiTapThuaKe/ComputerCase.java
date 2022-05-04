package BaiTapThuaKe;

public class ComputerCase extends Product {
    private String main;
    private String CPU;
    private String VGA;
    private float SSD;
    private int RAM;
    private String Case;

    public ComputerCase(int id,String name,double price,String main,String CPU,String VGA,float SSD,int RAM,String Case){
        super(id,name,price);
        this.main = main;
        this.CPU = CPU;
        this.VGA = VGA;
        this.SSD = SSD;
        this.RAM = RAM;
        this.Case = Case;
    }

    public String getMain() {
        return main;
    }

    public String getCPU() {
        return CPU;
    }

    public String getVGA() {
        return VGA;
    }

    public float getSSD() {
        return SSD;
    }

    public int getRAM() {
        return RAM;
    }

    public String getCase() {
        return Case;
    }

}
