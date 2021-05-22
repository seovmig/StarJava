public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        double height = 1.77;
        char gender = 'M';
        char firstLetterName = 'G';
        boolean isMale = gender == 'M';

        if(age > 20) {
            System.out.println("Ваш возраст больше 20 лет.");
        }

        if(isMale) {
            System.out.println("Ваш пол мужской.");
        }

        if(!isMale) {
            System.out.println("Ваш пол не подходит для нашей тусовки.");
        }

        if(height < 1.80) {
            System.out.println("Ваш рост подходит.");
        } else {
            System.out.println("Ваш рост слишком высокий для нашей тусовки.");
        }

        if(firstLetterName == 'M') {
            System.out.println("Вам повезло у вас первая буква имени M");
        } else if(firstLetterName == 'I') {
            System.out.println("Вам повезло не очень у вас первая буква имени I");
        } else {
            System.out.println("Ваша первая буква имени не соответствует нашему принципу.");
        }
    }
}