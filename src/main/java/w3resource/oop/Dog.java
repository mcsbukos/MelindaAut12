package w3resource.oop;

public class Dog {
    private String name;
    private String bread;

    public Dog(String name, String bread){
        this.name=name;
        this.bread=bread;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
