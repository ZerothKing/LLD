package observerDesign;

public class Test {
    public static void main(String[] args) {
        WeatherObservable observable = new WeatherObservableImpl();
        DisplayObserver observerDisp = new DisplayObserverImpl(observable);
        DisplayObserver observerMobile = new MobileObserverImpl(observable);
        observable.add(observerDisp);
        observable.add(observerMobile);
        observable.setCurrentTemp(31);
    }
}