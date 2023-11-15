package com.telran.org.homework_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        while (true) {
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= CardUtils.getTotalNumberOfCards()) {
                    break;
                } else {
                    System.out.println("Too many players!");
                    System.out.println("Enter the number of players: ");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number of players.");
                sc.next();
            }
        }

        List<Card> deck = CardUtils.initializeDeck();
        CardUtils.shuffleDeck(deck);

        List<Player> playersList = new ArrayList<>();
        for (int i = 1; i <= players; i++) {
            Player player = new Player(i);
            for (int j = 0; j < cardsForPlayer; j++) {
                Card card = deck.remove(0);
                player.addToHand(card);
            }
            playersList.add(player);
        }


        for (Player player : playersList) {
            System.out.println(player);
        }
    }
}

