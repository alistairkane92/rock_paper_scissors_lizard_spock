package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView winner;
    private TextView villainPick;
    private TextView villainWins;
    private TextView userWins;
    private Game game;
    private Integer userCounter;
    private Integer aiCounter;
    private AI ai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winner = (TextView) findViewById(R.id.winner);
        villainPick = (TextView) findViewById(R.id.villainPick);
        villainWins = (TextView) findViewById(R.id.villainWins);
        userWins = (TextView) findViewById(R.id.userWins);

        game = new Game();

    }

    public void selectRock(View view){
        AI ai = new AI();
        Enum villainChoice =  ai.getRandomEnum();
        String result = game.displayWinner(Symbol.ROCK, villainChoice);
        winner.setText(result);
        villainPick.setText("Villain picked " + villainChoice.toString().toUpperCase());
        userWins.setText(game.getUserCounter().toString());
        villainWins.setText(game.getAiCounter().toString());

    }

    public void selectScissors(View view){
        AI ai = new AI();
        Enum villainChoice =  ai.getRandomEnum();
        String result = game.displayWinner(Symbol.SCISSORS, villainChoice);
        winner.setText(result);
        villainPick.setText("Villain picked " + villainChoice.toString().toUpperCase());
        userWins.setText(game.getUserCounter().toString());
        villainWins.setText(game.getAiCounter().toString());
    }

    public void selectPaper(View view){
        AI ai = new AI();
        Enum villainChoice =  ai.getRandomEnum();
        String result = game.displayWinner(Symbol.PAPER, villainChoice);
        winner.setText(result);
        villainPick.setText("Villain picked " + villainChoice.toString().toUpperCase());
        userWins.setText(game.getUserCounter().toString());
        villainWins.setText(game.getAiCounter().toString());
    }


    public void selectSpock(View view) {
        AI ai = new AI();
        Enum villainChoice =  ai.getRandomEnum();
        String result = game.displayWinner(Symbol.SPOCK, villainChoice);
        winner.setText(result);
        villainPick.setText("Villain picked " + villainChoice.toString().toUpperCase());
        userWins.setText(game.getUserCounter().toString());
        villainWins.setText(game.getAiCounter().toString());
    }

    public void selectLizard(View view) {
        AI ai = new AI();
        Enum villainChoice =  ai.getRandomEnum();
        String result = game.displayWinner(Symbol.LIZARD, villainChoice);
        winner.setText(result);
        villainPick.setText("Villain picked " + villainChoice.toString().toUpperCase());
        userWins.setText(game.getUserCounter().toString());
        villainWins.setText(game.getAiCounter().toString());

    }
}
