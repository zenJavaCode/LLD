package strategyDesignPattern.withStrategyPattern;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {

        System.out.println("sports Drive Strategy.");
    }
}
