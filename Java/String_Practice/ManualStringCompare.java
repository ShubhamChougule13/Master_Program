public class ManualStringCompare {
      public static void main(String[] args) { 
        String a = "Java"; 
        String b = "Java"; 
        boolean same = true; 
 
        if (a.length() != b.length()) { 
            same = false; 
        } else { 
 
 
            for (int i = 0; i < a.length(); i++) { 
                if (a.charAt(i) != b.charAt(i)) { 
                    same = false; 
                    break; 
                } 
            } 
        } 
 
        System.out.println(same ? "Strings are equal" : "Strings are not equal"); 
    } 
}
