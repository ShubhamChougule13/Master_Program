package com.array;

public class Main {

	public static void main(String[] args) {
		 Product[] products = { 
		            new Product(1, "Laptop", 55000, 15), 
		            new Product(2, "Mouse", 500, 5), 
		            new Product(3, "Keyboard", 1200, 8), 
		            new Product(4, "Monitor", 12000, 20) 
		        }; 
		 
		        System.out.println("Low Stock Products:"); 
		 
		        for (Product p : products) { 
		            if (p.quantity < 10) { 
		                System.out.println( 
		                    p.name + " - Stock: " + p.quantity 
		                ); 
		            } 
		        }
	}

}
