package com.fjp;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private int guesses;
    private int random_number;
    private int guessed_number;
    private int min;
    private int max;

    public GuessGame(int min, int max){
        System.out.printf("Initialized game with range [%d, %d]\n", min, max);
        this.min = min;
        this.max = max;
    }

    public void generateRandomNumber(){
        Random random = new Random();
        random_number = random.nextInt(max - min + 1) + min;
        System.out.println("Random Number: " + random_number);
    }

    public int compareGuessedNumber(){
        if (guessed_number < min || guessed_number > max){
            System.out.println("Guessed out of range");
            return 2;
        }else if (guessed_number < random_number){
            System.out.println("Guessed a lower number");
            return -1;
        } else if (guessed_number > random_number) {
            System.out.println("Guessed a higher number");
            return 1;
        }else {
            System.out.println("You have hit a jackpot! Congratulations");
            return 0;
        }
    }

    public void getInput(){
        System.out.println("Guess the number: ");
        Scanner scan = new Scanner(System.in);
        guessed_number = scan.nextInt();
    }

}
