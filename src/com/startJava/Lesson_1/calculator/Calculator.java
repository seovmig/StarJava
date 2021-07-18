package com.startJava.Lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        double number1 = 3;
        double number2 = 2;
        char mathSign = '^';

        if(mathSign == '+') {
            System.out.println(number1 + number2);
        } else if(mathSign == '-') {
            System.out.println(number1 - number2);
        } else if(mathSign == '*') {
            System.out.println(number1 * number2);
        } else if(mathSign == '/') {
            if(number2 == 0) {
                System.out.println("Деление на ноль невозможно.");
            } else {
                System.out.println(number1 / number2);
            }
        } else if(mathSign == '^') {
            double degreeResult = 1;

            if(number2 != 0) {
                degreeResult = number1;
            }

            for(int i = 1; i < number2; i++) {
                degreeResult *= number1;
            }

            System.out.println(degreeResult);
        } else if(mathSign == '%') {
            System.out.println(number1 % number2);
        }
    }
}