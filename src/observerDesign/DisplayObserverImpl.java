package observerDesign;

public class DisplayObserverImpl implements DisplayObserver {

    WeatherObservable weatherObservable;
    DisplayObserverImpl(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }
    @Override
    public void update() {
        int temp = weatherObservable.getCurrentTemp();
        System.out.println(temp);
    }
}
