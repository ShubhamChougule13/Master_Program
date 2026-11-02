public class DigitsOnly {
    public static void main(String[] args) { 
        String s = "123456"; 
        boolean onlyDigits = s.length() > 0; 
 
        for (int i = 0; i < s.length(); i++) { 
            if (s.charAt(i) < '0' || s.charAt(i) > '9') { 
 
 
                onlyDigits = false; 
                break; 
            } 
        } 
 
        System.out.println(onlyDigits ? "Digits only" : "Contains non digits"); 
    }
}
