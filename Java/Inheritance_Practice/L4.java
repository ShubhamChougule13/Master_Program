class Father {
    int money = 1000;
}

class Son extends Father {
    int bike = 1;
}

public class L4 {
    public static void main(String[] args) {

        Son s = new Son();
        Father f = s;

        System.out.println(s.bike);
        System.out.println(f.money);
    }
}
//op: 1 and 1000 because bike is a member of Son class and money is a member of Father class.