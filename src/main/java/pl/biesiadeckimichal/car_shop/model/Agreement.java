package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "agreement")
@NoArgsConstructor
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;

    @OneToOne
    private Transaction transaction;

    @OneToOne
    private Invoice invoice;

    public Agreement(String content, Transaction transaction, Invoice invoice) {
        this.content = content;
        this.transaction = transaction;
        this.invoice = invoice;
    }

}