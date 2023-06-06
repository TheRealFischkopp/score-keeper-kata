package com.example;

public class ScoreKeeper {

    private int scoreA = 0;
    private int scoreB = 0;


    void scoreTeamA1() {
        scoreA ++;
    }
    void scoreTeamA2(){
        scoreA += 2;
    }
    void scoreTeamA3(){
        scoreA += 3;
    }
    void scoreTeamB1(){
        scoreB++;
    }
    void scoreTeamB2(){
        scoreB += 2;
    }
    void scoreTeamB3(){
        scoreB += 3;
    }
    String getScore(){
    return String.format("%03d", scoreA)
            .concat(":")
            .concat(String.format("%03d", scoreB));
    }
}
