package org.example;

import java.awt.print.Book;
import java.util.List;
public interface BookRepository {
    // Метод для поиска книг по автору
    List<Book> findBooksByAuthor(String author);
}
