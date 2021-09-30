package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "exchangeListSeqPK", sequenceName = "exchangeListSeqPK")
@Entity
@Table(name = "ExchangeList")
public class ExchangeList {

    @Id
    @GeneratedValue(generator = "exchangeListSeqPK")
    @Column(name = "idExchangeList", nullable = false)
    private int idExchangeList;

}
