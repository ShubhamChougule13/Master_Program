public class PayRoll {
    public static void main(String[] args) {
        double[] salaries = {
                25000, 30000, 35000, 40000, 45000
        };
        for (int i = 0; i < salaries.length; i++) {
            double bonus = salaries[i] * 0.10;
            double finalSalary = salaries[i] + bonus;
            System.out.println(
                    "Employee " + (i + 1) +
                            " Final Salary: " + finalSalary);
        }
    }
}
