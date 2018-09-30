package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "employee")
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String adress;

    @Column
    private Date employmentDate;

    @OneToMany(mappedBy = "employee")
    private Set<Invoice> invoices;

    public Employee(String firstName, String lastName, String adress, Date employmentDate, Set<Invoice> invoices) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.employmentDate = employmentDate;
        this.invoices = invoices;
    }
}