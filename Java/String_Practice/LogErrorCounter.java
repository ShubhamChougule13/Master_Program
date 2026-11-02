public class LogErrorCounter {
     public static void main(String[] args) { 
 
 
        String log = "INFO Started ERROR Failed INFO Retry ERROR Timeout"; 
        String target = "ERROR"; 
        int count = 0; 
        for (int i = 0; i <= log.length() - target.length(); i++) { 
            boolean match = true; 
            for (int j = 0; j < target.length(); j++) { 
                if (log.charAt(i + j) != target.charAt(j)) { 
                    match = false; 
                    break; 
                } 
            } 
 
            boolean left = i == 0 || log.charAt(i - 1) == ' '; 
            int end = i + target.length(); 
            boolean right = end == log.length() || log.charAt(end) == ' '; 
 
            if (match && left && right) 
                count++; 
        } 
 
        System.out.println("Error count: " + count); 
    }
}
