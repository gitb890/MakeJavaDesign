package Factory.factoryMethod.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪pizza准备原材料");
    }
}
