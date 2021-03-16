package Factory.factoryMethod.pizza.order;

import Factory.factoryMethod.pizza.LDCheesePizza;
import Factory.factoryMethod.pizza.LDPepperPizza;
import Factory.factoryMethod.pizza.Pizza;
//order的工厂子类
public class LDOrderPizza extends Order{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
