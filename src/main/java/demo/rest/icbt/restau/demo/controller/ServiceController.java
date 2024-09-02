package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.Services;
import demo.rest.icbt.restau.demo.repo.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private ServiceRepo serviceRepo;

    @PostMapping("/addservices")
    Services newService(@RequestBody Services newService){
        return serviceRepo.save(newService);
    }

}
