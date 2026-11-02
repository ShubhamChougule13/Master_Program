public class RemoveDuplicates {
     public static void main(String[] args) { 
        String s = "programming"; 
        String result = ""; 
 
        for (int i = 0; i < s.length(); i++) { 
            boolean found = false; 
  
            for (int j = 0; j < result.length(); j++) { 
                if (s.charAt(i) == result.charAt(j)) { 
                    found = true; 
                    break; 
                } 
            } 
 
            if (!found) 
                result = result + s.charAt(i); 
        } 
 
        System.out.println(result); 
    }
}
