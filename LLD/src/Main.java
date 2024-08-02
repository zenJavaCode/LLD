import liscovSubstitutionPrinciple.Bicycle;
import liscovSubstitutionPrinciple.Car;
import liscovSubstitutionPrinciple.MotorCycle;
import liscovSubstitutionPrinciple.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new MotorCycle());
        vehicles.add(new Bicycle()); // now I will face null pointer exception as Bicycle do not have any Engine.
//        for(Vehicle vehicle : vehicles){
//            System.out.println(vehicle.hasEngine().toString());
//        }
    }

    // If we do the downsizing then i Will face problems.

    // TODO for example if i create a vehicle of Bicycle then it do have any engine which will create problems
    // TODO to resolve  this issue we will put only very generic methods which are 100% true for all of their type.
    // Now we put another class in between which we called EngineVehicles
    // which only have vehicles which have engines like car, Bike and so on...
}