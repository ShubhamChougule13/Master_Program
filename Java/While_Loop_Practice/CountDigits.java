public class CountDigits {
     public static void main(String[] args) { 
        int num = 0123456; 
 
        int count = 0; 
        while (num != 0) { 
            count++; 
            num /= 10; 
        } 
        System.out.println("Total Digits: " + count); 
    }
}
