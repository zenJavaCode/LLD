package strategyDesignPattern.withStrategyPattern.PaymentProcessingSystem.withFactoryDesignPattern;

public class PaymentProcessingApplication {

    public static void main(String[] args){
        ShoppingCart shoppingCart = new ShoppingCart();

        PaymentStrategy paymentStrategy =  PaymentStrategyFactory.getPaymentStrategy("creditCard","1234-1234-1234-1234","PUNB073800","Piyush Jain");
        shoppingCart.setPaymentStrategy(paymentStrategy);

        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        shoppingCart.checkout(200);
    }
}
