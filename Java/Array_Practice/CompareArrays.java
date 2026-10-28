import java.util.Arrays;

public class CompareArrays {
      public static void main(String[] args) { 
 
        int[] a = {10, 20, 30}; 
        int[] b = {10, 20, 30}; 
 
        if (Arrays.equals(a, b)) { 
            System.out.println("Arrays are equal"); 
        } else { 
            System.out.println("Arrays are different"); 
        } 
    } 
}
