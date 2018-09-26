package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer invoice_number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Invoice(Integer invoice_number, Employee employee) {
        this.invoice_number = invoice_number;
        this.employee = employee;
    }
}
