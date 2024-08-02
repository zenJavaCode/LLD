package strategyDesignPattern.withStrategyPattern;

public class PassengerVehicle extends Vehicle      {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
