package com.springproject.concepts;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole gameParam){
        this.game = gameParam;
    }

    public void run(){
        System.out.println("Running game - " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
