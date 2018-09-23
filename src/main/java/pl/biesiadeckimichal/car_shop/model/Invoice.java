package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "invoices")
@NoArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer invoice_number;


}
