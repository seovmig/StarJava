package com.startJava.Lesson_2_3.calculator;

public class Calculator {
    private double number1;
    private double number2;
    private char mathSign;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public double compute() {
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
                    System.out.println("Деление на ноль невозможно.");
                } else {
                    result = number1 / number2;
                }
                break;
            case '^' :
                result = 1;

                if(number2 != 0) {
                    result = number1;
                }

                for(int i = 1; i < number2; i++) {
                    result *= number1;
                }
                break;
            case '%' :
                result = number1 % number2;
                break;
            default :
                System.out.print("Что-то пошло не так.");
        }

        return result;
    }
}