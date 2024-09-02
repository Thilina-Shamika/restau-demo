package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
