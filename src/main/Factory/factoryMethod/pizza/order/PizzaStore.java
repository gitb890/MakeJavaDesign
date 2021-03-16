package Factory.factoryMethod.pizza.order;


public class PizzaStore {
    public static void main(String[] args) {
        String loc = ("北京");
        if (loc.equals("北京")){
            new BJOrderPizza();
        }else if (loc.equals("伦敦")){
            new LDOrderPizza();
        }
    }
}
