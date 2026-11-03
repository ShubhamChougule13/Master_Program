import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner class which reads the int, string and double value
        // as an input
        System.out.println("Enter your rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your fee");
        double fee = sc.nextDouble();
        System.out.println("-------------------");
        System.out.println("Rollno: " + rollno + " \nname: " + name + " \nfee: " + fee);
        sc.close();
    }
}