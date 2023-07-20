package udemy;

public class Test {
   static String getActorName(String actorName){
       return "The actor's name is: " + actorName;
    }
    static void displayYearOfBirth(int birthYear){
        System.out.println("The birth year is: " + birthYear);
    }
    static int getAge(int birthYear){
       return 2023 - birthYear;
    }
    static String getMovieTitles(String movieTile1, String movieTile2, String movieTile3){
       return " The movie titles are: " + movieTile1 + movieTile2 + movieTile3;
    }
}
