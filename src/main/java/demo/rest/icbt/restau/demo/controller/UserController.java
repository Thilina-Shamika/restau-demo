package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.User;
import demo.rest.icbt.restau.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/adduser")
    User newUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }
}
