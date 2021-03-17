package ProtoType.improve;


public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",3,"黑色");
        sheep.frined = new Sheep("jack",3,"gg");
//        使用原型模式克隆
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();

        System.out.println("sheep1 = "+sheep1+"sheep1.friend="+sheep1.frined.clone());
        System.out.println("sheep2 = "+sheep2+"sheep2.friend="+sheep2.frined.clone());
        System.out.println("sheep3 = "+sheep3+"sheep3.friend="+sheep3.frined.clone());
        System.out.println("sheep4 = "+sheep4+"sheep4.friend="+sheep4.frined.clone());
    }
}
