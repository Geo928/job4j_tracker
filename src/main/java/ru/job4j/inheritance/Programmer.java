package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String specialisation;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, int experience, String specialisation) {
        super(name, surname, education, birthday, experience);
        this.specialisation = specialisation;
    }
}
