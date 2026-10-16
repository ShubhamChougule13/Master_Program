class Father {
    int money = 1000;
}

class Son extends Father {
    int bike = 1;
}

public class L2 {
    public static void main(String[] args) {

        Father f = new Father();

        System.out.println(f.money);
        System.out.println(f.bike);
    }
}

// o/p : 1000 phir compilation error because bike is not a member of Father class.