package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "userListSeqPK", sequenceName = "userListSeqPK")
@Entity
@Table(name = "UserList")
public class UserList {

    @Id
    @GeneratedValue(generator = "userListSeqPK")
    @Column(name = "idUserList", nullable = false)
    private int idUserList;

}
