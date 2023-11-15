package com.telran.org.homework_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CardUtils {
    public static List<Card> initializeDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    public static int getTotalNumberOfCards() {
        return Suit.values().length * Rank.values().length;
    }

}