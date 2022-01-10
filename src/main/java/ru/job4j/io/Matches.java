package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches >= 1 && matches <= 3 && matches <= count) {
                System.out.println("На столе осталось " + (count - matches) + " спичек");
                count -= matches;
            } else {
                System.out.println("Ошибка! Введите число от 1 до 3:");
                int number = Integer.parseInt(input.nextLine());
                if (number >= 1 && number <= 3 && number <= count) {
                    System.out.println("На столе осталось " + (count - number) + " спичек");
                    count -= number;
                }
            }
            }
            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
    }
}
