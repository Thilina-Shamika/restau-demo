package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Order;
import demo.rest.icbt.restau.demo.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @PostMapping("/order")
    Order newOder(@RequestBody Order newOrder){
        return orderRepo.save(newOrder);
    }
}
