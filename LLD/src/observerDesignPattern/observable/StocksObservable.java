package observerDesignPattern.observable;

import java.util.Observer;

public interface StocksObservable {

    public void addObserver(NotificationAlertObserver notificationAlertObserver);

    public void removeObserver(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscriber();

    public void setStockCount(int newStockCount);

    public int getStockCount();


}
