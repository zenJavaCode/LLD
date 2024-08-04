package observerDesignPattern.observable;


import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();

    public int stockCount = 0;
    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
observerList.add(notificationAlertObserver);
    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {


        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {

        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount = stockCount + newStockCount;
    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
