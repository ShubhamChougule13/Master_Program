public class ElectricityBill {
    public static void main(String[] args) {
        int[] units = { 100, 150, 200, 250, 300 };
        for (int i = 0; i < units.length; i++) {
            int bill = units[i] * 7;
            System.out.println(
                    "Customer " + (i + 1) +
                            " Bill: Rs." + bill);
        }
    }
}
