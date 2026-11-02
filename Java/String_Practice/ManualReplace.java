public class ManualReplace {
      public static void main(String[] args) { 
        String s = "banana"; 
        char oldChar = 'a'; 
        char newChar = 'o'; 
        String result = ""; 
  
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
 
            if (ch == oldChar) 
                result += newChar; 
            else 
                result += ch; 
        } 
 
        System.out.println(result); 
    }
}
