package com.telran.org.homework_4;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> hand;
    private final int playerId;

    public Player(int playerId) {
        this.hand = new ArrayList<>();
        this.playerId = playerId;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player_").append(playerId).append(": ");
        sb.append("{ Hand =  ").append(hand).append(" } ");
        return sb.toString();
    }
}