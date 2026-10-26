import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Java123";
        int attempts = 0;
        boolean loggedIn = false;
        while (attempts < 3) {

            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                loggedIn = true;
                break;
            }
            attempts++;
            System.out.println("Invalid Password");
        }
        if (!loggedIn) {
            System.out.println("Account Locked");
        }
        sc.close();
    }
}