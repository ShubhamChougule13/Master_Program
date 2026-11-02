public class VowelConsonantCount {
       public static void main(String[] args) { 
        String s = "Java Programming"; 
        int vowels = 0, consonants = 0; 
 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
 
            if (ch >= 'A' && ch <= 'Z') 
                ch = (char)(ch + 32); 
 
            if (ch >= 'a' && ch <= 'z') { 
                if (ch == 'a' || ch == 'e' || ch == 'i' 
                        || ch == 'o' || ch == 'u') 
                    vowels++; 
                else 
                    consonants++; 
            } 
        } 
 
 
 
        System.out.println("Vowels: " + vowels); 
        System.out.println("Consonants: " + consonants); 
    }
}
