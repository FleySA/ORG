package com.telran.org.lesson_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<List<Integer>> adjacencyList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        int vertex = 0;
        for (Edge edge : edges) {
            vertex = Math.max(vertex, Math.max(edge.getSource(), edge.getDestination()));
        }
        for (int i = 0; i <= vertex; i++) {
            adjacencyList.add(i, new LinkedList<>());
        }

        for (Edge current : edges) {
            List<Integer> integerList = adjacencyList.get(current.getSource());
            integerList.add(current.getDestination());
        }
    }

    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<List<Integer>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
}