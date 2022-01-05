package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Zmishenko Valeriy Albertovich");
        student.setGroup("EO-1488");
        student.setDate(new Date());
        System.out.println(student.getFio() + " studying in a group " + student.getGroup());
    }
}
