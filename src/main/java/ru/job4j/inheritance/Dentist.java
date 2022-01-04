package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String specialisation;

    public Dentist(String name, String surname, String education, String birthday, int experience, String specialisation) {
        super(name, surname, education, birthday, experience);
        this.specialisation = specialisation;
    }

    public Diagnosis dentistDiagnosis(Pacient pacient) {
        return new Diagnosis();
    }
}
