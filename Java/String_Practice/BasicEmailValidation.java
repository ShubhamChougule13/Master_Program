public class BasicEmailValidation {
        public static void main(String[] args) { 
        String email = "student@example.com"; 
        int atCount = 0; 
        int atPosition = -1; 
        int dotAfterAt = -1; 
 
        for (int i = 0; i < email.length(); i++) { 
            char ch = email.charAt(i); 
 
            if (ch == '@') { 
                atCount++; 
                atPosition = i; 
            } 
 
            if (ch == '.' && atPosition >= 0) 
                dotAfterAt = i; 
        } 
 
        boolean valid = atCount == 1 
 
 
                && atPosition > 0 
                && dotAfterAt > atPosition + 1 
                && dotAfterAt < email.length() - 1; 
 
        System.out.println(valid ? "Basic structure looks valid" 
                                 : "Invalid basic structure"); 
    }
}
