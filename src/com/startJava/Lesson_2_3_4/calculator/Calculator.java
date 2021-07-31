package com.startJava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private Double number1;
    private Double number2;
    private char mathSign;
    private String continueYesOrNo = "yes";
    private Scanner console = new Scanner(System.in);

    public void calculate() {
        System.out.println("\nКалькулятор запущен: ");

        while(continueYesOrNo.equals("yes")) {
            start();
            compute();
            continueYesOrNo();
        }

        System.out.println("\nПрограмма завершена\n");
    }

    private void start() {
        do {
            System.out.print("\nВведите математическое выражение через пробел (например 2 * 3): ");
            String[] mathExpressionArray = console.nextLine().split(" ");

            if (mathExpressionArray.length != 3) {
                System.out.println("\nВы ввели неправильный формат выражения. Попробуйте ещё.");
            } else {
                number1 = Double.parseDouble(mathExpressionArray[0]);
                number2 = Double.parseDouble(mathExpressionArray[2]);
                mathSign = mathExpressionArray[1].charAt(0);
                break;
            }
        } while(true);
    }

    private void compute() {
        double result = 0;

        switch(mathSign) {
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                if(number2 == 0) {
                    System.out.println("Деление на ноль невозможно. Попробуйте ещё.");
                    start();
                } else {
                    result = number1 / number2;
                }
                break;
            case '^' :
                result = Math.pow(number1,number2);
                break;
            case '%' :
                result = number1 % number2;
                break;
            default :
                System.out.print("Вы ввели неверный математический знак. Попробуйте ещё.");
                start();
        }

        System.out.println("\n" + number1 + " " + mathSign + " " + number2 + " = " + result);
    }

    private void continueYesOrNo() {
        do {
            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            continueYesOrNo = console.nextLine();

            if(!continueYesOrNo.equals("yes") && !continueYesOrNo.equals("no")) {
                System.out.println("\nНеизвестная команда. Введи yes или no");
            }
        } while(!continueYesOrNo.equals("yes") && !continueYesOrNo.equals("no"));
    }
}