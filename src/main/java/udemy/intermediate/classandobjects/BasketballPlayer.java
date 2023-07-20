package udemy.intermediate.classandobjects;

import java.util.Random;

public class BasketballPlayer {
    String name;
    String nickname;
    int yearOfBorn;
    String team;
    double freeThrowPercentage;
    double pointPerGame;
    int gamePlayed;

    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowpercentage, double pointPergame, int gamePlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowpercentage;
        this.pointPerGame = pointPergame;
        this.gamePlayed = gamePlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage) {
            System.out.println(name + " failed to score free throw");
        } else {
            System.out.println(name + " scored free throw");
        }
    }
}

