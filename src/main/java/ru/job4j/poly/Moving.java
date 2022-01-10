package ru.job4j.poly;

public class Moving {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle bus = new Autobus();
        Vehicle train = new Train();

        Vehicle[] array = new Vehicle[]{airplane, bus, train};
        for (Vehicle a: array) {
            a.move();
            a.liftingCapacity();
        }
    }
}
