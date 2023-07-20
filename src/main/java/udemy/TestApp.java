package udemy;

public class TestApp {
    public static void main(String[] args) {
       Test test = new Test();
        System.out.println(test.getActorName("Tom Cruise"));
        test.displayYearOfBirth(1962);
        System.out.println("The actor's age is: " + test.getAge(1962));
        System.out.println(test.getMovieTitles("\n Top Gun " , "\n  Mission Impossible " ,  "\n  Maverick "));
    }

}
