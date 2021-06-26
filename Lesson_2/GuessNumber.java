import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    private int secretNumber = random.nextInt(101);
    private Player players = new Player("");
    private Player player1;
    private Player player2;

    public GuessNumber(String playerName1, String playerName2) {
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start() {
        while(true) {
            if("".equals(players.getName()) || player2.getName().equals(players.getName())) {
                players = player1;
            } else {
                players = player2;
            }

            do {
                System.out.print("\nИгрок " + players.getName() + " ведите число от 0 до 100: ");
                players.setNumber(console.nextInt());

                if(players.getNumber() > 100 || players.getNumber() < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(players.getNumber() > 100 || players.getNumber() < 0);

            if(players.getNumber() > secretNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + players.getNumber());
            } else if(players.getNumber() < secretNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + players.getNumber());
            } else {
                System.out.println("\nПоздравляем игрока " + players.getName() + ", число угадано! Загаданное число: " + players.getNumber());
                break;
            }
            console.nextLine();
        }
    }
}