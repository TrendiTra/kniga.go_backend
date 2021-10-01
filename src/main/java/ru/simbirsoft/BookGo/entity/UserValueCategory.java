package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "userValueCategorySeqPK", sequenceName = "userValueCategorySeqPK")
@Entity
@Table(name = "UserValueCategory")
public class UserValueCategory {

    @Id
    @GeneratedValue(generator = "userValueCategorySeqPK")
    @Column(name = "idUserValueCategory", nullable = false)
    private int idUserValueCategory;

}
