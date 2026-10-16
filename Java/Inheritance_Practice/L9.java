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
        super.show();
        show();
    }
}

public class L9 {
    public static void main(String[] args) {
        Son s = new Son();
        s.display();
    }
}

//o/p : Father and Son because super.show() will call the show() method of Father class and show() will call the show() method of Son class.