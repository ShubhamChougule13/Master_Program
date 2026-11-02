public class AnagramCheck {
     public static void main(String[] args) { 
        String a = "listen"; 
        String b = "silent"; 
 
        if (a.length() != b.length()) { 
            System.out.println("Not anagrams"); 
            return; 
        } 
 
        boolean[] used = new boolean[b.length()]; 
        boolean anagram = true; 
 
 
 
        for (int i = 0; i < a.length(); i++) { 
            boolean found = false; 
 
            for (int j = 0; j < b.length(); j++) { 
                if (!used[j] && a.charAt(i) == b.charAt(j)) { 
                    used[j] = true; 
                    found = true; 
                    break; 
                } 
            } 
 
            if (!found) { 
                anagram = false; 
                break; 
            } 
        } 
 
        System.out.println(anagram ? "Anagrams" : "Not anagrams"); 
    }
}
