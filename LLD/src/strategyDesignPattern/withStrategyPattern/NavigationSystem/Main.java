package strategyDesignPattern.withStrategyPattern.NavigationSystem;

public class Main {

    /* TODO You're designing a navigation system for autonomous vehicles.
        The system needs to calculate routes based on different criteria such as shortest distance,
        fastest time, or most fuel-efficient path. How would you use the Strategy pattern to
         implement this functionality?
         Please provide a basic code structure in a language of your choice.*/
    public static void main(String[] args) {

        NavigationSystem navSystem = new NavigationSystem(new RouteStrategyOnShotestDistance());
    navSystem.navigate();

        navSystem.setRouteStrategy(new RouteStrategyOnFastestPath());
        System.out.println(navSystem.navigate());
//        navSystem.setRouteStrategy(new FuelEfficientStrategy());
//        System.out.println(navSystem.navigate("A", "B"));

    }
}
