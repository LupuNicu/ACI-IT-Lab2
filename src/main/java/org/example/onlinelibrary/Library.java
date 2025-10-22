package org.example.onlinelibrary;

import java.util.List;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Library {
    private String nameLibrary;
    private String adresa;
    private List<Book> books;
    private String Proprietar;

    @Autowired
    public Library(List<Author> authors, List<Book> books) {
        this.books = books;
    }
    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
