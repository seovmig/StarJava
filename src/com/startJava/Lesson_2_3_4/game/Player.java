package com.startJava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumbers(int number, int index) {
        numbers[index] = number;
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }

    public void clearNumbers(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}