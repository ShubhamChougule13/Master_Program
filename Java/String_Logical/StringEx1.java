import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StringEx1 {
    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        // BufferedReader stream with the InputStreamReader stream for
        BufferedReader br = new BufferedReader(r);
        // reading the line by line data from the keyboard.

        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Welcome " + name);
    }
}
