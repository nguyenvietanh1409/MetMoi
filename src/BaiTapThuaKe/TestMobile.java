package BaiTapThuaKe;

public class TestMobile {
    public static void main(String[] args){
        Mobile m1 = new Mobile(1,"Realme Q2",5000000.0,"Oppo","Android 11");
        System.out.println("Product ID: "+m1.getId());
        System.out.println("Product Name: "+m1.getName());
        System.out.println("Product Price: "+m1.getPrice());
        System.out.println("Product Manufacturer: "+m1.getManufacturer());
        System.out.println("Product OperatingSystem: "+m1.getOperatingSystem());

        Mobile m2 = new Mobile(2,"iPhone 13 Pro Max",23000000.0,"Apple","IOS 15");
        System.out.println("Product ID: "+m1.getId());
        System.out.println("Product Name: "+m1.getName());
        System.out.println("Product Price: "+m1.getPrice());
        System.out.println("Product Manufacturer: "+m1.getManufacturer());
        System.out.println("Product OperatingSystem: "+m1.getOperatingSystem());
    }
}
