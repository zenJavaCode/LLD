package strategyDesignPattern.withStrategyPattern.NavigationSystem;

public class NavigationSystem {
    private RouteStrategy routeStrategy;

    public NavigationSystem(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy strategy){
        this.routeStrategy = strategy;
    }

    public String navigate() {
        return routeStrategy.path();
    }
}
