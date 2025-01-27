package observerDesign;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservableImpl implements WeatherObservable {

    List<DisplayObserver> objList = new ArrayList<>();
    int temp;

    @Override
    public void add(DisplayObserver obj) {
        objList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        objList.remove(obj);
    }

    @Override
    public void notifySub() {
        for (DisplayObserver displayObserver : objList) {
            displayObserver.update();
        }
    }

    @Override
    public void setCurrentTemp(int temp) {
        this.temp = temp;
        notifySub();
    }

    @Override
    public int getCurrentTemp() {
        return this.temp;
    }
}
