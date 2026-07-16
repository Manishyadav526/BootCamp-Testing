package Task56_Java_inheritance;

// Child class - Clothing
public class Clothing extends Product {
    private String size;

    public Clothing(int productId, String name, double price, int stockQuantity, String size) {
        super(productId, name, price, stockQuantity, "Clothing");
        this.size = size;
    }

    @Override
    public double applyDiscount() {
        return price * 0.80; // 20% off clothing
    }
}
