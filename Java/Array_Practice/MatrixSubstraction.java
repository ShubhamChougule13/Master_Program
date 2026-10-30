public class MatrixSubstraction {
      public static void main(String[] args) { 
 
        int[][] a = {{50, 40}, {30, 20}}; 
        int[][] b = {{10, 20}, {5, 10}}; 
 
        int[][] result = new int[2][2]; 
 
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                result[i][j] = a[i][j] - b[i][j]; 
            } 
        } 
 
        for (int[] row : result) { 
            for (int num : row) { 
                System.out.print(num + " "); 
            } 
            System.out.println(); 
        } 
    }
}
