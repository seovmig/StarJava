package com.startJava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private Random random = new Random();
    private Player player1;
    private Player player2;

    public GuessNumber(String playerName1, String playerName2) {
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start(String yesOrNo) {
        Player currentPlayer = null;
        int secretNumber = random.nextInt(101);
        int playerTurn = 0;

        if(yesOrNo.equals("yes")) {
            player1.clearNumbers(playerTurn);
            player2.clearNumbers(playerTurn);
        }

        while(true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            int playerNumber;

            do {
                System.out.print("\nИгрок " + currentPlayer.getName() + " ведите число от 0 до 100: ");
                currentPlayer.setNumber(console.nextInt(), playerTurn);

                playerNumber = currentPlayer.getNumber(playerTurn);

                if(playerNumber > 100 || playerNumber < 0) {
                    System.out.println("Вы ввели неверное число.");
                } else if(playerNumber != secretNumber && playerTurn != 9) {
                    System.out.println("У игрока осталось: " + (9 - playerTurn) + " попыток.");
                } else if(playerTurn == 9) {
                    System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                }
            } while(playerNumber > 100 || playerNumber < 0);

            if(playerNumber > secretNumber) {
                System.out.println("Число: " + playerNumber + " больше того, что загадал компьютер");
            } else if(playerNumber < secretNumber) {
                System.out.println("Число: " + playerNumber + " меньше того, что загадал компьютер");
            } else {
                playerTurn++;
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + playerNumber + " с " + playerTurn + " попытки");

                nameNumbersOutput(currentPlayer.getName(), currentPlayer.getNumbers(playerTurn));
                break;
            }

            if(currentPlayer == player2 && playerTurn == 9) {
                System.out.println("\nУ всех закончились попытки. Компьютер выйграл. Загаданное число: " + secretNumber);

                nameNumbersOutput(player1.getName(), player1.getNumbers(playerTurn));
                nameNumbersOutput(player2.getName(), player2.getNumbers(playerTurn));
                break;
            }

            if(currentPlayer == player2) {
                playerTurn++;
            }
        }
    }

    private void nameNumbersOutput(String nameCurrentPlayer, int[] numbersCurrentPlayer) {
        System.out.println("\nИгрок " + nameCurrentPlayer + " ввел числа: ");
        for(int numbers : numbersCurrentPlayer) {
            System.out.printf(numbers + " ");
        }
    }
}