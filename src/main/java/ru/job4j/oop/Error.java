package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Boolean active = " + active);
        System.out.println("Int status = " + status);
        System.out.println("String message = " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.print();
        System.out.println();
        Error next = new Error(true, 100, "Messege");
        next.print();
    }
}
