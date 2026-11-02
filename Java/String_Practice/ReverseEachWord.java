public class ReverseEachWord {
     public static void main(String[] args) { 
        String s = "Java is powerful"; 
        int start = 0; 
 
        for (int i = 0; i <= s.length(); i++) { 
            if (i == s.length() || s.charAt(i) == ' ') { 
                for (int j = i - 1; j >= start; j--) { 
                    System.out.print(s.charAt(j)); 
                } 
 
                if (i < s.length()) 
                    System.out.print(" "); 
 
                start = i + 1; 
 
 
            } 
        } 
    }
}
