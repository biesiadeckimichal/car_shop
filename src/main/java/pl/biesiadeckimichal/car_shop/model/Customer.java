package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToMany //(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_car",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    private Set<Car> cars;

    @OneToMany(mappedBy = "customer")
    private Set<Transaction> transactions;


}
