package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void liftingCapacity() {
        System.out.println(getClass().getSimpleName() + " имеет большую грузоподъемность");
    }
}
