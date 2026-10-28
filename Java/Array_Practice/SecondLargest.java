public class SecondLargest {
     public static void main(String[] args) { 
 
        int[] arr = {10, 50, 30, 80, 80, 60}; 
 
        Integer largest = null; 
        Integer second = null; 
 
        for (int num : arr) { 
 
            if (largest == null || num > largest) { 
                second = largest; 
                largest = num; 
            } else if (num != largest && 
                    (second == null || num > second)) { 
                second = num; 
            } 
        } 
 
        if (second != null) 
            System.out.println("Second Largest = " + second); 
        else 
            System.out.println("No second distinct value"); 
    }
}
