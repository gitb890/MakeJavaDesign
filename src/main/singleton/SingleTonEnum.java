package singleton;

public class SingleTonEnum {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.INSTANCE;
        SingleTon singleTon1 =SingleTon.INSTANCE;
        System.out.println(singleTon == singleTon1);
        System.out.println(singleTon.hashCode());
        System.out.println(singleTon1.hashCode());
        singleTon.say();
    }
}

//使用枚举的方式也可以实现单例模式
enum SingleTon{
    INSTANCE;//属性
    public void say(){
        System.out.println("yeyeye");
    }
}
