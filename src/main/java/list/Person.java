package list;

public class Person {
    private int order;
    private String id;

    public Person(int order, String id) {
        this.order = order;
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
