import java.util.Scanner;

public class ArrayInput {
     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        int[] numbers = new int[5]; 
        for (int i = 0; i < numbers.length; i++) { 
            System.out.print("Enter number: "); 
            numbers[i] = sc.nextInt(); 
        } 
 
        System.out.println("Array Elements:"); 
        for (int num : numbers) { 
            System.out.println(num); 
        } 
        sc.close(); 
    }
}
