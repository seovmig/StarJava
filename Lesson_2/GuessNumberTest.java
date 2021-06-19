import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("\nВведите имя первого игрока: ");
        String playerName1 = console.nextLine();

        System.out.print("\nВведите имя второго игрока: ");
        String playerName2 = console.nextLine();

        String yesOrNo = "yes";
        while(yesOrNo.equals("yes")) {
            System.out.println("\nИгра запущена: ");

            GuessNumber guessNumber = new GuessNumber(playerName1, playerName2);
            guessNumber.GuessNumber();

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