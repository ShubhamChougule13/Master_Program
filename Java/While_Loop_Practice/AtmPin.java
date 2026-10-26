import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        int correctPin = 1234;
        int enteredPin;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        enteredPin = sc.nextInt();

        while (attempts < 3) {
            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                break;
            }
            attempts++;
            System.out.println("Wrong PIN");
            if (attempts < 3) {
                System.out.println("Enter your PIN again: ");
                enteredPin = sc.nextInt();
            }
        }
        if (attempts == 3) {
            System.out.println("Card Blocked");
        }

        sc.close();
    }

}
