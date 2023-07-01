package udemy.beginner;

public class ImbdApp {
    public static void main(String[] args) {
        String actorName = "Tom Cruise";
        int birthYear = 1962;
        int age = 2023 - 1962;

        String[] movieTitle = {
                "Top Gun", "Jerry Maguire",
                "Mission Impossible II", "The Last Samurai"
        };

        float[] movieRatings = {
                6.9F, 7.3F, 7.8F, 6.1F
        };

        System.out.println("The actor name is: " + actorName);
        System.out.println("The actor's age is: " + age);

        System.out.println("The movies are: ");
        for (int i = 0; i < movieTitle.length; i++) {
            System.out.println(movieTitle[i] + " - " + getRatings(movieRatings[i]));
        }
        ;
    }
        static String getRatings(float rating){
            if (rating <= 5.0) {
                return "bad";
            } else if (rating > 5.0 && rating <= 6.5) {
                return "average";
            } else if (rating > 6.5 && rating <= 7.0) {
                return "good";
            } else if (rating > 7.0 && rating <= 8.0) {
                return "very good";
            } else {
                return "amazing";
            }

        }
    }
