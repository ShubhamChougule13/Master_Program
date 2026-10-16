class Father {
    void show() {
        System.out.println("Father");
    }
}

class Son extends Father {
    @Override
    void show() {
        System.out.println("Son");
    }
}

public class L7 {
    public static void main(String[] args) {
        Son s = new Son();
        Father f = s;

        s.show();
        f.show();
    }
}

// o/p : Son and Son because show() method is overridden in Son class.