package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 08/11/2017.
 */

public enum Symbol {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors"),
    LIZARD("lizard"),
    SPOCK("spock");

    private String value;

    Symbol(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
