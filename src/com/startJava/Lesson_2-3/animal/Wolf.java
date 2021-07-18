package com.startJava.Lesson_2-3.animal;

public class Wolf {

    private int age;
    private char gender;
    private double weight;
    private String nickname;
    private String coloration;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColoration() {
        return coloration;
    }

    public void setColoration(String coloration) {
        this.coloration = coloration;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}