package com.telran.org.homework_9.homework9_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tableau {
    private List<Card> cards;

    public Tableau() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean removePairs() {
        for (int i = cards.size() - 2; i >= 0; i--) {
            if (cards.get(i).getSuit() == cards.get(i + 1).getSuit()) {
                cards.remove(i);
                cards.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isPatienceSolved() {
        Map<Card.Suit, Integer> suitCounts = new HashMap<>();

        for (Card card : cards) {
            suitCounts.put(card.getSuit(), suitCounts.getOrDefault(card.getSuit(), 0) + 1);
        }

        for (int count : suitCounts.values()) {
            if (count != 1) {
                return false; // Есть масть с более чем 1 картой
            }
        }

        return true; // Все масти имеют по 1 карте
    }


    public List<Card> getCards() {
        return cards;
    }
}