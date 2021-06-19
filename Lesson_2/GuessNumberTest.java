import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nВведите имя первого игрока: ");
        String playerName1 = console.nextLine();

        System.out.print("\nВведите имя второго игрока: ");
        String playerName2 = console.nextLine();

        String yesOrNo = "yes";
        while(yesOrNo.equals("yes")) {
            System.out.println("\nИгра запущена: ");

            //int computerNumber = random.nextInt(100);
            //int playerNumber = 101;
            GuessNumber guessNumber = new GuessNumber(playerName1, playerName2);

            // while(true) {
                // Player player = new Player(playerName1);
                guessNumber.GuessNumber();

                // Player player = new Player(playerName2);
                // guessNumber.GuessNumber();
            // }

            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                yesOrNo = console.nextLine();

                if(!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
                    System.out.println("\nНеизвестная команда. Введи yes или no");
                }
            } while(!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        }
        System.out.println("\nИгра завершена\n");
    }
}