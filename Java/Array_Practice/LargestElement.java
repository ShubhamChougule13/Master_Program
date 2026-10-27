public class LargestElement {
      public static void main(String[] args) { 
 
        int[] arr = {45, 78, 23, 90, 56}; 
 
        int max = arr[0]; 
 
        for (int num : arr) { 
            if (num > max) { 
                max = num; 
            } 
        } 
 
        System.out.println("Largest = " + max); 
    }
}
