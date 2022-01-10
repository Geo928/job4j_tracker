package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void liftingCapacity() {
        System.out.println(getClass().getSimpleName() + " имеет небольшую грузоподъемность");
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }
}
