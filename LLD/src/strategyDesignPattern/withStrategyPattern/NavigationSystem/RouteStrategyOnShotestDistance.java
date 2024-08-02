package strategyDesignPattern.withStrategyPattern.NavigationSystem;

public class RouteStrategyOnShotestDistance implements RouteStrategy{
    @Override
    public String path() {
        return "shortest path is returned.";
    }
}
