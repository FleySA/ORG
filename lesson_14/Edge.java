package com.telran.org.lesson_14;

public class Edge {

    private int source;
    private int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    /*

      3  - > 2
      ^
      |
      4

    new Edge( 3 , 2)
    new Edge( 4,  3)
     */

}