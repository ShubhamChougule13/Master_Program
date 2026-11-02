public class FirstNonRepeating {
      public static void main(String[] args) { 
        String s = "swiss"; 
        boolean found = false; 
 
        for (int i = 0; i < s.length(); i++) { 
            int count = 0; 
 
            for (int j = 0; j < s.length(); j++) { 
                if (s.charAt(i) == s.charAt(j)) 
                    count++; 
            } 
 
            if (count == 1) { 
                System.out.println("First non-repeating: " + s.charAt(i)); 
                found = true; 
                break; 
            } 
        } 
 
        if (!found) 
            System.out.println("No non-repeating character"); 
    } 
}
