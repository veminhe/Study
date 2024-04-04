package parentChildTest;

public class AnimalTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.sleep();
        ani.eat();
        System.out.println(ani.name);
        String str = "aaaa";
        str += "bbb";
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("xxxxxxx");
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("aaaaaa");
    }
}
