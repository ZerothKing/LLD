package strategyDesign;

public class BaseClass {
    PrintStrategy printStrategy;
    String suffix;

    BaseClass(PrintStrategy print, String suffix) {
        this.printStrategy = print;
        this.suffix = suffix;
    }
    String getName() {
        return "baseClass" + printStrategy.getName(suffix);
    }
}
