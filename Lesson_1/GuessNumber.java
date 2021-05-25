public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber = 79;
        int playerNumber = 13;

        if(playerNumber > 100 || playerNumber < 0) {
            System.out.println("\nЧисло задано неверно. Игра угадай число от 0 до 100.\n");
        } else {
            while(playerNumber != computerNumber) {
                if(playerNumber < 0) {
                    playerNumber += 10;
                } else if (playerNumber > 100) {
                    playerNumber -= 9;
                }

                if(playerNumber > computerNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                    playerNumber -= 9;
                } else if(playerNumber < computerNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    playerNumber += 10;
                }
            }
            System.out.println("Поздравляю, число угадано!");
        }
    }
}