package BaiTapThuaKe;

public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV(1,"SMART TV Coocaa",6290000.0,"Android",40);
        System.out.println("Product ID: "+tv1.getId());
        System.out.println("Product Name: "+tv1.getName());
        System.out.println("Product Price: "+tv1.getPrice());
        System.out.println("Product OperatingSystem: "+tv1.getOperatingSystem());
        System.out.println("Product Inch: "+tv1.getInch());

        TV tv2 = new TV(1,"Tivi Sony 4K",11360400.0,"Android",43);
        System.out.println("Product ID: "+tv2.getId());
        System.out.println("Product Name: "+tv2.getName());
        System.out.println("Product Price: "+tv2.getPrice());
        System.out.println("Product OperatingSystem: "+tv2.getOperatingSystem());
        System.out.println("Product Inch: "+tv2.getInch());
    }
}
