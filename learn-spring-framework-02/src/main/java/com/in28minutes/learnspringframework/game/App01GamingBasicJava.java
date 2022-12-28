package com.in28minutes.learnspringframework.game;

public class App01GamingBasicJava {

    public static void main(String[] args){
        //var game = new SuperContraGame();
       // var game = new MarioGame();
        var game = new PacmanGame(); // 1. Object creation

        var gameRunner = new GameRunner(game); // 2. Object creation + Wiring of dependencies
        // Game (like MarioGame, or GamingConsole in general) is a dependency of GameRunner class
        gameRunner.run();
    }
}
