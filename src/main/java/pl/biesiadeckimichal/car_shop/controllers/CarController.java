package pl.biesiadeckimichal.car_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.biesiadeckimichal.car_shop.dto.CarDto;
import pl.biesiadeckimichal.car_shop.model.Car;
import pl.biesiadeckimichal.car_shop.repositories.CarRepository;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "car/list";
    }

    @GetMapping("/{id}/edit")
    public String showEditCar(@PathVariable("id") Integer id, Model model) {
        Car first = carRepository.findById(id).get();
//        do "car" przypisuje teraz obiekt znaleziony przez first, a nastepnie ten obiekt przekazuje
//        edit.html - th:object="${car}" i dzialam na jego polach
        model.addAttribute("car", first);
        return "car/edit";
    }

    @GetMapping("/add")
    public String showAddNewCar(Model model) {
        model.addAttribute("carDto", new CarDto());
        return "car/edit";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("carDto") CarDto carDto) {

        Car car = new Car(
                id
                vin
                year
                mark
                model
                oc_number
                registrationNumber
                fuelType
                mileage
                engineCapacity
                power
                transmission
                description
                test_drive_counter
        )

        carRepository.save(car);
        return "redirect:/car/list";
    }
}
