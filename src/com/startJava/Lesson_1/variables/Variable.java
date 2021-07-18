package com.startJava.Lesson_1.variable;

public class Variable {
    public static void main(String[] args) {
        byte core = 16;
        short systemType = 64;
        int cpuFrequency = 3200;
        long releaseYear = 2021;
        float ram = 16.0f;
        double ssd = 2.000;
        char name = 'M';
        boolean status = true;

        System.out.println("\nИнформация о моём компьютере: ");
        System.out.println("Тип системы: " + systemType);
        System.out.println(core + " ядер");
        System.out.println(cpuFrequency + " GHz");
        System.out.println(releaseYear + " - год выпуска");
        System.out.println(ram + " RAM");
        System.out.println(ssd + " Гб");
        System.out.println(name + " - Название ПК");
        System.out.println("Статус: " + status + "\n");
    }
}