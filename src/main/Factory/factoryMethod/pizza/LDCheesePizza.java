package Factory.factoryMethod.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦胡椒pizza准备原材料");
    }
}
