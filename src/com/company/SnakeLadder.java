package com.company;

public class SnakeLadder {

    public static void main(String[] args) {

        int diceRoll = 0;
        int SnakeArray[] = { 54, 90, 99 };
        int LadderArray[] = { 9, 40, 67 };


        System.out.println("Starting Position of the Player = 0");

        for (int playerPosition = 1; playerPosition <= 100; playerPosition++) {
            double randomnumber = (double) (Math.random() * 6);
            diceRoll = (int) randomnumber;

            System.out.println("Dice Number =" + " " + diceRoll);

            playerPosition = playerPosition + diceRoll;
            playerPosition = playerPosition - 1;

            System.out.println("Current Position =" + " " + playerPosition);

            if (diceRoll == 0) {

                playerPosition = playerPosition - diceRoll;

                System.out.println("You have to stay on the same position!!");
            }

            if (playerPosition == SnakeArray[0]) {
                playerPosition = 19;

                System.out.println("IT'S A SNAKE.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == SnakeArray[1]) {
                playerPosition = 48;

                System.out.println("IT'S A SNAKE.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == SnakeArray[2]) {
                playerPosition = 77;

                System.out.println("IT'S A SNAKE.");
                System.out.println("Now, You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[0]) {
                playerPosition = 34;

                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[1]) {
                playerPosition = 64;

                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[2]) {
                playerPosition = 86;

                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");
            }
        }
    }
}

