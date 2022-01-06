package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
     Book first = new Book("Clean code", 150);
     Book second = new Book("Second book", 120);
     Book third = new Book("Third book", 90);
     Book fourth = new Book("Fourth book", 200);
     Book[] book = new Book[4];
     book[0] = first;
     book[1] = second;
     book[2] = third;
     book[3] = fourth;
        for (int i = 0; i < book.length; i++) {
            Book result = book[i];
            System.out.println(result.getName() + " - " + result.getNumbers());
        }
        Book time = book[0];
        book[0] = book[3];
        book[3] = time;
        System.out.println();
        System.out.println("Replace first and fourth");
        for (int i = 0; i < book.length; i++) {
            Book result = book[i];
            System.out.println(result.getName() + " - " + result.getNumbers());
        }
        System.out.println();
        System.out.println("Only Clean code");
        for (int i = 0; i < book.length; i++) {
            Book result = book[i];
            if ("Clean code".equals(result.getName())) {
                System.out.println(result.getName() + " - " + result.getNumbers());
            }
        }
    }
}
