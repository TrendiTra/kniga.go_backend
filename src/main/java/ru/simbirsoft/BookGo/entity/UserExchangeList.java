package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "userExchangeListSeqPK", sequenceName = "userExchangeListSeqPK")
@Entity
@Table(name = "UserExchangeList")
public class UserExchangeList {

    @Id
    @GeneratedValue(generator = "userExchangeListSeqPK")
    @Column(name = "idUserExchangeList", nullable = false)
    private int idUserExchangeList;

}
