package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Checkout;
import demo.rest.icbt.restau.demo.repo.CheckoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CheckoutController {

    @Autowired
    private CheckoutRepo checkoutRepo;

    @PostMapping("/checkout")
    Checkout newCheckout(@RequestBody Checkout newCheckout){
        return checkoutRepo.save(newCheckout);
    }

    @GetMapping("/viewcheckout")
    List<Checkout> getAllCheckout(){
        return checkoutRepo.findAll();
    }
}
