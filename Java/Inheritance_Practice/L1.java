class Father {

    int money = 1000;

}

class Son extends Father {

    int bike = 1;

}

public class L1 {

    public static void main(String[] args) {

        Son s = new Son();

        System.out.println(s.money);

        System.out.println(s.bike);

    }

}