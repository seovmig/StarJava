package com.startJava.Lesson_2-3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    private int secretNumber = random.nextInt(101);
    private Player player1;
    private Player player2;

    public GuessNumber(String playerName1, String playerName2) {
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start() {
        Player currentPlayer = null;

        while(true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;

            do {
                System.out.print("\nИгрок " + currentPlayer.getName() + " ведите число от 0 до 100: ");
                currentPlayer.setNumber(console.nextInt());

                System.out.println("\nИгрок " + currentPlayer.getName() + " ввел число: " + currentPlayer.getNumber());

                if(currentPlayer.getNumber() > 100 || currentPlayer.getNumber() < 0) {
                    System.out.println("Вы ввели неверное число.");
                }
            } while(currentPlayer.getNumber() > 100 || currentPlayer.getNumber() < 0);

            if(currentPlayer.getNumber() > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(currentPlayer.getNumber() < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем игрока " + currentPlayer.getName() + ", число угадано! Загаданное число: " + currentPlayer.getNumber());
                break;
            }
        }
    }
}