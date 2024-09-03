package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.NewOrder;
import demo.rest.icbt.restau.demo.repo.NewOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewOrderController {

    @Autowired
    private NewOrderRepo newOrderRepo;

    @PostMapping("/orders")
    NewOrder createOrder(@RequestBody NewOrder createOrder){
        return newOrderRepo.save(createOrder);
    }

    @GetMapping("/vieworders")
    List<NewOrder> getAllOrders(){
        return newOrderRepo.findAll();
    }
}
