package Factory.absFactory.pizza.order;

import Factory.absFactory.pizza.Pizza;

//抽象工厂模式的抽象层
public interface AbsFactory {

    /**让工厂类来具体实现*/
    public Pizza createPizza(String orderType);
}
