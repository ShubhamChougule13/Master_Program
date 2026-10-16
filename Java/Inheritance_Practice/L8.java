class Father {
    void show() {
        System.out.println("Father");
    }

    void display() {
        System.out.println("Father Display");
    }
}

class Son extends Father {
    @Override
    void show() {
        System.out.println("Son");
    }

    void display() {
        System.out.println("Son Display");
    }

    void bike() {
        System.out.println("Son Bike");
    }
}

public class L8 {
    public static void main(String[] args) {
        Father f = new Son();

        f.show();
        f.display();
        f.bike();
    }
}
//o/p : Son and Father Display and compilation error because bike() method is not a member of Father class.