public class Calculator {
    public static void main(String[] args) {
        double number1 = 2;
        double number2 = 5;
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
            double degreeResult = number1;
            for(int i = 0; i < number2; i++) {
                degreeResult *= number1;
            }

            System.out.println(degreeResult);
        } else if(mathSign == '%') {
            System.out.println(number1 % number2);
        }
    }
}