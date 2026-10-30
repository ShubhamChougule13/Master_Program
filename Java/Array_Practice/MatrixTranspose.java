public class MatrixTranspose {
     public static void main(String[] args) { 
 
        int[][] a = { 
            {1, 2, 3}, 
            {4, 5, 6} 
        }; 
 
        int[][] transpose = new int[3][2]; 
 
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                transpose[j][i] = a[i][j]; 
            } 
        } 
 
        for (int[] row : transpose) { 
 
            for (int num : row) { 
                System.out.print(num + " "); 
            } 
            System.out.println(); 
        } 
    }
}
