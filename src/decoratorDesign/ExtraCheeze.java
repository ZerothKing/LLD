package decoratorDesign;

public class ExtraCheeze extends Toppings{

    BasePizza base;

    ExtraCheeze(BasePizza base) {
        this.base = base;
    }

    @Override
    int cost() {
        return base.cost() + 100;
    }
}
