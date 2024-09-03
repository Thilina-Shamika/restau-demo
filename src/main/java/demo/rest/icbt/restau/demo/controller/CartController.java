package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Cart;
import demo.rest.icbt.restau.demo.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartRepo cartRepo;

    @PostMapping("/cart")
    Cart newCart(@RequestBody Cart newCart){
        return cartRepo.save(newCart);
    }

    @GetMapping("/viewcart")
    List<Cart> getAllCart(){
        return cartRepo.findAll();
    }
}
