package strategyDesignPattern.withStrategyPattern.PaymentProcessingSystem.withFactoryDesignPattern;

public class PayPalPayment implements PaymentStrategy{

    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
