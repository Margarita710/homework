package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Rita", calculateHighScorePosition(1400));
        displayHighScorePosition("Alex", calculateHighScorePosition(900));
        displayHighScorePosition("Oleg", calculateHighScorePosition(400));
        displayHighScorePosition("Denis", calculateHighScorePosition(50));

        System.out.println(toMilesPerHour(500));
    }
    public static void displayHighScorePosition(String Player, int position) {

        System.out.println(Player +" managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000 ){
            return 1;

        }
        else if(score > 500 && score < 1000 )
            return 2;
        else if(score > 100 && score < 500 )
            return 3;
        else
            return 4;
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }
        else
            return Math.round(kilometersPerHour / 1.609);
    }
}
