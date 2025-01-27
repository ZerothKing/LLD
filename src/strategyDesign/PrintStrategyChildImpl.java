package strategyDesign;

public class PrintStrategyChildImpl implements PrintStrategy {
    @Override
    public String getName(String suffix) {
        return suffix;
    }
}
