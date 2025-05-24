package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    private final BookDto bookDto = new BookDto("1984", "Orwell");

    @InjectMocks
    private BookService bookService;

    @Test
    void shouldAddBook() {
        //Given
        //When
        bookService.addBook(bookDto);
        //Then
        assertEquals(1, bookService.getBooks().size());
    }

    @Test
    void shouldRemoveBook() {
        //Given
        bookService.addBook(bookDto);
        //When
        bookService.removeBook(bookDto);
        //Then
        assertEquals(0, bookService.getBooks().size());
    }
}