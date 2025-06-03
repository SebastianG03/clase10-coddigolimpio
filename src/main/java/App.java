public class App {
    public static void main(String[] args) {
        Order order = new Order(150.0);
        FinalPriceProcessor finalPriceProcessor = new FinalPriceProcessor();
        finalPriceProcessor.processOrder(order);
    }
}