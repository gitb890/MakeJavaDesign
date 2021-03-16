package Factory.absFactory.pizza.order;

import Factory.absFactory.pizza.BJCheesePizza;
import Factory.absFactory.pizza.BJPepperPizza;
import Factory.absFactory.pizza.Pizza;

/**
 * 工厂子类
 * */
public class BJFactory implements AbsFactory{
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
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
