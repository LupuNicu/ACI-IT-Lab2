package org.example.onlinelibrary;

import java.util.Date;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Author {
    private String numeAutor;
    private String prenumeAutor;
    private String dataNasterii;
    private String nationaliteAutor;
    private int nrCarti;
}
