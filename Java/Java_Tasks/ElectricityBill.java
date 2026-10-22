
public class ElectricityBill {

    int getUnits() {
        return 150;
    }

    double calculateBill(int units) {
        if (units < 0) {
            System.out.println("Invalid units!");
            return 0;
        }

        if (units <= 100) {
            return units * 5.0;
        } else {
            return (100 * 5.0) + ((units - 100) * 7.0);
        }
    }

    double calculateTax(double amount) {
        return amount * 5 / 100;  // Sample tax: 5%
    }

    void displayBill() {
        int units = getUnits();

        double billAmount = calculateBill(units);
        double tax = calculateTax(billAmount);
        double totalAmount = billAmount + tax;

        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: Rs. " + billAmount);
        System.out.println("Tax (5%): Rs. " + tax);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.displayBill();
    }
}
