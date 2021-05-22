public class GuessTheNumber {
    public static void main(String[] args) {
        int computerNumber = 69;
        int numberPeople = 11;
        boolean win = false;

        if(numberPeople > 100) {
            System.out.println("Число задано неверно. Игра угадай число от 0 до 100.");
        } else if(numberPeople < 0) {
            System.out.println("Число задано неверно. Игра угадай число от 0 до 100.");
        } else {
            while(!win) {
                if(numberPeople < 0) {
                    numberPeople = numberPeople + 10;
                } else if (numberPeople > 100) {
                    numberPeople = numberPeople - 9;
                }

                if(numberPeople > computerNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    numberPeople = numberPeople - 9;
                } else if(numberPeople < computerNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    numberPeople = numberPeople + 10;
                } else {
                    System.out.println("Поздравляю, число угадано!");
                    win = true;
                }
            }
        }
    }
}