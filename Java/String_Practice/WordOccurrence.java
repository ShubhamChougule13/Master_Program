public class WordOccurrence {
       public static void main(String[] args) { 
        String text = "Java is easy and Java is powerful"; 
        String word = "Java"; 
        int count = 0; 
 
        for (int i = 0; i <= text.length() - word.length(); i++) { 
            boolean match = true; 
 
            for (int j = 0; j < word.length(); j++) { 
                if (text.charAt(i + j) != word.charAt(j)) { 
                    match = false; 
                    break; 
                } 
            } 
  
            boolean leftBoundary = i == 0 || text.charAt(i - 1) == ' '; 
            int end = i + word.length(); 
            boolean rightBoundary = end == text.length() 
                    || text.charAt(end) == ' '; 
 
 
 
            if (match && leftBoundary && rightBoundary) 
                count++; 
        } 
  
        System.out.println("Occurrences: " + count); 
    } 
}
