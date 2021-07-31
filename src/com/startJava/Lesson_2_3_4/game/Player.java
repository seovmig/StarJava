package com.startJava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private String yesOrNo = "no";

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number, int turn) {
        numbers[turn] = number;
        this.number = number;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int turn) {
        Arrays.fill(numbers, 0, turn, 0);
    }
}