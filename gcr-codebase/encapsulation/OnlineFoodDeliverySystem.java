abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double serviceCharge = 50;
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        VegItem veg = new VegItem("Paneer Pizza", 200, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Burger", 150, 3);

        System.out.println("Veg Item Details:");
        veg.displayItemDetails();
        System.out.println("Total Price: " + veg.calculateTotalPrice());

        System.out.println();

        System.out.println("Non-Veg Item Details:");
        nonVeg.displayItemDetails();
        System.out.println("Total Price: " + nonVeg.calculateTotalPrice());
    }
}