package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
       /* Item item = new Item();
        LocalDateTime date = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = date.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);*/

        Item item2 = new Item();
        System.out.println(item2);
    }
}