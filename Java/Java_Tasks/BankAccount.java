
class BankAccount {

    long accountNumber;
    String accountHolderName;
    double balance;
    boolean accountStatus;

    BankAccount(long accountNumber, String accountHolderName,
                double balance, boolean accountStatus) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Account Status: "
                + (accountStatus ? "Active" : "Inactive"));
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
            123456789012L, "Shubham", 25000.50, true
        );

        BankAccount account2 = new BankAccount(
            987654321012L, "Rahul", 15000.00, false
        );

        System.out.println("===== ACCOUNT 1 =====");
        account1.displayDetails();

        System.out.println("===== ACCOUNT 2 =====");
        account2.displayDetails();
    }
}
