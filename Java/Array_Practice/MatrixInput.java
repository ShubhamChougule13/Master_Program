// Program 27: Accept a 2D array from the user 
import java.util.Scanner; 
 
public class MatrixInput { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        int[][] arr = new int[2][3]; 
 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print("Enter value: "); 
 
                arr[i][j] = sc.nextInt(); 
            } 
        } 
 
        System.out.println("Matrix:"); 
 
        for (int[] row : arr) { 
            for (int num : row) { 
                System.out.print(num + " "); 
            } 
            System.out.println(); 
        } 
 
        sc.close(); 
    } 
} 