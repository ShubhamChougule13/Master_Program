public class PasswordValidation {
    public static void main(String[] args) { 
        String password = "Java@123"; 
 
        boolean upper = false; 
        boolean lower = false; 
        boolean digit = false; 
        boolean special = false; 
 
        for (int i = 0; i < password.length(); i++) { 
            char ch = password.charAt(i); 
 
            if (ch >= 'A' && ch <= 'Z') 
                upper = true; 
            else if (ch >= 'a' && ch <= 'z') 
                lower = true; 
            else if (ch >= '0' && ch <= '9') 
                digit = true; 
            else 
 
 
                special = true; 
        } 
 
        boolean valid = password.length() >= 8 
                && upper && lower && digit && special; 
 
        System.out.println(valid ? "Password meets basic requirements" 
                                 : "Password does not meet requirements"); 
    }
}
