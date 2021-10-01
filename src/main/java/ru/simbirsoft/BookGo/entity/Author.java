package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@SequenceGenerator(name = "authorSeqPK", sequenceName = "authorSeqPK")
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(generator = "authorSeqPK")
    @Column(name = "idAuthor", nullable = false)
    private int idAuthor;

    @Column(name = "fisrtName", nullable = false, length = 50)
    private String fisrtName;

    @Column(name = "lastName", nullable = false, length = 20)
    private String lastName;

    @OneToMany(targetEntity = Author.class, mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BookLiterary> bookLiteraries = new HashSet<>();

}
