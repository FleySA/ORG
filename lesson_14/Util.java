package com.telran.org.lesson_14;

public class Util {

    public static void printGraph(Graph graph) {
        int source = 0;
        int size = graph.getAdjacencyList().size();

        if (source < size) {
            do {
                for (int dest : graph.getAdjacencyList().get(source)) {
                    System.out.println("[" + source + " -> " + dest + "]");
                }
                System.out.println();
                source++;

            } while (source < size);
        }
    }
}