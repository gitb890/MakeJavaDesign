package Factory.factoryMethod.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京胡椒pizza准备原材料");
    }
}
