import java.util.Arrays;

public class InsertElement {
      public static void main(String[] args) { 
 
        int[] arr = {10, 20, 30, 40}; 
        int value = 25; 
        int index = 2; 
 
        int[] result = new int[arr.length + 1]; 
 
        for (int i = 0; i < index; i++) { 
            result[i] = arr[i]; 
        } 
 
        result[index] = value; 
 
        for (int i = index; i < arr.length; i++) { 
            result[i + 1] = arr[i]; 
        } 
 
        System.out.println(Arrays.toString(result)); 
    }
}
