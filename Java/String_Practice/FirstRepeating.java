public class FirstRepeating {
      public static void main(String[] args) { 
        String s = "programming"; 
 
 
 
        for (int i = 0; i < s.length(); i++) { 
            for (int j = i + 1; j < s.length(); j++) { 
                if (s.charAt(i) == s.charAt(j)) { 
                    System.out.println("First repeating character: " + 
s.charAt(i)); 
                    return; 
                } 
            } 
        } 
 
        System.out.println("No repeating character"); 
    }
}
