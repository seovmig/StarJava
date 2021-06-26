import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    private int secretNumber = random.nextInt(101);
    private String playerName = "";

    public void start(String playerName1, String playerName2) {
        while(true) {
            if(playerName.equals(playerName1)) {
                Player player2 = new Player(playerName2);
                playerName = player2.getName();
            } else {
                Player player1 = new Player(playerName1);
                playerName = player1.getName();
            }

            Player number = new Player();

            do {
                System.out.print("\nИгрок " + playerName + " ведите число от 0 до 100: ");
                number.setNumber(console.nextInt());

                if(number.getNumber() > 100 || number.getNumber() < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(number.getNumber() > 100 || number.getNumber() < 0);

            if(number.getNumber() > secretNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + number.getNumber());
            } else if(number.getNumber() < secretNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + number.getNumber());
            } else {
                System.out.println("\nПоздравляем игрока " + playerName + ", число угадано! Загаданное число: " + number.getNumber());
                break;
            }
            console.nextLine();
        }
    }
}