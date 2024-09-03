package demo.rest.icbt.restau.demo.controller;

import demo.rest.icbt.restau.demo.model.User;
import demo.rest.icbt.restau.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/adduser")
    User newUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

    @GetMapping("/viewuser")
    List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
