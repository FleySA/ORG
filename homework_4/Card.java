package com.telran.org.homework_4;

public class Card {
    private final Rank rank;
    private final Suit suit;
    public Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}