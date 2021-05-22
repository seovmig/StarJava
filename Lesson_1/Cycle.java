public class Cycle {
    public static void main(String[] args) {
        System.out.println();
        
        for(int i = 0; i <=20; i++) {
            System.out.println(i);
        }

        System.out.println();

        int j = 6;

        while(j >= -6) {
            System.out.println(j);
            j = j - 2;
        }

        System.out.println();

        int k = 11;
        int result = 10;

        do {
            if(k % 2 != 0) {
                result = result + k;
            }
            k++;
        } while(k <= 20);

        System.out.println(result);
        System.out.println();
    }
}