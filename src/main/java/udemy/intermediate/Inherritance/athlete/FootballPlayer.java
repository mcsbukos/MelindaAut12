package udemy.intermediate.Inherritance.athlete;

public class FootballPlayer extends Athlete {

    private int completions;
    private  int passingYards;
    public FootballPlayer(String name, String nickname, int yearOfBorn, String team, int gamePlayed, int completions, int passingYards) {
        super(name, nickname, yearOfBorn, team, gamePlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions: " + completions);
        System.out.println("Passing yards: " + passingYards);
    }
}
