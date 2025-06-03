public class FinalPriceProcessor {
    private double calculateDiscount(double totalPrice) {
        return totalPrice * 0.1;
    }
    
    private void printFinalPrice(Order order) {
        double finalPrice = order.getTotalPrice() - order.getDiscount();
        System.out.println("Final price: " + finalPrice);
    }

    private void applyDiscount(Order order) {
        double totalPrice = order.getTotalPrice();
        if (totalPrice > 100) {
            double discount = calculateDiscount(totalPrice);
            order.setDiscount(discount);
            System.out.println("Discount applied: " + discount);
        } else {
            System.out.println("No discount applied.");
        }
    }

    public void processOrder(Order order) {
        applyDiscount(order);
        printFinalPrice(order);
    }

}

class Order {
    private double totalPrice;
    private double discount;
    
    public Order(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
}