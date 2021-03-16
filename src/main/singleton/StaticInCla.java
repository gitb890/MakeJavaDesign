package singleton;

//使用静态内部类去实现单例模式   使用内部类的延迟加载方式提高了实例化效率，也保证了安全性

//静态内部类的特点，外部类的装载不会影响内部类的初始化和方法，从而保证了他的懒加载
class SingL{
    //私有化构造器
    private SingL(){}
    private static volatile Singgl instance;
//    写一个静态内部类，在该类中有一个静态属性的方法
    private static  class SingLInstance{
        private static final SingL INSTANCE = new SingL();
//        这里使用jvm的类装载机制（class loading）保护线程安全；这里会保护类的初始化线程安全
}
//提供一个静态的公有方法，直接返回内部类的调用
    public static synchronized SingL getInstance(){
        return SingLInstance.INSTANCE;
    }
}


public class StaticInCla {
    public static void main(String[] args) {
        SingL singgl =SingL.getInstance();
        SingL singgl1 = SingL.getInstance();
        System.out.println(singgl == singgl1);
        System.out.println("hashcode="+singgl.hashCode());
        System.out.println("singgl1.hashcode="+singgl1.hashCode());
    }
}
