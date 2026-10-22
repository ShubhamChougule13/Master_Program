
public class Product {

    String productName;
    double price;

    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        totalProducts++;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Keyboard", 1500);
        Product p4 = new Product("Mouse", 800);
        Product p5 = new Product("Headphones", 2500);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
        p5.displayDetails();

        System.out.println("Total Products Created: " + totalProducts);
    }
}
