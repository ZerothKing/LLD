package observerDesign;

public class MobileObserverImpl implements DisplayObserver {
    WeatherObservable weatherObservable;

    MobileObserverImpl(WeatherObservable weatherObservable){
        this.weatherObservable = weatherObservable;
    }
    @Override
    public void update() {
        System.out.printf("Mobile temp: " + weatherObservable.getCurrentTemp());
    }
}
