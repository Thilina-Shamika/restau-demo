package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
