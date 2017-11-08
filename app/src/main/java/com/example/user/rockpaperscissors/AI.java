package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 08/11/2017.
 */

public class AI {
    ArrayList<Enum> choices;


    public AI() {
        choices = new ArrayList<>();
        choices.add(Symbol.PAPER);
        choices.add(Symbol.ROCK);
        choices.add(Symbol.SCISSORS);
    }

    public Integer getChoiceLength(){
        return choices.size();
    }

    public Integer makeRandomSelection(){
        Random rand = new Random();
        return rand.nextInt(getChoiceLength());
    }

    public Enum getRandomEnum(){
        return choices.get(makeRandomSelection());
    }


}
