import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String yesOrNo = "yes";

        while(yesOrNo.equals("yes")) {
            System.out.println("\nКалькулятор запущен: ");
            System.out.print("\nВведите первое число: ");
            calculator.setNumber1(console.nextInt());

            System.out.print("\nВведите знак математической операции: ");
            calculator.setMathSign(console.next().charAt(0));

            System.out.print("\nВведите второе число: ");
            calculator.setNumber2(console.nextInt());

            System.out.println("\n" + calculator.getNumber1() + " " + calculator.getMathSign() + " " + calculator.getNumber2() + " = " + calculator.compute());

            console.nextLine();

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                yesOrNo = console.nextLine();

                if(!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
                    System.out.println("\nНеизвестная команда. Введи yes или no");
                }
            } while(!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        }
        System.out.println("\nпрограмма завершена\n");
    }
}