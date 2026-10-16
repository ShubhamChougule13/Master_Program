class Car {
    String brand;
    String model;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Hyundai";
        c.model = "i20";
        c.speed = 80;
        c.display();
    }
}