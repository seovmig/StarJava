package com.startJava.Lesson_2_3_4.game;

import java.util.Arrays;
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

        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            int PlayerNumber;

            do {
                System.out.print("\nИгрок " + currentPlayer.getName() + " ведите число от 0 до 100: ");
                currentPlayer.setNumbers(console.nextInt(), playerTurn);

                PlayerNumber = currentPlayer.getNumber(playerTurn);

                if (PlayerNumber > 100 || PlayerNumber < 0) {
                    System.out.println("Вы ввели неверное число.");
                } else {
                    if (PlayerNumber != secretNumber && playerTurn != 9) {
                        System.out.println("У игрока осталось: " + (9 - playerTurn) + " попыток.");
                    } else if (playerTurn == 9) {
                        System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                    }
                }
            } while (PlayerNumber > 100 || PlayerNumber < 0);

            if (PlayerNumber > secretNumber) {
                System.out.println("Число: " + PlayerNumber + " больше того, что загадал компьютер");
            } else if (PlayerNumber < secretNumber) {
                System.out.println("Число: " + PlayerNumber + " меньше того, что загадал компьютер");
            } else {
                playerTurn++;
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + PlayerNumber + " с " + playerTurn + " попытки");

                System.out.println("Все ведённые числа победителя: ");
                System.out.println(Arrays.toString(currentPlayer.getNumbers(playerTurn)));
                break;
            }

            if (currentPlayer == player2 && playerTurn == 9) {
                System.out.println("\nУ всех закончились попытки. Компьютер выйграл. Загаданное число: " + secretNumber);

                System.out.println("\nИгрок " + player1.getName() + " ввел числа: ");
                System.out.println(Arrays.toString(player1.getNumbers(playerTurn)));

                System.out.println("\nИгрок " + player2.getName() + " ввел числа: ");
                System.out.println(Arrays.toString(player2.getNumbers(playerTurn)));
                break;
            }

            if (currentPlayer == player2) {
                playerTurn++;
            }
        }
    }
}