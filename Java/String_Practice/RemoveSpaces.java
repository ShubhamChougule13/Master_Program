public class RemoveSpaces {
      public static void main(String[] args) { 
        String s = "Java is easy"; 
        String result = ""; 
 
 
 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
 
            if (ch != ' ' && ch != '\t') { 
                result = result + ch; 
            } 
        } 
 
        System.out.println(result); 
    }
}
