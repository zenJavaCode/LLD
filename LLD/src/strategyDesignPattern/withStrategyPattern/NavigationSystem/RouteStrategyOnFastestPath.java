package strategyDesignPattern.withStrategyPattern.NavigationSystem;

public class RouteStrategyOnFastestPath implements RouteStrategy {
    @Override
    public String path() {
        return "fastest path.";
    }
}
