package decoratorDesign;

public class Test {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza margheritaWithCheeze = new ExtraCheeze(margherita);
        BasePizza margheritaWithCheezeWithOlvies = new ExtraOlives(margheritaWithCheeze);
        System.out.println("Margherita cost: " + margherita.cost());
        System.out.println("Margherita with Cheese cost: " + margheritaWithCheeze.cost());
        System.out.println("Margherita with Cheese and Olives cost: " + margheritaWithCheezeWithOlvies.cost());
        BasePizza farmHouse = new Farmhouse();
        BasePizza farmHouseWithCheeze = new ExtraCheeze(farmHouse);
        BasePizza farmHouseWithCheezeWithOlvies = new ExtraOlives(farmHouseWithCheeze);
        System.out.println("Margherita cost: " + farmHouse.cost());
        System.out.println("Margherita with Cheese cost: " + farmHouseWithCheeze.cost());
        System.out.println("Margherita with Cheese and Olives cost: " + farmHouseWithCheezeWithOlvies.cost());
    }
}
