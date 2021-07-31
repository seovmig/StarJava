package com.startJava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Scanner console = new Scanner(System.in);
    private Random random = new Random();
    private Player player1;
    private Player player2;
    private String yesOrNo = "no";
    private int playerTurn = 0;

    public GuessNumber(String playerName1, String playerName2) {
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start() {
        Player currentPlayer = null;
        int secretNumber = random.nextInt(101);

        if(yesOrNo.equals("yes")) {
            player1.setNumbers(playerTurn);
            player2.setNumbers(playerTurn);
            yesOrNo = "no";
        }

        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            do {
                System.out.print("\nИгрок " + currentPlayer.getName() + " ведите число от 0 до 100: ");
                currentPlayer.setNumber(console.nextInt(), playerTurn);

                if (currentPlayer.getNumber() > 100 || currentPlayer.getNumber() < 0) {
                    System.out.println("Вы ввели неверное число.");
                } else {
                    if (currentPlayer.getNumber() != secretNumber && playerTurn != 9) {
                        System.out.println("У игрока осталось: " + String.valueOf(9 - playerTurn) + " попыток.");
                    } else if (playerTurn == 9) {
                        System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                    }
                }
            } while (currentPlayer.getNumber() > 100 || currentPlayer.getNumber() < 0);

            if (currentPlayer == player2 && playerTurn == 9) {
                System.out.println("\nУ всех закончились попытки. Компьютер выйграл. Загаданное число: " + secretNumber);

                System.out.println("\nИгрок " + player1.getName() + " ввел числа: ");
                for (int i = 0; i < player1.getNumbers().length; i++) {
                    System.out.printf(player1.getNumbers()[i] + " ");
                }

                System.out.println("\nИгрок " + player2.getName() + " ввел числа: ");
                for (int i = 0; i < player2.getNumbers().length; i++) {
                    System.out.printf(player2.getNumbers()[i] + " ");
                }
                break;
            }

            if (currentPlayer.getNumber() > secretNumber) {
                System.out.println("Число: " + currentPlayer.getNumber() + " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < secretNumber) {
                System.out.println("Число: " + currentPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else {
                playerTurn++;
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + currentPlayer.getNumber() + " с " + playerTurn + " попытки");

                int[] numbersCopy = Arrays.copyOf(currentPlayer.getNumbers(), playerTurn);
                System.out.println("Все ведённые числа игрока: ");
                System.out.println(Arrays.toString(numbersCopy));
                break;
            }

            if (currentPlayer == player2) {
                playerTurn++;
            }
        }
    }

    public void setYesOrNo(String yesOrNo) {
        this.yesOrNo = yesOrNo;
    }
}