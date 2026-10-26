class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void test() {
         super.display(); // Compilation error
    }
}