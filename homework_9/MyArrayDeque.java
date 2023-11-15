package com.telran.org.homework_9;

// import com.telran.org.lesson_11.MyDeque;

public class MyArrayDeque implements MyDeque {

    private static final int DEFAULT_CAPACITY = 10;
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    // public MyArrayDeque(){
    //  elements = new Integer[DEFAULT_CAPACITY];
    //}
    public MyArrayDeque() {
        elements = new Integer[DEFAULT_CAPACITY];
        headIndex = 0;
        tailIndex = 0;
        countOfElements = 0;
    }

    @Override
    public void addToHead(Integer element) {
        if (countOfElements == elements.length) {
            grow();
        }
        if (headIndex == 0) {
            headIndex = elements.length - 1;
        } else {
            headIndex--;
        }
        elements[headIndex] = element;
        countOfElements++;

    }


    @Override
    public void addTotail(Integer element) {
        if (countOfElements == elements.length) {
            grow();
        }
        elements[tailIndex] = element;
        tailIndex = (tailIndex + 1) % elements.length;
        countOfElements++;

    }

    @Override
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) {
            return null;
        }
        Integer removedElement = elements[headIndex];
        elements[headIndex] = null;
        headIndex = (headIndex + 1) % elements.length;
        countOfElements--;
        return removedElement;
    }

    @Override
    public Integer removeTail() {
        if (isEmpty()) {
            return null;
        }
        if (tailIndex == 0) {
            tailIndex = elements.length - 1;
        } else {
            tailIndex--;
        }
        Integer removedElement = elements[tailIndex];
        elements[tailIndex] = null;
        countOfElements--;
        return removedElement;

    }

    @Override
    public Integer peekHead() {
        if (isEmpty()) {
            return null;
        }
        return elements[headIndex];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            return null;
        }
        if (tailIndex == 0) {
            return elements[elements.length - 1];
        } else {
            return elements[tailIndex - 1];
        }
    }

    private void grow() {
        int newCapacity = (int) (elements.length * 1.5);
        Integer[] newElements = new Integer[newCapacity];
        for (int i = 0; i < countOfElements; i++) {
            newElements[i] = elements[(headIndex + i) % elements.length];
        }
        elements = newElements;
        headIndex = 0;
        tailIndex = countOfElements;
        // elements * 1.5
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < countOfElements; i++) {
            sb.append(elements[(headIndex + i) % elements.length]);
            if (i < countOfElements - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
