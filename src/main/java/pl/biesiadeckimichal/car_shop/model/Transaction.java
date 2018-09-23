package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;
import pl.biesiadeckimichal.car_shop.model.enums.TransactionType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions")
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private TransactionType transactionType;

    @Column
    private Date date;

    @Column
    private Double value;

    @ManyToOne //(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne //(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;
}
