package Factory.absFactory.pizza.order;


public class PizzaStore {
    public static void main(String[] args) {
//        new Order(new BJFactory());
        new Order(new LDFactory());
    }
}
