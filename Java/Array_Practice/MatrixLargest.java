public class MatrixLargest {
      public static void main(String[] args) { 
 
        int[][] arr = { 
            {10, 50, 30}, 
            {80, 20, 60} 
 
        }; 
 
        int max = arr[0][0]; 
 
        for (int[] row : arr) { 
            for (int num : row) { 
                if (num > max) { 
                    max = num; 
                } 
            } 
        } 
 
        System.out.println("Largest = " + max); 
    } 
}
