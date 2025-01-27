package observerDesign;

public interface WeatherObservable {

    void add(DisplayObserver obj);
    void remove(DisplayObserver obj);
    void notifySub();
    void setCurrentTemp(int temp);
    int getCurrentTemp();

}
