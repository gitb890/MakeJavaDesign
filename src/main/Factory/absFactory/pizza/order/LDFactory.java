package Factory.absFactory.pizza.order;

import Factory.absFactory.pizza.LDCheesePizza;
import Factory.absFactory.pizza.LDPepperPizza;
import Factory.absFactory.pizza.Pizza;

public class LDFactory implements AbsFactory{
    /**
     * 让工厂类来具体实现
     *
     * @param orderType
     */
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
