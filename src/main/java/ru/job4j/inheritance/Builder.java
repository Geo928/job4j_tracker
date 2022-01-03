package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String specialisation;

    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday, int experience, String specialisation) {
        super(name, surname, education, birthday, experience);
        this.specialisation = specialisation;
    }
}
