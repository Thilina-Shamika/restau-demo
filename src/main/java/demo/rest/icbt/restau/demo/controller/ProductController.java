package demo.rest.icbt.restau.demo.controller;


import demo.rest.icbt.restau.demo.exception.ProductNotFoundException;
import demo.rest.icbt.restau.demo.model.Product;
import demo.rest.icbt.restau.demo.repo.ProductRepo;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {



    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/addproduct")
    Product newProduct(@RequestBody Product newProduct){
        return productRepo.save(newProduct);
    }

    @GetMapping("/viewproduct")
    List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @GetMapping("viewproduct/{id}")
    Product getProductById(@PathVariable Long id){
        return productRepo.findById(id)
                .orElseThrow(()-> new ProductNotFoundException(id));
    }

    @PutMapping("/viewproduct/{id}")
    Product updateProduct(@RequestBody Product newProduct, @PathVariable Long id){
        return productRepo.findById(id)
            .map(product -> {
                product.setProdName(newProduct.getProdName());
                product.setProdImage(newProduct.getProdImage());
                product.setProdPrice(newProduct.getProdPrice());
                return productRepo.save(product);
        }).orElseThrow(()-> new ProductNotFoundException(id));
    }

    @DeleteMapping("/viewproduct/{id}")
    String deleteProduct(@PathVariable Long id){
        if (!productRepo.existsById(id)){
            throw new ProductNotFoundException(id);
        }productRepo.deleteById(id);
        return "Product with id" + id + " has been deleted success";

       }


}
