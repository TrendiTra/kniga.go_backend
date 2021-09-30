package ru.simbirsoft.BookGo.entity;

import javax.persistence.*;

@SequenceGenerator(name = "userAddressSeqPK", sequenceName = "userAddressSeqPK")
@Entity
@Table(name = "UserAddress")
public class UserAddress {

    @Id
    @GeneratedValue(generator = "userAddressSeqPK")
    @Column(name = "idUserAddress", nullable = false)
    private int idUserAddress;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    private User user;

    @Column(name = "addrIndex", nullable = false, length = 6)
    private String addrIndex;

    @Column(name = "addrCity", nullable = false, length = 15)
    private String addrCity;

    @Column(name = "addrStreet", nullable = false, length = 25)
    private String addrStreet;

    @Column(name = "addrHouse", nullable = false, length = 5)
    private String addrHouse;

    @Column(name = "addrStructure", length = 10)
    private String addrStructure;

    @Column(name = "addrApart", length = 3)
    private String addrApart;

    @Column(name = "isDefault", nullable = false, columnDefinition = "boolean default false")
    private boolean isDefault;

}
