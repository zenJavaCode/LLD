package strategyDesignPattern.withStrategyPattern.PaymentProcessingSystem.withFactoryDesignPattern;

public class BankTransferPayment implements PaymentStrategy{
    String bankAccountNumber;
    String ifscCode;
    BankTransferPayment(String bankAccountNumber, String ifscCode) {
        this.bankAccountNumber = bankAccountNumber;
        this.ifscCode = ifscCode;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer: " + bankAccountNumber);
    }
}
