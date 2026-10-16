class Father {
    int money = 1000;
}

class Son extends Father {
    int bike = 1;
}

public class L3 {
    public static void main(String[] args) {

        Son s = new Son();

        Father f = s;

        System.out.println(f.money);
        System.out.println(f.bike);
    }
}
 // o/p : compilation error because bike is not a member of Father class.