public class LongestWord {
     public static void main(String[] args) { 
        String s = "Java programming is interesting"; 
        int start = 0; 
        int maxLength = 0; 
 
 
        int bestStart = 0; 
 
        for (int i = 0; i <= s.length(); i++) { 
            if (i == s.length() || s.charAt(i) == ' ') { 
                int length = i - start; 
  
                if (length > maxLength) { 
                    maxLength = length; 
                    bestStart = start; 
                } 
 
                start = i + 1; 
            } 
        } 
 
        System.out.print("Longest word: "); 
 
        for (int i = bestStart; i < bestStart + maxLength; i++) 
            System.out.print(s.charAt(i)); 
 
        System.out.println("\nLength: " + maxLength); 
    }
}
