package ProtoType.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "zhangsan";
        p.deepCloneableTarget = new DeepCloneableTarget("lisi","lisiclass");

//        方式一 使用clone完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//
//        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name="+p.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());


//        方式二 使用反序列化完成
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        System.out.println("p.name="+p.name+" p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name="+p.name+" p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());
    }
}
