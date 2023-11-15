package com.telran.org.homework_8;

public class Publisher {
    private String name;
    private int foundingYear;

    public Publisher (String name, int foundingYear){
        this.name = name;
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }
}
