package w3resource.oop;

public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kutyanev1", "kutyafaj2");
        Dog dog2 = new Dog("Kutyanev1", "kutyafaj2");

        System.out.println("A kutya neve: " + dog1.getName() + " a kutya faja: " + dog1.getName());
        System.out.println("A kutya neve: " + dog2.getName() + " a kutya faja: " + dog2.getName());

        dog1.setBread("kutyafaj3");
        dog1.setName("Kutyanev3");

        System.out.println("A kutya neve: " + dog1.getName() + " a kutya faja: " + dog1.getName());

    }
}
