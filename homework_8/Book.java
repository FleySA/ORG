package com.telran.org.homework_8;

public class Book {
    private String title;
    private Author author;
    private int pageCount;
    private int publicationYear;
    private Publisher publisher;

    public Book(String title, Author author, int pageCount, int publicationYear, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
