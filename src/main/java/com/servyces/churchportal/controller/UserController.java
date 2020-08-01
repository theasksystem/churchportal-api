package com.servyces.churchportal.controller;

import com.servyces.churchportal.model.Person;
import com.servyces.churchportal.model.User;
import com.servyces.churchportal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<Person> validate(@NonNull @RequestBody User user) {
        Person person = userService.signIn(user);
        if(user.getEmail().equals(person.getEmail()) && user.getPassword().equals(person.getPassword())) {
            return new ResponseEntity<Person>(userService.signIn(user), HttpStatus.OK);
        } else  {
            return new ResponseEntity<Person>(person, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{person}")
    public @ResponseBody Optional<Person> getPersonById(@PathVariable("person") long person_id) {
        return userService.getPersonById(person_id);
    }

    @PostMapping("/signup")
    public @ResponseBody String signUp(@NonNull @RequestBody Person person) {
        userService.signUp(person);
        return "User Added Successfully";
    }

    @PostMapping("/update")
    public @ResponseBody String updateProfile(@NonNull @RequestBody Person person) {
        userService.updateProfile(person);
        return "Profile Updated Successfully";
    }
}
