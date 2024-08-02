package strategyDesignPattern;

import strategyDesignPattern.withStrategyPattern.OffRoadVehicle;
import strategyDesignPattern.withStrategyPattern.Vehicle;

public class Main {

    // TODO : Why to use Strategy Design Pattern?

        /* TODO :The Strategy Design Pattern is a behavioral design pattern that enables
            selecting an algorithm's behavior at runtime. It's particularly useful when you
            have multiple
            strategies (algorithms or behaviors) that can be swapped seamlessly within a context.
         */



    // TODO : When to Use Strategy DP
        // TODO: when the multiple child having the same code then go for strategy pattern to avoid
    //      the code duplicacy in the project. and that code should not be present in the base.


    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
