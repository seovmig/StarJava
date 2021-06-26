import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("\nВведите имя первого игрока: ");
        Player playerName1 = new Player(console.nextLine());

        System.out.print("\nВведите имя второго игрока: ");
        Player playerName2 = new Player(console.nextLine());

        String yesOrNo = "yes";
        while(yesOrNo.equals("yes")) {
            System.out.println("\nИгра запущена: ");

            GuessNumber guessNumber = new GuessNumber(playerName1.getName(), playerName2.getName());
            guessNumber.start();

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