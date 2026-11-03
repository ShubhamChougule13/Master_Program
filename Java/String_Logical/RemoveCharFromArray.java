public class RemoveCharFromArray {
    public static void main(String args[]) {
        String s = "Java By Kiran";
        String r[] = s.split("y|i");
        String res = "";
        for (String m : r) {
            res = res + m;
        }
        System.out.println(res);
    }
}
