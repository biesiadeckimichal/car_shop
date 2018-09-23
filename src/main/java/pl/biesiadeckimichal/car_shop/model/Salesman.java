package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Salesman extends Employee {

    @Column
    private Integer salesmanNumber;

}
