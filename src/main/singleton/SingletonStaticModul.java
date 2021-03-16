package singleton;

/*饿汉式（静态代码块）
* 这种方式和静态变量的方式类似，优缺点也相同*/
class Singleton1{
    private Singleton1(){

    }
//    在本类内部创建对象实例
    private static Singleton1 instance;
//    静态代码块创建实例对象
    static {
        instance = new Singleton1();
    }
    public static Singleton1 getInstance(){
        return instance;
    }
}

public class SingletonStaticModul {
    public static void main(String[] args) {
        Singleton1 singletons = Singleton1.getInstance();
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1 == singletons);
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
        System.out.println("singletons.hashcode="+singletons.hashCode());
    }
}
//run:true
//singleton.hashcode=1956725890
//singleton1.hashcode=1956725890
