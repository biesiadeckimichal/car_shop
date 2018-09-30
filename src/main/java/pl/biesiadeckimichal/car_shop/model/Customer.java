package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_car",
            joinColumns = {@JoinColumn(name = "customer_id")},
            inverseJoinColumns = {@JoinColumn(name = "car_id")}
    )
    private Set<Car> cars;

    @OneToMany(mappedBy = "customer")
    private Set<Transaction> transactions;

    public Customer(
            Integer id,
            Integer customerNumber,
            String lastName,
            String firstName,
            String adress,
            Integer nip,
            Integer pesel,
            Set<Car> cars,
            Set<Transaction> transactions
    ) {
        this.customerNumber = customerNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adress = adress;
        this.nip = nip;
        this.pesel = pesel;
        this.cars = cars;
        this.transactions = transactions;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getNip() {
        return nip;
    }

    public Integer getPesel() {
        return pesel;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}