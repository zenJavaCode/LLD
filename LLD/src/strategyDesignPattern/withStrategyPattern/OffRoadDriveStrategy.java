package strategyDesignPattern.withStrategyPattern;

public class OffRoadDriveStrategy  implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("off road drive strategy is being followed.");
    }
}
