public class StringOperations {
    public static void main(String[] args) { 
        String s = "Java Programming"; 
 
        System.out.println("Length: " + s.length()); 
        System.out.println("Character: " + s.charAt(2)); 
        System.out.println("Uppercase: " + s.toUpperCase()); 
        System.out.println("Lowercase: " + s.toLowerCase()); 
        System.out.println("Contains Java: " + s.contains("Java")); 
        System.out.println("Starts with Java: " + s.startsWith("Java")); 
        System.out.println("Ends with ing: " + s.endsWith("ing")); 
        System.out.println("Index of a: " + s.indexOf('a')); 
        System.out.println("Last index of a: " + s.lastIndexOf('a')); 
        System.out.println("Substring: " + s.substring(5)); 
        System.out.println("Replace: " + s.replace('a', 'o')); 
    }
}
