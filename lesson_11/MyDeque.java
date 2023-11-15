package com.telran.org.lesson_11;

public interface MyDeque {
    void addToHead(Integer element);

    void addTotail(Integer element);
    boolean isEmpty();
    Integer removeHead();

    Integer removeTail();

    Integer peekHead();

    Integer peekTail();

}
