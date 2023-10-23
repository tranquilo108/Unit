package org.example;

import java.awt.print.Book;
import java.util.List;
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findBooksByAuthor(author);
    }
}
