
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        String input = "JavaByKiran 2021 Java classes ";
        Scanner s = new Scanner(input).useDelimiter("\\s");

        s.close();
        // Scanner class with delimiter. The \s represents whitespace.
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
    }
}
