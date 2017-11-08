package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/11/2017.
 */

public class TestGame {
    Game game;

    @Test
    public void testGameLogic() throws Exception {
        game = new Game();
        assertEquals("paper beats rock", game.displayWinner(Symbol.ROCK , Symbol.PAPER));
        assertEquals("paper beats rock", game.displayWinner(Symbol.PAPER, Symbol.ROCK));

        assertEquals("rock beats scissors", game.displayWinner(Symbol.ROCK, Symbol.SCISSORS));
        assertEquals("rock beats scissors", game.displayWinner(Symbol.SCISSORS, Symbol.ROCK));

        assertEquals("scissors beats paper", game.displayWinner(Symbol.SCISSORS, Symbol.PAPER));
        assertEquals("scissors beats paper", game.displayWinner(Symbol.PAPER, Symbol.SCISSORS));
    }

}
