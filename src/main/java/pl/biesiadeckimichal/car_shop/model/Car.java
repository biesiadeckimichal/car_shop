package pl.biesiadeckimichal.car_shop.model;

import lombok.NoArgsConstructor;
import pl.biesiadeckimichal.car_shop.model.enums.FuelType;
import pl.biesiadeckimichal.car_shop.model.enums.Transmission;

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
    private Transmission transmission;

    @Column
    private String description;

    @Column
    private Integer test_drive_counter;

    @ManyToMany(mappedBy = "cars")
    private Set<Customer> customers;

    @OneToMany(mappedBy = "car")
    private Set<Transaction> transactions;

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

    public Transmission getTransmission() {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOc_number(String oc_number) {
        this.oc_number = oc_number;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTest_drive_counter(Integer test_drive_counter) {
        this.test_drive_counter = test_drive_counter;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
