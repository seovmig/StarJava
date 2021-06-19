import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    int computerNumber = random.nextInt(100);
    int playerNumber = 101;
    String playerName1;
    String playerName2;

    public GuessNumber(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public void GuessNumber() {
        for(int idPlayer = 1; idPlayer <= 3; idPlayer++) {
            if(idPlayer == 3) {
                idPlayer = 1;
            }

            String playerName;
            if(idPlayer == 1) {
                playerName = playerName1;
            } else {
                playerName = playerName2;
            }

            do {
                System.out.print("\nИгрок " + playerName + " ведите число от 0 до 100: ");
                playerNumber = console.nextInt();

                if(playerNumber > 100 || playerNumber < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(playerNumber > 100 || playerNumber < 0);

            Player player = new Player(playerName, playerNumber);

            if(player.playerNumber > computerNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + player.playerNumber);
            } else if(player.playerNumber < computerNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + player.playerNumber);
            } else {
                System.out.println("\nПоздравляем игрока " + player.playerName + ", число угадано! Загаданное число: " + playerNumber);
                break;
            }
        }
        console.nextLine();
    }
}