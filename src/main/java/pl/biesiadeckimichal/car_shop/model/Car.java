package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;
import pl.biesiadeckimichal.car_shop.model.enums.FuelType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car")
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

    @ManyToMany(mappedBy = "cars")
    private Set<Customer> customers;

    @OneToMany(mappedBy = "car")
    private Set<Transaction> transactions;

    public Car(
            String vin,
            Integer year,
            String mark,
            String model,
            String oc_number,
            String registrationNumber,
            FuelType fuelType,
            Integer mileage,
            Integer engineCapacity,
            Integer power,
            String transmission,
            String description,
            Integer test_drive_counter,
            Set<Customer> customers,
            Set<Transaction> transactions
    ) {
        this.vin = vin;
        this.year = year;
        this.mark = mark;
        this.model = model;
        this.oc_number = oc_number;
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.transmission = transmission;
        this.description = description;
        this.test_drive_counter = test_drive_counter;
        this.customers = customers;
        this.transactions = transactions;
    }

    public Integer getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public Integer getYear() {
        return year;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getOc_number() {
        return oc_number;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public Integer getPower() {
        return power;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDescription() {
        return description;
    }

    public Integer getTest_drive_counter() {
        return test_drive_counter;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}
