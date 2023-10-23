import org.example.BookRepository;
import org.example.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Test
    public void testFindBooksByAuthor() {
        // Создаем мок-объект BookRepository
        BookRepository bookRepository = Mockito.mock(BookRepository.class);

        // Создаем экземпляр BookService, передавая мок-объект в конструктор
        BookService bookService = new BookService(bookRepository);

        // Задаем поведение мок-объекта
        List<Book> expectedBooks = new ArrayList<>();
        when(bookRepository.findBooksByAuthor("John Doe")).thenReturn(expectedBooks);

        // Вызываем метод, который мы хотим протестировать
        List<Book> result = bookService.findBooksByAuthor("John Doe");

        // Проверяем, что метод bookRepository.findBooksByAuthor() был вызван с правильными аргументами
        verify(bookRepository).findBooksByAuthor("John Doe");

        // Проверяем, что результат соответствует ожиданиям
        assertEquals(expectedBooks, result);
    }
}
