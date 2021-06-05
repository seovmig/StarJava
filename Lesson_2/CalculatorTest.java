import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean programIsRun = true;

        while(programIsRun) {
            System.out.println("\nКалькулятор запущен: ");
            System.out.print("\nВведите первое число: ");
            calculator.setNumber1(console.nextInt());

            System.out.print("\nВведите знак математической операции: ");
            calculator.setMathSign(console.next().charAt(0));

            System.out.print("\nВведите второе число: ");
            calculator.setNumber2(console.nextInt());

            System.out.println("\n" + calculator.getNumber1() + " " + calculator.getMathSign() + " " + calculator.getNumber2() + " = " + calculator.compute());

            console.nextLine();

            String checkingCommand;
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                checkingCommand = console.nextLine();

                if(!checkingCommand.equals("yes") & !checkingCommand.equals("no")) {
                    System.out.println("\nНеизвестная команда. Введи yes или no");
                }
            } while(!checkingCommand.equals("yes") & !checkingCommand.equals("no"));

            switch(checkingCommand) {
                case "yes" :
                    continue;
                case "no" :
                    System.out.println("\nпрограмма завершена\n");
                    programIsRun = false;
             }
        } 
    }
}