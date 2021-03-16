package Factory.factoryMethod.pizza;

//创建一个抽象类
public abstract class Pizza {
    protected String name;  //名字

//    准备原材料，因为披萨名字可能不一样，所以做成一个抽象方法
    public abstract void prepare();

//    以下是制作的加工过程方法
    public  void bake(){
        System.out.println(name+"baking;");
    }
    public void cut(){
        System.out.println(name+"cut;");
    }
    public void box(){
        System.out.println(name+"box;");
    }
    public void setName(String name){
        this.name = name;
    }
}
