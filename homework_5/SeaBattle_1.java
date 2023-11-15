package com.telran.org.homework_5;

import java.util.Arrays;
import java.util.Scanner;


public class SeaBattle_1 {

    private static final int[][] SHIP_DECK_AMOUNT = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    private static final int FIELD_LENGTH = 10;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String playerOne = getPlayerName(1);
        System.out.println("Hi, " + playerOne + "!");
        String playerTwo = getPlayerName(2);
        System.out.println("Hi, " + playerTwo + "!");

        char[][] playerOneField = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerTwoField = new char[FIELD_LENGTH][FIELD_LENGTH];

        initializeFields(playerOneField);
        initializeFields(playerTwoField);

        placeShips(playerOneField, playerOne);
        placeShips(playerTwoField, playerTwo);

        startGame(playerOneField, playerTwoField, playerOne, playerTwo);
    }

    private static String getPlayerName(int playerNumber) {
        System.out.println("Player " + playerNumber + ", please, enter your name: ");
        return scanner.nextLine();
    }

    private static void initializeFields(char[][] field) {
        for (char[] row : field) {
            Arrays.fill(row, '.');
        }
    }

    private static void startGame(char[][] playerFieldOne, char[][] playerFieldTwo, String playerOne, String playerTwo) {
        char[][] playerBattleFieldOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleFieldTwo = new char[FIELD_LENGTH][FIELD_LENGTH];

        String currentPlayer = playerOne;
        char[][] currentPlayerField = playerFieldTwo;
        char[][] currentPlayerEnemyField = playerBattleFieldOne;

        while (isPlayerAlive(playerFieldOne) && isPlayerAlive(playerFieldTwo))
        {
            printField(currentPlayerEnemyField);
            int[] coordinates = getPlayerShotCoordinates(currentPlayer); // получение координат выстрела

            int shotResult = verificationShot(currentPlayerEnemyField, currentPlayerField, coordinates[0], coordinates[1]);

            if (shotResult == 0) {
                currentPlayer = (currentPlayer.equals(playerOne)) ? playerTwo : playerOne;
                currentPlayerField = (currentPlayerField == playerFieldOne) ? playerFieldTwo : playerFieldOne;
                currentPlayerEnemyField = (currentPlayerEnemyField == playerBattleFieldOne) ? playerBattleFieldTwo : playerBattleFieldOne;
                System.out.println("You missed, " + currentPlayer + " takes the turn.");
            }
            if (!isPlayerAlive(playerFieldOne)) {
                System.out.println(playerOne + " is the winner!");// проверка на оставшиеся корабли, если кораблей нет то выиграл
                break;
            }
            if (!isPlayerAlive(playerFieldTwo)) {
                System.out.println(playerTwo + " is the winner!");
                break;
            }
        }

        System.out.println(currentPlayer + " is the winner!");
    }

    private static int[] getPlayerShotCoordinates(String playerName) {
        int[] coordinates = new int[2];
        System.out.println(playerName + ", please, input the x coordinate for your shot: ");
        coordinates[0] = scanner.nextInt();
        System.out.println(playerName + ", please, input the y coordinate for your shot: ");
        coordinates[1] = scanner.nextInt();
        return coordinates;
    }

    private static int verificationShot(char[][] battleField, char[][] field, int x, int y) {
        if (x < 0 || x >= FIELD_LENGTH || y < 0 || y >= FIELD_LENGTH || battleField[y][x] == 'X' || battleField[y][x] == '*') {
            System.out.println("Invalid shot coordinates. Try again.");
            return -1;
        }

        if (field[y][x] == '=') {
            battleField[y][x] = 'X';
            System.out.println("Hit!");
            return 1;
        } else {
            battleField[y][x] = '*';
            System.out.println("Miss!");
            return 0;
        }
    }

    private static boolean isPlayerAlive(char[][] field) {
        for (int i = 0; i < FIELD_LENGTH; i++) {
            for (int j = 0; j < FIELD_LENGTH; j++) {
                if (field[i][j] == '=') {
                    return true; // Если на игровом поле осталась хотя бы одна палуба корабля, игрок считается живым.
                }
            }
        }
        return false; // Если ни одна палуба корабля не осталась целой на поле, игрок считается поверженным.
    }

    private static void placeShips(char[][] field, String playerName) {
        for (int[] shipInfo : SHIP_DECK_AMOUNT) {
            int shipDeck = shipInfo[0];
            int shipCount = shipInfo[1];

            for (int i = 0; i < shipCount; i++) {
                System.out.println(playerName + ", place a " + shipDeck + "-deck ship. Left: " + (shipCount - i));

                int result;
                int x, y, direction;
                do {
                    int[] shipCoordinates = getShipCoordinates(playerName);
                    x = shipCoordinates[0];
                    y = shipCoordinates[1];
                    direction = shipCoordinates[2];
                    result = validateCoordinateForShip(field, x, y, direction, shipDeck);
                } while (result != 0);

                if (direction == 1) {
                    for (int j = 0; j < shipDeck; j++) {
                        field[y][x + j] = '=';
                    }
                } else {
                    for (int j = 0; j < shipDeck; j++) {
                        field[y + j][x] = '=';
                    }
                }

                printField(field);
            }
        }
    }

    private static int[] getShipCoordinates(String playerName) {
        int[] coordinates = new int[3];
        System.out.println(playerName + ", please, input the x coordinate for your ship: ");
        coordinates[0] = scanner.nextInt();
        System.out.println(playerName + ", please, input the y coordinate for your ship: ");
        coordinates[1] = scanner.nextInt();
        System.out.println(playerName + ", please, input the direction of your ship (1 - horizontal, 2 - vertical): ");
        coordinates[2] = scanner.nextInt();
        return coordinates;
    }

    private static int validateCoordinateForShip(char[][] field, int x, int y, int direction, int shipDeck) {
        for (int i = 0; i < shipDeck - 1; i++) {
            if (direction == 1) { // horizontally
                if (x + i > 9 || y > 9 || field[y][x + i] == '=' || field[y + 1][x + i] == '=' || (y + 1) > 9) {
                    return -1;
                }
            } else if (direction == 2) { // vertically
                if (y + i > 9 || x > 9 || field[y + i][x] == '=' || field[y + i][x + 1] == '=' || (x + 1) > 9) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}