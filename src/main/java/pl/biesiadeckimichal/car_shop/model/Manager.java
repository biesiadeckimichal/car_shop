package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Manager extends Employee {

}
