package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "salesman")
@NoArgsConstructor
public class Salesman extends Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer salesmanNumber;

    public Salesman(
            String firstName,
            String lastName,
            String adress,
            Date employmentDate,
            Set<Invoice> invoices,
            Integer salesmanNumber
    ) {
        super(
                firstName,
                lastName,
                adress,
                employmentDate,
                invoices);
        this.salesmanNumber = salesmanNumber;
    }
}