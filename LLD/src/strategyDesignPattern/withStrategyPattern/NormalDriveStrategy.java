package strategyDesignPattern.withStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("NormalDrive Capabilities");
    }
}
