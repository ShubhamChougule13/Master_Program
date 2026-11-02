public class ManualContains {
     public static void main(String[] args) { 
        String text = "Java programming language"; 
        String pattern = "program"; 
        boolean found = false; 
 
        for (int i = 0; i <= text.length() - pattern.length(); i++) { 
            int j = 0; 
 
 
 
            while (j < pattern.length() 
                    && text.charAt(i + j) == pattern.charAt(j)) { 
                j++; 
            } 
  
            if (j == pattern.length()) { 
                found = true; 
                break; 
            } 
        } 
 
        System.out.println(found ? "Pattern found" : "Pattern not found"); 
    }
}
