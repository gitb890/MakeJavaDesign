package Factory.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给Greek准备原料");
    }
}
