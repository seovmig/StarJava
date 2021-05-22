public class Calculator {
    public static void main(String[] args) {
        double number1 = 2;
        double number2 = 5;
        char mathematicalSign = '%';

        if(mathematicalSign == '+') {
            System.out.println(number1 + number2);
        } else if(mathematicalSign == '-') {
            System.out.println(number1 - number2);
        } else if(mathematicalSign == '*') {
            System.out.println(number1 * number2);
        } else if(mathematicalSign == '/') {
            if(number2 == 0) {
                System.out.println("Деление на ноль невозможно.");
            } else {
                System.out.println(number1 / number2);
            }
        } else if(mathematicalSign == '^') {
            double degreeResult = number1;

            for(int i = 0; i < number2; i++) {
                degreeResult = degreeResult * number1;
            }

            System.out.println(degreeResult);
        } else if(mathematicalSign == '%') {
            System.out.println(number1 % number2);
        }
    }
}