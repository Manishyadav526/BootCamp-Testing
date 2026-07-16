package Task56_Java_inheritance;

// Parent class
public class Product {
    protected int productId;
    protected String name;
    protected double price;
    protected int stockQuantity;
    protected String category;

    public Product(int productId, String name, double price, int stockQuantity, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    public double applyDiscount() {
        return price; // no discount by default
    }

    public void displayInfo() {
        System.out.println(name + " (" + category + ") - Price after discount: " + applyDiscount());
    }
}
