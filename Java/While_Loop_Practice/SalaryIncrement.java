public class SalaryIncrement {
     public static void main(String[] args) { 
        double salary = 30000; 
        int year = 1; 
        while (year <= 5) { 
            salary = salary + salary * 0.10; 
            System.out.println( 
                "Year " + year + 
                " Salary: " + salary 
            ); 
            year++; 
        } 
    }
}
