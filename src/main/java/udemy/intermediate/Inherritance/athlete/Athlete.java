package udemy.intermediate.Inherritance.athlete;

public class Athlete {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int gamePlayed;

    public Athlete(String name, String nickname, int yearOfBorn, String team, int gamePlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamePlayed = gamePlayed;
    }
    public String getName(){
        return name;
    }
    public void getBio(){
        System.out.println(name + " (" + nickname + " )");
        System.out.println("born in " + yearOfBorn);
        System.out.println("last team is: " + team + " and played " + gamePlayed + " games");
    }
}
