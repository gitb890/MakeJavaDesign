package singleton;

/*饿汉式（静态变量）
优点：在类装载的时候就完成了实例化，避免了线程同步的问题
缺点：因为在类装载的时候就完成了实例化，不能达到Lazy Loading的效果，如果从一开始就没有使用这个实例，则会造成内存浪费
这种方式基于classloader机制（类加载）避免了线程同步的问题，但instance因为在类加载的时候就实例化，在单例模式中大部分都调用的是getInstance方法
导致了类加载的情况有多种，这个时候就没有达到Lazy Loading的效果*/
class Singletons{

    //    1.构造器私有化,
    private Singletons(){

    }
    //    2.在本类内部创建对象实例
    private final static Singletons instance =new Singletons();
    //    3.返回实例
    public static Singletons getInstance(){
        return instance;
    }
}




public class BeanTest {
    public static void main(String[] args) {
        Singletons singleton = Singletons.getInstance();
        Singletons singleton1 = Singletons.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println("singleton.hashcode="+singleton.hashCode());
        System.out.println("singleton1.hashcode="+singleton1.hashCode());
    }
}
//run:true
//singleton.hashcode=1956725890
//singleton1.hashcode=1956725890


