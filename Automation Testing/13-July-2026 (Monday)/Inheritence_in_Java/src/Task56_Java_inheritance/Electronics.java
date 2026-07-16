package Task56_Java_inheritance;

// Child class - Electronics
public class Electronics extends Product {
    private int warrantyPeriod; // in months

    public Electronics(int productId, String name, double price, int stockQuantity, int warrantyPeriod) {
        super(productId, name, price, stockQuantity, "Electronics");
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double applyDiscount() {
        return price * 0.90; // 10% off electronics
    }
}
