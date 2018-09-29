package pl.biesiadeckimichal.car_shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.biesiadeckimichal.car_shop.model.Customer;

@Controller
@RequestMapping("/template/customer")
public class CustomerController {

    public static final Customer[] customers =
            new Customer[] {
                    new Customer(1,"Michal","Pierwszy"),
                    new Customer(2,"Michal","Drugi"),
                    new Customer(3,"Michal","Trzeci")
            };

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("customers", customers);
        return "customer/list"; // ta linijka odwoluje sie do sciezki w ktorej mamy nasz plik html
    }

//    @PathVariable powoduje przeniesienie tego co wpisujemy w url (czyli tego co jest w getMapping)
//    w tym przypadku id, do pola metody showEditCustomer
//    "customer" w tym przypadku odnosi sie do thymleaf'a ktory pozniej wpisujemy w plikuk html
//    @GetMapping("/{id}/edit")
//    public String showEditCustomer(@PathVariable("id") Integer id, Model model) {
//        Customer first = Arrays.stream(customers).filter(c -> c.getId().equals(id)).findFirst().get();
//        model.addAttribute("customer", first);
//        return  "customer/edit";
//    }




}