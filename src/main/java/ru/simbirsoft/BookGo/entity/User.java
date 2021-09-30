package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SequenceGenerator(name = "userSeqPK", sequenceName = "userSeqPK")
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(generator = "userSeqPK")
    @Column(name = "idUser", nullable = false)
    private int idUser;

    @Column(name = "fisrtName", nullable = false, length = 25)
    private String fisrtName;

    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "secondName", length = 25)
    private String secondName;

    @Column(name = "email", nullable = false, length = 15)
    private String email;

    @Column(name = "userName", nullable = false, length = 20)
    private String userName;

    @Column(name = "password", nullable = false, length = 15)
    private String password;

    @Column(name = "rating", nullable = false, columnDefinition = "integer default 0")
    private int rating;

    @Column(name = "createdAt", nullable = false)
    private Date createdAt;

    @Column(name = "enabled", nullable = false, columnDefinition = "boolean default true")
    private boolean enabled;

    @Lob
    @Column(name = "avatar", columnDefinition="BLOB")
    private byte[] avatar;

    @Column(name = "isStaff", nullable = false, columnDefinition = "boolean default false")
    private boolean isStaff;

    @Column(name = "isSuperAdmin", nullable = false, columnDefinition = "boolean default false")
    private boolean isSuperAdmin;

    @OneToMany(targetEntity = BookResponse.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BookResponse> bookResponses = new HashSet<>();

    @OneToMany(targetEntity = UserAddress.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserAddress> userAddresses = new HashSet<>();

    @OneToMany(targetEntity = UserMsg.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserMsg> userMsgs = new HashSet<>();

}
