package com.startJava.Lesson_2_3_4.robot;

public class Jaeger {
    String modelName;
    int speed;

    public Jaeger(String modelName, int speed) {
        this.modelName = modelName;
        if(speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    // public String getModelName() {
    //     return modelName;
    // }

    // public void setModelName(String modelName) {
    //     this.modelName = modelName;
    // }

    // public int getSpeed() {
    //     return speed;
    // }

    // public void setSpeed(int speed) {
    //     this.speed = speed;
    // }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}