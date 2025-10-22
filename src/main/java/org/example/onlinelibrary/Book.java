package org.example.onlinelibrary;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Book {
    private int id;
    private String title;
    private Author author;
    private float price;
    private int nrCarti;

    @Autowired
    public Book(Author author){
        this.author = author;
    }
    @Autowired
    public void setAuthor(Author author){
        this.author = author;
    }

}

