package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepo extends JpaRepository<Checkout, Long> {
}
