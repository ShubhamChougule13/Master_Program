public class RowSum {
     public static void main(String[] args) { 
 
        int[][] arr = { 
            {10, 20, 30}, 
            {40, 50, 60}, 
            {70, 80, 90} 
        }; 
 
        for (int i = 0; i < arr.length; i++) { 
 
            int sum = 0; 
 
            for (int j = 0; j < arr[i].length; j++) { 
                sum += arr[i][j]; 
            } 
 
            System.out.println("Row " + i + " = " + sum); 
        } 
    } 
}
