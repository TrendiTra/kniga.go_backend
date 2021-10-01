package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "wishListSeqPK", sequenceName = "wishListSeqPK")
@Entity
@Table(name = "WishList")
public class WishList {

    @Id
    @GeneratedValue(generator = "wishListSeqPK")
    @Column(name = "idWishList", nullable = false)
    private int idWishList;

}
