public class SmallestElement {
     public static void main(String[] args) { 
 
        int[] arr = {45, 78, 23, 90, 56}; 
 
        int min = arr[0]; 
 
        for (int num : arr) { 
            if (num < min) { 
 
                min = num; 
            } 
        } 
 
        System.out.println("Smallest = " + min); 
    }
}
