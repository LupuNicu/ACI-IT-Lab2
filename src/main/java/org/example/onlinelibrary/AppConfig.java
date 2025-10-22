package org.example.onlinelibrary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Library library() {
        return new Library("Biblioteca Centrală", "Cluj-Napoca, România",
                List.of(book()), "Universitatea Babeș-Bolyai");
    }

    @Bean
    public Book book() {
        return new Book(1, "Faust", author(), 39.99f, 20);
    }

    @Bean
    public Author author() {
        return new Author("Goethe", "Johann Wolfgang", "15.03.1975",
                "Germană", 10);
    }



}
