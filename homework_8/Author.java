package com.telran.org.homework_8;

public class Author {
    private String lastName;
    private String firstName;
    private int birthYear;

    public Author( String firstName, String lastName,int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public  String getFullName(){
        return firstName + lastName + " " + birthYear + "г.р. ";
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
