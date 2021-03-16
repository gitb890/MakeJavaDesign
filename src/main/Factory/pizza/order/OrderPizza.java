package Factory.pizza.order;

import Factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    Pizza pizza = null;
    String orderType = "";
    //构造器
    public OrderPizza(){
        do {
            orderType = getType();
            pizza =SimpleFactory.createPizza2(orderType);

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
