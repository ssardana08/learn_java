package com.fjp;

public class GuessGameExecutor {
    public static void main(String[] args) {
        GuessGame game = new GuessGame(1, 100);
        game.generateRandomNumber();
        do {
            game.getInput();
        }while (game.compareGuessedNumber() != 0);

        System.out.println("Exiting Game! See you soon :)");
    }
}
