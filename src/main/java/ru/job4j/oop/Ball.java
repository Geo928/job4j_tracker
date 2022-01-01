package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
    if (condition == false) {
        System.out.println("the ball escaped");
    } else {
        System.out.println("the ball is eaten");
    }
    }
}
