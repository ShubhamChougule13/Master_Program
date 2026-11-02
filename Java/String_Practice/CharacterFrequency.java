public class CharacterFrequency {
      public static void main(String[] args) { 
        String s = "banana"; 
 
        for (int i = 0; i < s.length(); i++) { 
            boolean alreadyCounted = false; 
 
            for (int k = 0; k < i; k++) { 
                if (s.charAt(i) == s.charAt(k)) { 
                    alreadyCounted = true; 
                    break; 
                } 
            } 
 
            if (!alreadyCounted) { 
                int count = 0; 
 
 
 
                for (int j = 0; j < s.length(); j++) { 
                    if (s.charAt(i) == s.charAt(j)) 
                        count++; 
                } 
 
                System.out.println(s.charAt(i) + " = " + count); 
            } 
        } 
    }
}
