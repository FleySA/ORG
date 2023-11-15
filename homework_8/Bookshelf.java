package com.telran.org.homework_8;

import java.util.*;

public class Bookshelf {
    public static void main(String[] args) {
        Author author1 = new Author("Г.", "Климов ", 1928 );
        Author author2 = new Author("Л.", "Толстой ", 1970);
        Author author3 = new Author("А.", "Пушкин", 1878);
        Author author4 = new Author("С.", "Маршак", 1923);
        Author author5 = new Author("К.И.", "Чуковский", 1901);
        Author author6 = new Author("М.", "Булгаков", 1908);
        Author author7 = new Author("С.", "Есенин", 1890);
        Publisher publisher1 = new Publisher("Триумф.", 1995);
        Publisher publisher2 = new Publisher("Азбука - Аттикус. ", 1989);
        Publisher publisher3 = new Publisher("Феникс.", 1999);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("- Легион - ", author1, 300, 2005,publisher1));
        books.add(new Book("- Война и мир - ", author2, 250, 2010, publisher2));
        books.add(new Book("- Бородино - ", author3, 400, 2015, publisher3));
        books.add(new Book("- Для детей - ", author4, 320, 2020, publisher2));
        books.add(new Book("- Стихи и сказки - ", author5, 280, 2000, publisher1));
        books.add(new Book("- Мастер и Маргарита - ", author6, 350, 2011, publisher3));
        books.add(new Book("- Сборник стихов - ", author7, 220, 2008, publisher2));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите критерий сортировки (1 - по фамилии автора, 2 - по году издания книги, 3 - по издательству, 4 - по году рождения автора, 0 - выход):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Collections.sort(books, Comparator.comparing(book -> book.getAuthor().getLastName()));
                    break;
                case 2:
                    Collections.sort(books, Comparator.comparing(Book::getPublicationYear));
                    break;
                case 3:
                    Collections.sort(books, Comparator.comparing(book -> book.getPublisher().getName()));
                    break;
                case 4:
                    Collections.sort(books, Comparator.comparing(book -> book.getAuthor().getBirthYear()));
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

            System.out.println("КНИГИ НА ПОЛКЕ:");
            for (Book book : books) {
                //System.out.print(book.getTitle());
                System.out.print(book.getAuthor().getFullName() + book.getTitle() );
                System.out.print(book.getPageCount() + "стр. "  );
                System.out.print(book.getPublicationYear() + " год издания.");
                System.out.print(" Издательство: " + book.getPublisher().getName());
                System.out.print(" Год основания издательства: " + book.getPublisher().getFoundingYear());
                System.out.println();
            }
        }
    }
}
