package BaiTapThuaKe;

public class TestComputerCase {
    public static void main(String[] args){
        ComputerCase cc1 = new ComputerCase(1,
                "GVN Neon S",
                30490000,
                "GIGABYTE B660M AORUS PRO AX DDR4",
                "Intel Core i5 12600KF / 3.7GHz Turbo 4.9GHz / 10 Nhân 16 Luồng / 20MB / LGA 1700",
                "PALIT GeForce RTX 3060 Dual 12GB (LHR)",
                512.0F,32,"XIGMATEK LUX M 3FR (3 fan RGB)");
        System.out.println("Computer ID: "+ cc1.getId());
        System.out.println("Computer Name: "+ cc1.getName());
        System.out.println("Computer Price: "+ cc1.getPrice());
        System.out.println("Computer Main: "+ cc1.getMain());
        System.out.println("Computer CPU: "+ cc1.getCPU());
        System.out.println("Computer VGA: "+ cc1.getVGA());
        System.out.println("Computer SSD: "+ cc1.getSSD());
        System.out.println("Computer RAM: "+ cc1.getRAM());
        System.out.println("Computer Case: "+ cc1.getCase());

        ComputerCase cc2 = new ComputerCase(2,
                "GVN Ghost S",
                21490000,
                "ASUS TUF GAMING B560M-PLUS WIFI",
                "Intel Core i5 11400F / 12MB / 4.4GHZ / 6 nhân 12 luồng / LGA 1200",
                "ASUS Dual GeForce RTX 2060 OC EVO 6GB GDDR6",
                512.0F,32,"MSI MAG FORGE 110R (3 fan ARGB)");
        System.out.println("Computer ID: "+ cc2.getId());
        System.out.println("Computer Name: "+ cc2.getName());
        System.out.println("Computer Price: "+ cc2.getPrice());
        System.out.println("Computer Main: "+ cc2.getMain());
        System.out.println("Computer CPU: "+ cc2.getCPU());
        System.out.println("Computer VGA: "+ cc2.getVGA());
        System.out.println("Computer SSD: "+ cc2.getSSD());
        System.out.println("Computer RAM: "+ cc2.getRAM());
        System.out.println("Computer Case: "+ cc2.getCase());

    }
}
