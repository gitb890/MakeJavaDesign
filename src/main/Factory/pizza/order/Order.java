package Factory.pizza.order;

import Factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
//    构造器
//    public Order(){
//        Pizza pizza = null;
//
//        String orderType;//订购披萨的类型
////        当选择greek，生成一个GreekPizza的对象，如果是cheese同理，当选择其他类型时退出
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName(" Greek披萨 ");
//            }else if (orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName(" 奶酪披萨 ");
//            }else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨 ");
//            }
////            披萨的制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
    //定义一个简单工厂对象  聚合关系
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    //构造器
    public Order(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入

        this.simpleFactory = simpleFactory;//设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null){
                //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
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
