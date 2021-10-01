package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "categorySeqPK", sequenceName = "categorySeqPK")
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(generator = "categorySeqPK")
    @Column(name = "idCategory", nullable = false)
    private int idCategory;

}
