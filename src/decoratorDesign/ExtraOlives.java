package decoratorDesign;

public class ExtraOlives extends Toppings{

    BasePizza base;

    ExtraOlives(BasePizza base) {
        this.base = base;
    }

    @Override
    int cost() {
        return base.cost() + 50;
    }
}
