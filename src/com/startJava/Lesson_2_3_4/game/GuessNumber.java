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
        boolean correctNumber = true;
        int secretNumber = random.nextInt(101);
        int numberAttempt = 0;

        if(yesOrNo.equals("yes")) {
            player1.clearNumbers(numberAttempt);
            player2.clearNumbers(numberAttempt);
        }

        while(!(currentPlayer == player2 && numberAttempt == 9)) {
            if(currentPlayer == player2 && numberAttempt != 9) {
                numberAttempt++;
            }

            currentPlayer = currentPlayer == player1 ? player2 : player1;

            do {
                if(!correctNumber) {
                    System.out.println("Вы ввели неверное число.");
                }

                System.out.print("\nИгрок " + currentPlayer.getName() + " ведите число от 0 до 100: ");
                correctNumber = currentPlayer.setNumber(console.nextInt(), numberAttempt);
            } while(!correctNumber);

            int playerNumber = currentPlayer.getNumber(numberAttempt);

            if(playerNumber != secretNumber) {
                String numberMoreLess = playerNumber > secretNumber ? " больше" : " меньше";
                System.out.println("Число: " + playerNumber + numberMoreLess + " того, что загадал компьютер");
            } else {
                numberAttempt++;
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " + playerNumber + " с " + numberAttempt + " попытки");

                System.out.println("Все ведённые числа победителя: ");
                outputPlayerNumbers(currentPlayer, numberAttempt);
                break;
            }

            if(playerNumber != secretNumber && numberAttempt != 9) {
                System.out.println("У игрока осталось: " + (9 - numberAttempt) + " попыток.");
            } else if(numberAttempt == 9) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
        }

        if(currentPlayer == player2 && numberAttempt == 9) {
            System.out.println("\nУ всех закончились попытки. Компьютер выйграл. Загаданное число: " + secretNumber);

            outputPlayerNumbers(player1, numberAttempt);
            outputPlayerNumbers(player2, numberAttempt);
        }
    }

    private void outputPlayerNumbers(Player player, int index) {
        System.out.println("\nИгрок " + player.getName() + " ввел числа: ");
        for(int number : player.getNumbers(index)) {
            System.out.printf(number + " ");
        }
    }
}