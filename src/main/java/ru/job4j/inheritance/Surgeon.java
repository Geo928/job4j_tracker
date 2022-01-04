package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialisation;

    public Surgeon(String name, String surname, String education, String birthday, int experience, String specialisation) {
        super(name, surname, education, birthday, experience);
        this.specialisation = specialisation;
    }

    public Diagnosis surgeonDiagnosis(Pacient pacient) {
        return new Diagnosis();
    }
}
