package Session4;

public class TestCustomer {
    public static void main(String[] args){
        Customer objCus1 = new Customer();

        objCus1.customerID = 100;
        objCus1.customerName = "Jhon";
        objCus1.customerAddress = "123 Street";
        objCus1.customerAge = 30;

        objCus1.displayCustomerInformation();

    }
}
