class Father {
    int money = 1000;
}

class Son extends Father {
    int money = 500;
}

public class L6 {
    public static void main(String[] args) {
        Son s = new Son();
        Father f = s;

        System.out.println(s.money);
        System.out.println(f.money);
    }
}

// o/p : 500 1000 because money is a member of both Father and Son class. In case of Son object, it will access the money of Son class and in case of Father reference variable, it will access the money of Father class.