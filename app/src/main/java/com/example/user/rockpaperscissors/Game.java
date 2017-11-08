package com.example.user.rockpaperscissors;

import static com.example.user.rockpaperscissors.Symbol.ROCK;

/**
 * Created by user on 08/11/2017.
 */

public class Game {
    Integer userCounter;
    Integer aiCounter;

    public Integer getUserCounter() {
        return userCounter;
    }

    public Integer getAiCounter() {
        return aiCounter;
    }

    public Game() {
        this.userCounter = 0;
        this.aiCounter = 0;


    }

    public String displayWinner(Enum playerChoice, Enum AIchoice) {
        String beats = " beats ";
        String result = "Draw!";

        //ROCK VS PAPER
        if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.PAPER) || AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.PAPER)) {
            result = Symbol.PAPER.getValue().toUpperCase() + beats + Symbol.ROCK.getValue().toUpperCase();
        }

        //ROCK VS SCISSORS
        if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.SCISSORS) || AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.SCISSORS)) {
            result = Symbol.ROCK.getValue().toUpperCase() + beats + Symbol.SCISSORS.getValue().toUpperCase();
        }

        //ROCK VS SPOCK
        if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.SPOCK) || AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.SPOCK)) {
            result = Symbol.SPOCK.getValue().toUpperCase() + beats + Symbol.ROCK.getValue().toUpperCase();
        }

        //ROCK VS LIZARD
        if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.LIZARD) || AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.LIZARD)) {
            result = Symbol.ROCK.getValue().toUpperCase() + beats + Symbol.LIZARD.getValue().toUpperCase();
        }

        //PAPER VS LIZARD
        if (playerChoice.equals(Symbol.PAPER) && AIchoice.equals(Symbol.LIZARD) || AIchoice.equals(Symbol.PAPER) && playerChoice.equals(Symbol.LIZARD)){
            result = Symbol.PAPER.getValue().toUpperCase() + beats + Symbol.LIZARD.getValue().toUpperCase();
        }

        //PAPER VS SPOCK
        if (playerChoice.equals(Symbol.PAPER) && AIchoice.equals(Symbol.SPOCK) || AIchoice.equals(Symbol.PAPER) && playerChoice.equals(Symbol.SPOCK)) {
            result = Symbol.PAPER.getValue().toUpperCase() + beats + Symbol.SPOCK.getValue().toUpperCase();
        }

        //SCISSORS VS LIZARD
        if (playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.LIZARD) || AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.SCISSORS)) {
            result = Symbol.SCISSORS.getValue().toUpperCase() + beats + Symbol.LIZARD.getValue().toUpperCase();
        }

        //SCISSORS VS SPOCK
        if (playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.SPOCK) || AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.SPOCK)) {
            result = Symbol.SPOCK.getValue().toUpperCase() + beats + Symbol.SCISSORS.getValue().toUpperCase();
        }
        //SPOCK VS LIZARD
        if (playerChoice.equals(Symbol.SPOCK) && AIchoice.equals(Symbol.LIZARD) || AIchoice.equals(Symbol.SPOCK) && playerChoice.equals(Symbol.LIZARD)) {
            result = Symbol.ROCK.getValue().toUpperCase() + beats + Symbol.SCISSORS.getValue().toUpperCase();
        }

        //SCISSORS VS PAPER
        if (AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.PAPER) || playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.PAPER)) {
            result = Symbol.SCISSORS.getValue().toUpperCase() + beats + Symbol.PAPER.getValue().toUpperCase();
        }

        //
        //COUNTERS
        if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.PAPER)) {
            this.userCounter++;
        } else if (AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.PAPER)) {
            this.aiCounter++;
        } else if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.SCISSORS)) {
            this.userCounter++;
        } else if (AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.SCISSORS)) {
            this.aiCounter++;
        } else if (playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.PAPER)) {
            this.userCounter++;
        } else if (AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.PAPER)) {
            this.aiCounter++;

            //ADDED LOGIC
        } else if (AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.SPOCK)) {
            this.userCounter++;
        } else if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.SPOCK)) {
            this.aiCounter++;
        } else if (AIchoice.equals(Symbol.ROCK) && playerChoice.equals(Symbol.LIZARD)) {
            this.userCounter++;
        } else if (playerChoice.equals(Symbol.ROCK) && AIchoice.equals(Symbol.LIZARD)) {
            this.aiCounter++;
        } else if (playerChoice.equals(Symbol.PAPER) && AIchoice.equals(Symbol.SPOCK)) {
            this.userCounter++;
        } else if (AIchoice.equals(Symbol.PAPER) && playerChoice.equals(Symbol.SPOCK)) {
            this.aiCounter++;
        } else if (playerChoice.equals(Symbol.PAPER) && AIchoice.equals(Symbol.LIZARD)) {
            this.userCounter++;
        } else if (AIchoice.equals(Symbol.PAPER) && playerChoice.equals(Symbol.LIZARD)) {
            this.aiCounter++;
        } else if (playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.SPOCK)){
            this.aiCounter++;
        } else if (AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.SPOCK)) {
            this.userCounter++;
        } else if (playerChoice.equals(Symbol.SCISSORS) && AIchoice.equals(Symbol.LIZARD)) {
            this.aiCounter++;
        } else if (AIchoice.equals(Symbol.SCISSORS) && playerChoice.equals(Symbol.LIZARD)){
            this.userCounter++;
        }
        return result;
    }

}

