package strategyDesign;

public class Test {
    public static void main(String[] args) {
        PrintStrategy print = new PrintStrategyChildImpl();
        BaseClass base = new BaseClass(print, "");
        ChildClass1 child1 = new ChildClass1(print, "1");
        ChildClass2 child2 = new ChildClass2(print, "2");
        System.out.println(base.getName());
        System.out.println(child1.getName());
        System.out.println(child2.getName());
    }
}
