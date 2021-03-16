package Factory.pizza.order;

import Factory.pizza.CheesePizza;
import Factory.pizza.GreekPizza;
import Factory.pizza.Pizza;
import Factory.pizza.PepperPizza;

public class SimpleFactory {
//    根据orderType返回对应的pizza对象
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greak披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese披萨");
        }else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("pepper披萨");
        }
        return pizza;
    }

//    静态工厂
public static Pizza createPizza2(String orderType){
    System.out.println("使用简单工厂模式");

    Pizza pizza = null;
    if (orderType.equals("greek")){
        pizza = new GreekPizza();
        pizza.setName("greak披萨");
    }else if (orderType.equals("cheese")){
        pizza = new CheesePizza();
        pizza.setName("cheese披萨");
    }else if (orderType.equals("pepper")){
        pizza = new PepperPizza();
        pizza.setName("pepper披萨");
    }
    return pizza;
}
}
