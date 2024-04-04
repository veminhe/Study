package parentChildTest;

public class Dog extends Animal{

    String name = "gou";

    Dog(){
        System.out.println("狗对象");
    }

    public void eat(){
        System.out.println("狗在吃");
    }

    public void sleep(){
        System.out.println("睡了6小时");
    }

    public void wangwang(){
        System.out.println("狗在叫");
    }
}
