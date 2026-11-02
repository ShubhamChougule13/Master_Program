public class SplitJoin {
     public static void main(String[] args) { 
        String sentence = "Java Python SQL"; 
 
        String[] words = sentence.split(" "); 
 
        for (String word : words) { 
            System.out.println(word); 
        } 
 
        System.out.println(String.join("-", words)); 
 
 
    }
}
