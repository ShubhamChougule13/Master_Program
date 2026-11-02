public class NameInitials {
    public static void main(String[] args) { 
        String name = "Rahul Shankar Patil"; 
        boolean startOfWord = true; 
 
        for (int i = 0; i < name.length(); i++) { 
            char ch = name.charAt(i); 
 
            if (ch == ' ') { 
                startOfWord = true; 
            } else { 
                if (startOfWord) 
                    System.out.print(ch + "."); 
 
                startOfWord = false; 
            } 
        } 
    } 
}
