class Recharge {
    String mobileNumber;
    double rechargeAmount;

    void displayRecharge() {
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Recharge: Rs. " + rechargeAmount);
    }
}

public class RechargeDemo {
    public static void main(String[] args) {
        Recharge r = new Recharge();
        r.mobileNumber = "9876543210";
        r.rechargeAmount = 299;
        r.displayRecharge();
    }
}