import java.util.Arrays;

public class RemoveDuplicates {
     public static void main(String[] args) { 
 
        int[] arr = {10, 20, 10, 30, 20, 40}; 
        int[] unique = new int[arr.length]; 
 
        int count = 0; 
 
        for (int i = 0; i < arr.length; i++) { 
 
            boolean found = false; 
 
            for (int j = 0; j < count; j++) { 
 
                if (arr[i] == unique[j]) { 
                    found = true; 
                    break; 
                } 
            } 
 
            if (!found) { 
                unique[count++] = arr[i]; 
            } 
        } 
 
        System.out.println( 
            Arrays.toString(Arrays.copyOf(unique, count)) 
        ); 
    }
}
