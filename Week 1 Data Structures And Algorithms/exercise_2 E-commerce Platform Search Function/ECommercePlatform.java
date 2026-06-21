package exercise_2;

public class ECommercePlatform {
    public static void main(String[] args) {
        
    	// SAMPLE INPUT FOR TESTING PURPOSES 
        Product[] products = {
            new Product(1, "Pen", "Stationary"),
            new Product(2, "Bat", "Sports"),
            new Product(3, "Shirt", "Apparel"),
            new Product(4, "Book", "Stationary"),
            new Product(5, "Watch", "Accessories")
        };

        // Linear Search Test
        System.out.println("Linear Search:");
        Product foundProduct = SearchAlgorithms.linearSearch(products, "Watch");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Sort products for Binary Search
        SearchAlgorithms.sortProductsByName(products);

        // Binary Search Test
        System.out.println("\nBinary Search:");
        foundProduct = SearchAlgorithms.binarySearch(products, "Bat");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
}
