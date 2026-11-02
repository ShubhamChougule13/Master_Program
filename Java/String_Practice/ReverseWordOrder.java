public class ReverseWordOrder {
     public static void main(String[] args) { 
        String s = "Java is powerful"; 
        int end = s.length() - 1; 
 
        for (int i = s.length() - 1; i >= 0; i--) { 
            if (s.charAt(i) == ' ' || i == 0) { 
                int start = (i == 0) ? 0 : i + 1; 
 
                for (int j = start; j <= end; j++) { 
                    System.out.print(s.charAt(j)); 
                } 
 
                if (i > 0) 
                    System.out.print(" "); 
 
                end = i - 1; 
            } 
        } 
    }
}
