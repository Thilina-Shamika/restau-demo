package demo.rest.icbt.restau.demo.controller;


import demo.rest.icbt.restau.demo.model.Product;
import demo.rest.icbt.restau.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/addproduct")
    Product newProduct(@RequestBody Product newProduct){
        return productRepo.save(newProduct);
    }


}
