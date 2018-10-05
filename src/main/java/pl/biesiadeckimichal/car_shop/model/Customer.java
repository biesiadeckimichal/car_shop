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
    private String customerNumber;

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

    public Integer getId() {
        return id;
    }

    public String getCustomerNumber() {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}