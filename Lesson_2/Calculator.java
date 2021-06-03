public class Calculator {
    private double number1 = 3;
    private double number2 = 3;
    private char mathSign = '^';

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

    public double mathSign() {
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
                double degreeResult = 1;

                if(number2 != 0) {
                    degreeResult = number1;
                }

                for(int i = 1; i < number2; i++) {
                    degreeResult *= number1;
                }

                result = degreeResult;
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