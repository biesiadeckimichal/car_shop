package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;
import pl.biesiadeckimichal.car_shop.model.enums.FuelType;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String vin;

    @Column
    private Integer year;

    @Column
    private String mark;

    @Column
    private String model;

    @Column
    private String oc_number;

    @Column
    private String registrationNumber;

    @Column
    private FuelType fuelType;

    @Column
    private Integer mileage;

    @Column
    private Integer engineCapacity;

    @Column
    private Integer power;

    @Column
    private String transmission;

    @Column
    private String description;

    @Column
    private Integer test_drive_counter;

}
