package singleton;

/*懒汉式（线程不安全）
* 可以起到lazy loading的作用，但是只能在单线程下使用；
* 如果在多线程的情况下使用，程序会在执行到if循环语句时，还未来得及往下执行，另一个线程也通过这个判断语句生成了新的多个实例；
* *** 在实际开发中不使用这种方式  **** */
class Single{
    private static Single instance;
    private Single(){}
//    提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static Single getInstance(){
        if (instance == null){
            instance = new Single();
        }
        return instance;
    }

}

public class LazyManNotSafe {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        Single single1 = Single.getInstance();
        System.out.println(single1 == single);
        System.out.println("singleton1.hashcode="+single1.hashCode());
        System.out.println("singletons.hashcode="+single.hashCode());
    }
}
//run:true
//singleton.hashcode=1956725890
//singleton1.hashcode=1956725890
