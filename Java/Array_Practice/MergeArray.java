import java.util.Arrays;

public class MergeArray {
    
     public static void main(String[] args) { 
 
        int[] a = {10, 20, 30}; 
        int[] b = {40, 50, 60}; 
 
        int[] result = new int[a.length + b.length]; 
 
        for (int i = 0; i < a.length; i++) { 
            result[i] = a[i]; 
        } 
 
        for (int i = 0; i < b.length; i++) { 
            result[a.length + i] = b[i]; 
        } 
 
        System.out.println(Arrays.toString(result)); 
    }
}
