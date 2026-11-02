public class WordCount {
     public static void main(String[] args) { 
        String s = "  Java is easy to learn  "; 
        int words = 0; 
        boolean insideWord = false; 
 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
 
            if (ch != ' ' && ch != '\t' && ch != '\n') { 
                if (!insideWord) { 
                    words++; 
                    insideWord = true; 
                } 
            } else { 
                insideWord = false; 
            } 
        } 
 
        System.out.println("Word count: " + words); 
    } 
}
