import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    private int computerNumber = random.nextInt(100);
    private int playerNumber = 101;
    private String playerName = "";

    public void start(String playerName1, String playerName2) {
        while(playerNumber != computerNumber) {
            if(playerName.equals(playerName1)) {
                playerName = playerName2;
            } else {
                playerName = playerName1;
            }

            Player player = new Player(playerName);

            do {
                System.out.print("\nИгрок " + player.getName() + " ведите число от 0 до 100: ");
                playerNumber = console.nextInt();

                if(playerNumber > 100 || playerNumber < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(playerNumber > 100 || playerNumber < 0);

            if(playerNumber > computerNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber);
            } else if(playerNumber < computerNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + playerNumber);
            } else {
                System.out.println("\nПоздравляем игрока " + player.getName() + ", число угадано! Загаданное число: " + playerNumber);
            }
        }
        console.nextLine();
    }
}