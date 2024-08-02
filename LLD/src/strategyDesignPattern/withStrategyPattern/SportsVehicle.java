package strategyDesignPattern.withStrategyPattern;

public class SportsVehicle extends Vehicle {
    public SportsVehicle( ) {
        super(new SportsDriveStrategy());
    }
}
