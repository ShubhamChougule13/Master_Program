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

    void display() {
        show();
        super.show();
        show();
    }
}

public class L10 {
    public static void main(String[] args) {
        Son s = new Son();
        s.display();
    }
}

//o/p : Son and Father and Son because show() method is overridden in Son class and super.show() will call the show() method of Father class.