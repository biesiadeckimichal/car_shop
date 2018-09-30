package pl.biesiadeckimichal.car_shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.biesiadeckimichal.car_shop.model.Car;

// reposytorium jest tylko do polaczenia z baza danych
// serwis korzysta z repozytorium do obslugi logiki biznesowej
public interface CarRepository extends JpaRepository<Car, Integer> {
}
