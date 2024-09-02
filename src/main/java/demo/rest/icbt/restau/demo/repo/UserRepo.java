package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
