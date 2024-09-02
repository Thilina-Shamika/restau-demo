package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Booking;
import demo.rest.icbt.restau.demo.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private BookingRepo bookingRepo;

    @PostMapping("/booking")
    Booking newBooking(@RequestBody Booking newBooking){
        return bookingRepo.save(newBooking);
    }
}
