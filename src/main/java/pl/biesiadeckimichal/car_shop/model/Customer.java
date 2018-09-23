package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer customerNumber;

    @Column
    private String lastName;

    @Column
    private String firstName;

    @Column
    private String adress;

    @Column
    private Integer nip;

    @Column
    private Integer pesel;

}
