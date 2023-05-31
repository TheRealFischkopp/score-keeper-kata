package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreKeeperTest {

    ScoreKeeper scoreKeeper;

    @BeforeEach
    void setUp() {
        scoreKeeper = new ScoreKeeper();
    }

    @Test
    void scoreTeamA1_scoreFirstPoint() {
        //Arrange
        //Act
        scoreKeeper.scoreTeamA1();
        //Assert
        Assertions.assertEquals(scoreKeeper.getScore(),"001:000");
    }

    @Test
    void scoreTeamA1_scoreMultiplePoints() {
        //Arrange
        int scoredPointsOfTeamA = (int) (Math.random() * 999);
        int scoredPointsOfTeamB = 0; //(int) (Math.random() * 999);
        String expectedResult = Integer.toString(scoredPointsOfTeamA + 1)
                        + ":" + Integer.toString(scoredPointsOfTeamB);
        //Act
        for (int i = 0; i < scoredPointsOfTeamA; i++) scoreKeeper.scoreTeamA1();
        //Assert
        Assertions.assertEquals(scoreKeeper.getScore(),expectedResult);
    }

    @Test
    void scoreTeamA2() {
        //Arrange

        //Act

        //Assert

    }

    @Test
    void scoreTeamA3() {
        //Arrange

        //Act

        //Assert

    }

    @Test
    void scoreTeamB1() {
        //Arrange

        //Act

        //Assert

    }

    @Test
    void scoreTeamB2() {
        //Arrange

        //Act

        //Assert

    }

    @Test
    void scoreTeamB3() {
        //Arrange

        //Act

        //Assert

    }



    @Test
    void getScore() {
        //Arrange

        //Act

        //Assert

    }
}