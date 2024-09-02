package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
