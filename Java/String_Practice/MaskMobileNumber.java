public class MaskMobileNumber {
     public static void main(String[] args) { 
        String mobile = "9876543210"; 
 
        if (mobile.length() < 4) { 
            System.out.println("Invalid input"); 
            return; 
        } 
 
        for (int i = 0; i < mobile.length() - 4; i++) 
            System.out.print("*"); 
 
        for (int i = mobile.length() - 4; i < mobile.length(); i++) 
            System.out.print(mobile.charAt(i)); 
 
        System.out.println(); 
    }
}
