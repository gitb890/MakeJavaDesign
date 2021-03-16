package singleton;

/*懒汉式（线程安全）
* 使用synchronized加锁的方式保证线程的安全
* 在使用的时候效率会很低，每个线程在想获得类的实例的时候，执行getInstance()方法都要进行同步，这样的同步效率太低。其实只需要一次实例，然后后面直接调用即可
* *** 实际开发时推荐使用 **** */
class Singles{
private static Singles instance;
private Singles(){}
//    提供一个静态的公有方法，当使用到该方法时，才去创建instance,并使用synchronized加锁，防止插队，保证线程的安全
public static synchronized Singles getInstance(){
        if (instance == null){
        instance = new Singles();
        }
        return instance;
        }

}


public class LazyManSafe {
    public static void main(String[] args) {
        Singles single = Singles.getInstance();
        Singles single1 = Singles.getInstance();
        System.out.println(single1 == single);
        System.out.println("single1.hashcode="+single1.hashCode());
        System.out.println("single.hashcode="+single.hashCode());
    }
}
//run:true
//singleton.hashcode=1956725890
//singleton1.hashcode=1956725890
