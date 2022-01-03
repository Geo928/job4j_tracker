package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String specialisation;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday, int experience, String specialisation) {
        super(name, surname, education, birthday, experience);
        this.specialisation = specialisation;
    }
}
