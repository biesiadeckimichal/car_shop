package pl.biesiadeckimichal.car_shop.dto;

import lombok.NoArgsConstructor;
import pl.biesiadeckimichal.car_shop.model.Customer;

@NoArgsConstructor
public class CustomerDto {
    private Integer id;
    private Integer customerNumber;
    private String lastName;
    private String firstName;
    private String adress;
    private Integer nip;
    private Integer pesel;

    public CustomerDto(Customer customer) {
        this.id = customer.getId();
        this.id = customer.getId();
        this.customerNumber = customer.getCustomerNumber();
        this.lastName = customer.getLastName();
        this.firstName = customer.getFirstName();
        this.adress = customer.getAdress();
        this.nip = customer.getNip();
        this.pesel = customer.getPesel();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }
}
