package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "bookResponseSeqPK", sequenceName = "bookResponseSeqPK")
@Entity
@Table(name = "BookResponse")
public class BookResponse {

    @Id
    @GeneratedValue(generator = "bookResponseSeqPK")
    @Column(name = "idBookResponse", nullable = false)
    private int idBookResponse;

    @ManyToOne(targetEntity = BookLiterary.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idBookLiterary", referencedColumnName = "idBookLiterary")
    private BookLiterary bookLiterary;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private User user;

    @Column(name = "createAt", nullable = false)
    private Date createAt;

    @Column(name = "response", nullable = false, length = 500)
    private String response;

    @Column(name = "note", length = 50)
    private String note;

}
