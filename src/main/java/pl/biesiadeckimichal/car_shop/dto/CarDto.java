package pl.biesiadeckimichal.car_shop.dto;

import pl.biesiadeckimichal.car_shop.model.enums.FuelType;

public class CarDto {
    private Integer id;
    private String vin;
    private Integer year;
    private String mark;
    private String model;
    private String oc_number;
    private String registrationNumber;
    private FuelType fuelType;
    private Integer mileage;
    private Integer engineCapacity;
    private Integer power;
    private String transmission;
    private String description;
    private Integer test_drive_counter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOc_number() {
        return oc_number;
    }

    public void setOc_number(String oc_number) {
        this.oc_number = oc_number;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTest_drive_counter() {
        return test_drive_counter;
    }

    public void setTest_drive_counter(Integer test_drive_counter) {
        this.test_drive_counter = test_drive_counter;
    }
}
