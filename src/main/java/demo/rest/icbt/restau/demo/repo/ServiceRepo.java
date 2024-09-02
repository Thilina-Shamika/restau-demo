package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Services, Long> {
}
