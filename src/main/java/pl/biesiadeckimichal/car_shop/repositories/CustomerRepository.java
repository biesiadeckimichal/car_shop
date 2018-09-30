package pl.biesiadeckimichal.car_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.biesiadeckimichal.car_shop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
