package com.telran.org.homework_7;

import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {
    private int[] integers;
    private int currentIndex;

    public CustomIterator(int[] integers) {
        this.integers = integers;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < integers.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int nextValue = integers[currentIndex];
            currentIndex++;
            return nextValue;
        }
        throw new java.util.NoSuchElementException();
    }

}