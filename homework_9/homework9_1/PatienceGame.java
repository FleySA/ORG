package com.telran.org.homework_9.homework9_1;

import java.util.List;

public class PatienceGame {
    public static void main(String[] args) {
        PatienceGame game = new PatienceGame();
        game.play();
    }

    private Deck deck;
    private Tableau tableau;

    public PatienceGame() {
        deck = new Deck();
        tableau = new Tableau();
    }

    public void play() {
        while (deckHasCards()) {
            Card card = deck.drawCard();
            tableau.addCard(card);
            if (!tableau.removePairs()) {
                continue;
            }

            if (tableau.isPatienceSolved()) {
                break;
            }
        }
        printResult();
    }

    private boolean deckHasCards() {
        return deck.drawCard() != null;
    }

    private void printResult() {
        List<Card> remainingCards = tableau.getCards();
        System.out.println("Карты в стопке:");
        remainingCards.forEach(card -> System.out.println(card));
        if (remainingCards.size() == 4) {
            System.out.println("Пасьянс сошелся");
        } else {
            System.out.println("Пасьянс не сошелся");
        }
    }
}