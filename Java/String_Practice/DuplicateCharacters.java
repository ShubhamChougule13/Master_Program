public class DuplicateCharacters {
     public static void main(String[] args) { 
        String s = "programming"; 
 
        for (int i = 0; i < s.length(); i++) { 
            boolean repeatedEarlier = false; 
  
            for (int k = 0; k < i; k++) { 
                if (s.charAt(i) == s.charAt(k)) { 
                    repeatedEarlier = true; 
                    break; 
                } 
            } 
 
            if (repeatedEarlier) 
                continue; 
 
            int count = 0; 
 
            for (int j = 0; j < s.length(); j++) { 
 
 
                if (s.charAt(i) == s.charAt(j)) 
                    count++; 
            } 
 
            if (count > 1) 
                System.out.println(s.charAt(i) + " occurs " + count + " times"); 
        } 
    }
}
