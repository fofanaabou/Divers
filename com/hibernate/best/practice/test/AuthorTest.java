package com.hibernate.best.practice.test;

import com.hibernate.best.practice.Author;
import com.hibernate.best.practice.Book;
import com.hibernate.best.practice.Genre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class AuthorTest {

    Author author;
    List<Book> books;

    @BeforeEach
    void setUp() {
        author = new Author();
        author.setId(1L);
        author.setAge(33);
        author.setName("Abou");
        author.setGenre((Genre.MALE));

        books = List.of(
                new Book("How to become displined", "1339834LB"),
                new Book("The path toward the success", "1839834AB"),
                new Book("The power of silent", "1369834LB")
        );

    }

    @Test
    void addBook() {
        books.forEach(author::addBook);
        Assertions.assertEquals(author.getBooks().size(), 3);
    }

    @Test
    void removeBook() {
    }

    @Test
    void removeBooks() {
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getBooks() {
    }

    @Test
    void setBooks() {
    }
}