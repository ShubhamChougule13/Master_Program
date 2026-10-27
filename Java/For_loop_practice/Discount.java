public class Discount {
      public static void main(String[] args) { 
        double[] prices = { 
            500, 1500, 2500, 800, 3000 
        }; 
        for (int i = 0; i < prices.length; i++) { 
            double finalPrice = prices[i]; 
            if (prices[i] > 1000) { 
                finalPrice -= prices[i] * 0.15; 
            } 
            System.out.println( 
                "Final Price: " + finalPrice 
            ); 
        } 
    }
}
