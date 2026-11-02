public class SortCharacters {
       public static void main(String[] args) { 
        String s = "dcab"; 
        char[] arr = new char[s.length()]; 
 
        for (int i = 0; i < s.length(); i++) 
            arr[i] = s.charAt(i); 
 
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = 0; j < arr.length - 1 - i; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    char temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
 
 
        } 
 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i]); 
    } 
}
