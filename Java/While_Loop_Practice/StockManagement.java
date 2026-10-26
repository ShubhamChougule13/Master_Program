public class StockManagement { 
    public static void main(String[] args) { 
        int stock = 10; 
        while (stock > 0) { 
            System.out.println("Order Placed"); 
            stock--; 
            System.out.println( 
                "Remaining Stock: " + stock 
            ); 
 
        } 
        System.out.println("Out of Stock"); 
    } 
}