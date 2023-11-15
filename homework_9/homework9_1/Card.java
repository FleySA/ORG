package com.telran.org.homework_9.homework9_1;

class Card {
    public enum Rank {
        SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
