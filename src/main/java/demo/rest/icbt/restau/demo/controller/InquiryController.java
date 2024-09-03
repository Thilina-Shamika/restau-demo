package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Inquiry;
import demo.rest.icbt.restau.demo.repo.InquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InquiryController {

    @Autowired
    private InquiryRepo inquiryRepo;

    @PostMapping("/addinquiry")
    Inquiry newInquiry(@RequestBody Inquiry newInquiry){
        return inquiryRepo.save(newInquiry);
    }

    @GetMapping("/viewinquiries")
    List<Inquiry> getAllInquiry(){
        return inquiryRepo.findAll();
    }
}
