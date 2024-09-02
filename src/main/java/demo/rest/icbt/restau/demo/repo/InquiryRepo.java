package demo.rest.icbt.restau.demo.repo;

import demo.rest.icbt.restau.demo.model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepo extends JpaRepository<Inquiry, Long> {
}
