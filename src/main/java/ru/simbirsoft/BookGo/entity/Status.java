package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@SequenceGenerator(name = "statusSeqPK", sequenceName = "statusSeqPK")
@Entity
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue(generator = "statusSeqPK")
    @Column(name = "idStatus", nullable = false)
    private int idStatus;

    @Column(name = "name", nullable = false, unique = true, length = 10)
    private String name;

    @OneToMany(targetEntity = UserMsg.class, mappedBy = "status", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserMsg> userMsgs = new HashSet<>();

}
