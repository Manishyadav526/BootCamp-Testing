package Task57_Java_OverloadingOverriding;

public class ProductSearch {

    // Search by keyword only
    public void search(String keyword) {
        System.out.println("Searching for: " + keyword);
    }

    // Search by keyword and category
    public void search(String keyword, String category) {
        System.out.println("Searching for: " + keyword + " in category: " + category);
    }

    // Search by keyword within a price range
    public void search(String keyword, double minPrice, double maxPrice) {
        System.out.println("Searching for: " + keyword +
                " between ₹" + minPrice + " and ₹" + maxPrice);
    }

    // Search by category, price range and sort order
    public void search(String category, double minPrice, double maxPrice, String sortBy) {
        System.out.println("Searching category: " + category +
                " between ₹" + minPrice + " and ₹" + maxPrice +
                ", sorted by: " + sortBy);
    }

    public static void main(String[] args) {
        ProductSearch ps = new ProductSearch();
        ps.search("Laptop");
        ps.search("Laptop", "Electronics");
        ps.search("Laptop", 30000, 80000);
        ps.search("Electronics", 1000, 50000, "Price: Low to High");
    }
}
