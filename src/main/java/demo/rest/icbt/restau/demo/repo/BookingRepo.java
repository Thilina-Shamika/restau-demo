package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Long> {
}
