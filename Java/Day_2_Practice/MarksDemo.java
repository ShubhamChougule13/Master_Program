class MarksCalculator {
    int calculateTotal(int java, int sql, int testing) {
        return java + sql + testing;
    }

    double calculateAverage(int total) {
        return total / 3.0;
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        MarksCalculator m = new MarksCalculator();
        int total = m.calculateTotal(80, 75, 90);
        System.out.println("Total: " + total);
        System.out.println("Average: " + m.calculateAverage(total));
    }
}