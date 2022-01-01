package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball bun = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        hare.tryEat(bun);
        wolf.tryEat(bun);
        fox.tryEat(bun);
    }
}
