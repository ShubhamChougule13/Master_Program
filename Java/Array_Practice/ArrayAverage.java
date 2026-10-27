public class ArrayAverage {
     public static void main(String[] args) { 
 
        int[] marks = {70, 80, 90, 60, 100}; 
 
        int sum = 0; 
 
        for (int mark : marks) { 
            sum += mark; 
        } 
        double average = (double) sum / marks.length; 
        System.out.println("Average = " + average); 
    }
}
