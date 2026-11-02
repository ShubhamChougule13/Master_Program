public class CompareStrings {
     public static void main(String[] args) { 
        String s1 = "Java"; 
        String s2 = "java"; 
        String s3 = new String("Java"); 
 
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equalsIgnoreCase(s2)); 
        System.out.println(s1 == s3); 
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.compareTo(s2)); 
    }
}
