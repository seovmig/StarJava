package com.startJava.Lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setAge(9);
        wolfOne.setGender('M');
        wolfOne.setWeight(13.13);
        wolfOne.setNickname("Пульба");
        wolfOne.setColoration("Red");

        System.out.println(wolfOne.getAge() + " лет волку.");
        System.out.println(wolfOne.getGender() + " - пол волка.");
        System.out.println(wolfOne.getWeight() + " кг весит волк.");
        System.out.println(wolfOne.getColoration() + " окрас очень редкий.");
        System.out.println(wolfOne.getNickname() + " - такую кличку мы дали нашему чуду.\n");

        wolfOne.go();

        wolfOne.run();

        wolfOne.sit();

        wolfOne.howl();

        wolfOne.hunt();
    }
}