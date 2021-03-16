package Factory.factoryMethod.pizza.order;


import Factory.factoryMethod.pizza.BJCheesePizza;
import Factory.factoryMethod.pizza.BJPepperPizza;
import Factory.factoryMethod.pizza.Pizza;

//工厂子类
public class BJOrderPizza extends Order{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
