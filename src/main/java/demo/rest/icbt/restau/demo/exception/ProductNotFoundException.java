package demo.rest.icbt.restau.demo.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id){
        super("product not found "+ id);
    }
}
