class Father {
    int money = 1000;
}

class Son extends Father {
    int bike = 1;
}

public class L5 {
    public static void main(String[] args) {

        Son s = new Son();
        Father f = s;

        System.out.println(f.money);
        System.out.println(s.money);
        System.out.println(s.bike);
    }
}

// o/p : 1000 1000 1 because bike is a member of Son class and money is a member of Father class.