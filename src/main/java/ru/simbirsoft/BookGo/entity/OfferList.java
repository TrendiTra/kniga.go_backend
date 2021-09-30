package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "offerListSeqPK", sequenceName = "offerListSeqPK")
@Entity
@Table(name = "OfferList")
public class OfferList {

    @Id
    @GeneratedValue(generator = "offerListSeqPK")
    @Column(name = "idOfferList", nullable = false)
    private int idOfferList;

}
