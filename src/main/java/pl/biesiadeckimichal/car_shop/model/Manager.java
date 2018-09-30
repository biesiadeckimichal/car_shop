package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "manager")
@NoArgsConstructor
public class Manager extends Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Manager(
            String firstName,
            String lastName,
            String adress,
            Date employmentDate,
            Set<Invoice> invoices
    ) {
        super(
                firstName,
                lastName,
                adress,
                employmentDate,
                invoices);
    }
}