package Factory.factoryMethod.pizza.order;


import Factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Order {
    //定义一个抽象方法,createPizza，让各个工厂方法自己实现
    abstract Pizza createPizza(String orderType);
    //构造器
    public Order(){
        Pizza pizza = null;

        String orderType;//订购披萨的类型
//        当选择greek，生成一个GreekPizza的对象，如果是cheese同理，当选择其他类型时退出
        do {
            orderType = getType();
            pizza = createPizza(orderType);  //抽象方法，由工厂子类去完成
//            披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

//    写一个方法，获取用户想要选择的类型

    public String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入选择的pizza：");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
