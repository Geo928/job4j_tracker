package ru.job4j.stream;

import java.util.stream.Stream;

public class Carder {
    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static class Card {
        private Suit suit;
        private Value value;

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(v -> Stream.of(Value.values())
                        .map(s -> new Card(v, s)))
                .forEach(System.out::println);
    }
}
