package singleton;
//  双重校验
class Singgl{
    private Singgl(){}
//    提供一个双重校验，解决代码同步的问题，同时解决懒加载的问题
//    也保证了效率   在实际开发中会经常使用
private static volatile Singgl instance;
    public static Singgl getInstance(){
        if (instance == null){
            synchronized (Singgl.class){
                if (instance == null){
                    instance = new Singgl();
                }
            }
        }
        return instance;
    }
}
public class DoubleCheck {
    public static void main(String[] args) {
        Singgl singgl =Singgl.getInstance();
        Singgl singgl1 = Singgl.getInstance();
        System.out.println(singgl == singgl1);
        System.out.println("hashcode="+singgl.hashCode());
        System.out.println("singgl1.hashcode="+singgl1.hashCode());
    }
}
