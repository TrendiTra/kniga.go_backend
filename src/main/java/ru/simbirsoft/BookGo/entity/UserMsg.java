package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.Date;

@SequenceGenerator(name = "userMsgSeqPK", sequenceName = "userMsgSeqPK")
@Entity
@Table(name = "UserMsg")
public class UserMsg {

    @Id
    @GeneratedValue(generator = "userMsgSeqPK")
    @Column(name = "idUserMsg", nullable = false)
    private int idUserMsg;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private User user;

    @Column(name = "createAt", nullable = false)
    private Date createAt;

    @Column(name = "text", nullable = false, length = 250)
    private String text;

    @Column(name = "notes", length = 150)
    private String notes;

    @ManyToOne(targetEntity = Status.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idStatus", referencedColumnName = "idStatus")
    private Status status;

    @Column(name = "type", nullable = false)
    private int type;

}
