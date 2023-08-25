import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private List<CartItem> items;
    private Date orderDate;
    private double totalAmount;

    // Constructor
    public Order(int orderId, List<CartItem> items, Date orderDate) {
        this.orderId = orderId;
        this.items = items;
        this.orderDate = orderDate;
        this.calculateTotalAmount();
    }

    // Getter and Setter for Order ID
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // Getter and Setter for Items
    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
        this.calculateTotalAmount();
    }

    // Getter for Order Date
    public Date getOrderDate() {
        return orderDate;
    }

    // Calculate and Getter for Total Amount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Calculate total amount for the order
    private void calculateTotalAmount() {
        totalAmount = 0.0;
        for (CartItem item : items) {
            totalAmount += item.getTotalPrice();
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", items=" + items +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
