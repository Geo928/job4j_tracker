package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, String birthday) {
    }

    public Engineer(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }
}