import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner console = new Scanner(System.in);
    Random random = new Random();

    private int computerNumber = random.nextInt(100);
    private Player player = new Player("");

    public void start(String playerName1, String playerName2) {
        Player player1 = new Player(playerName1);
        Player player2 = new Player(playerName2);

        while(true) {
            if(player.getName().equals(player1.getName())) {
                player.setName(player2.getName());
            } else {
                player.setName(player1.getName());
            }

            do {
                System.out.print("\nИгрок " + player.getName() + " ведите число от 0 до 100: ");
                player.setNumber(console.nextInt());

                if(player.getNumber() > 100 || player.getNumber() < 0) {
                    System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
                }
            } while(player.getNumber() > 100 || player.getNumber() < 0);

            if(player.getNumber() > computerNumber) {
                System.out.println("\nДанное число больше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + player.getNumber());
            } else if(player.getNumber() < computerNumber) {
                System.out.println("\nДанное число меньше того, что загадал компьютер");
                System.out.println("Игрок ввел число: " + player.getNumber());
            } else {
                System.out.println("\nПоздравляем игрока " + player.getName() + ", число угадано! Загаданное число: " + player.getNumber());
                break;
            }
            console.nextLine();
        }
    }
}