package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.NewOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewOrderRepo extends JpaRepository<NewOrder, Long> {
}
