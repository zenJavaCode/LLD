package strategyDesignPattern.withStrategyPattern.PaymentProcessingSystem.withFactoryDesignPattern;

public class PaymentStrategyFactory {

    public static PaymentStrategy getPaymentStrategy(String type,String identifier,String ifscCode,String holderName) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(identifier, holderName);
            case "paypal":
                return new PayPalPayment(identifier);
            case "banktransfer":
                return new BankTransferPayment(identifier,ifscCode);
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }
}
