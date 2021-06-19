import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    // int computerNumber = random.nextInt(100);
    int computerNumber = random.nextInt(100);
    int playerNumber = 101;

    //String playerName = "yes";
    String playerName1 = "yes";
    String playerName2 = "yes";

    public GuessNumber(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    // Player player = new Player(playerName1, playerNumber);

    public void GuessNumber() {
        while(playerNumber != computerNumber) {
            do {
                System.out.print("\nИгрок " + playerName1 + " ведите число от 0 до 100: ");
                playerNumber = console.nextInt();

                if(playerNumber > 100 || playerNumber < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(playerNumber > 100 || playerNumber < 0);

            if(playerNumber > computerNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber /*guessNumber.playerNumber()*/);
            } else if(playerNumber < computerNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber /*guessNumber.playerNumber()*/);
            } else {
                System.out.println("\nПоздравляем игрока " + playerName1 + ", число угадано! Загаданное число: " + playerNumber);
                break;
            }

            do {
                System.out.print("\nИгрок " + playerName2 + " ведите число от 0 до 100: ");
                playerNumber = console.nextInt();

                if(playerNumber > 100 || playerNumber < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(playerNumber > 100 || playerNumber < 0);

            if(playerNumber > computerNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber /*guessNumber.playerNumber()*/);
            } else if(playerNumber < computerNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber /*guessNumber.playerNumber()*/);
            } else {
                System.out.println("\nПоздравляем игрока " + playerName2 + ", число угадано! Загаданное число: " + playerNumber);
                break;
            }
        }
        console.nextLine();
    }
}