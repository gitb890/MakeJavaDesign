package singleton;

//本意想改进上一种方法去同步，但是这种方式不会同步代码与静态调用方式一样
class Singl{
    private Singl(){

    }
    private static Singl singl;

    public static Singl getInstance(){
        if (singl == null){
            synchronized (Singl.class){
                singl = new Singl();
            }
        }
        return singl;
    }
}
//在实际开发中不使用这种方式
public class LazyManyModel {
    public static void main(String[] args) {

        System.out.println(Singl.getInstance().hashCode());
    }
}
