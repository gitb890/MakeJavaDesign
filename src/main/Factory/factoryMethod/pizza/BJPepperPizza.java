package Factory.factoryMethod.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京奶酪pizza准备原材料");
    }
}
