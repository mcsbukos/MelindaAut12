package w3resource.oop;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Maria", 57);
        Person person2 = new Person("Ion", 70);
        System.out.println("The name is: " + person1.getName() + ", and he/she is: " + person1.getAge() + " years old");
        System.out.println("The name is: " + person2.getName() + ", and he/she is: " + person2.getAge() + " years old");

    }



}