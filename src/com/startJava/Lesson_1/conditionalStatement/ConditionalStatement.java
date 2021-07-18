package com.startJava.Lesson_1.conditionalStatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;

        if(age > 20) {
            System.out.println("\nВаш возраст больше 20 лет.");
        }

        char gender = 'M';
        boolean isMale = gender == 'M';

        if(isMale) {
            System.out.println("Ваш пол мужской.");
        }

        if(!isMale) {
            System.out.println("Ваш пол не подходит для нашей тусовки.");
        }

        double height = 1.77;

        if(height < 1.80) {
            System.out.println("Ваш рост подходит.");
        } else {
            System.out.println("Ваш рост слишком высокий для нашей тусовки.");
        }

        char firstLetterName = 'G';

        if(firstLetterName == 'M') {
            System.out.println("Вам повезло у вас первая буква имени M\n");
        } else if(firstLetterName == 'I') {
            System.out.println("Вам повезло не очень у вас первая буква имени I\n");
        } else {
            System.out.println("Ваша первая буква имени не соответствует нашему принципу.\n");
        }
    }
}