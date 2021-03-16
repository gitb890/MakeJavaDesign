package Factory.absFactory.pizza.order;

import Factory.absFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {

    AbsFactory factory;
/** 构造器*/
    public Order(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;

        do {
            orderType=getType();
            /** 这里的factory可能指向两个工厂子类*/
            pizza = factory.createPizza(orderType);
            if (pizza !=null){
                /**订购成功*/
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
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
