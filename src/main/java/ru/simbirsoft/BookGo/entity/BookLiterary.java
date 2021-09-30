package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@SequenceGenerator(name = "bookLiterarySeqPK", sequenceName = "bookLiterarySeqPK")
@Entity
@Table(name = "BookLiterary")
public class BookLiterary {

    @Id
    @GeneratedValue(generator = "bookLiterarySeqPK")
    @Column(name = "idBookLiterary", nullable = false)
    private int idBookLiterary;

    @ManyToOne(targetEntity = Author.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idAuthor", referencedColumnName = "idAuthor")
    private Author author;

    @Column(name = "bookName", nullable = false, length = 50)
    private String bookName;

    @Column(name = "note", length = 50)
    private String note;

    @OneToMany(targetEntity = BookResponse.class, mappedBy = "bookLiterary", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BookResponse> bookResponses = new HashSet<>();

}
