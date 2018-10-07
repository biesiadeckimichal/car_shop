package pl.biesiadeckimichal.car_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.biesiadeckimichal.car_shop.model.Customer;
import pl.biesiadeckimichal.car_shop.repositories.CustomerRepository;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/edit_list")
    public String showEditList(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        return "customer/edit_list";
    }

//    @PathVariable powoduje przeniesienie tego co wpisujemy w url (czyli tego co jest w getMapping)
//    w tym przypadku id, do pola metody showEditCustomer
//    "customer" w tym przypadku odnosi sie do thymleaf'a ktory pozniej wpisujemy w plikuk html
    @GetMapping("/{id}/edit")
    public String showEditCustomer(@PathVariable("id") Integer id, Model model) {
        Customer first = customerRepository.findById(id).get();
        model.addAttribute("customer", first);
        return "customer/edit";
    }

    @GetMapping("/add")
    public String showAddNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/edit";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteCustomer(@PathVariable("id") Integer id) {
        customerRepository.deleteById(id);
        return "redirect:/customer/edit_list";
    }

}
