package com.nagendra.springdatajpaencryption.controller;


import com.nagendra.encryptiondecryption.service.AttributeConverterImpl;
import com.nagendra.springdatajpaencryption.entity.User;
import com.nagendra.springdatajpaencryption.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserDetailsController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AttributeConverterImpl attributeConverter;


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> saveUser(@RequestBody User user){
        System.out.println("UserController.saveUser");
        String encMobile = attributeConverter.convertToDatabaseColumn(user.getMobile());
        user.setMobile(encMobile);
        return ResponseEntity.ok(userRepository.save(user));
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserDetails(@PathVariable("id") int id) {
        Optional<User> optionalUserDetails = userRepository.findById(id);
        System.out.println("optionalUserDetails.get() = " + optionalUserDetails.get());
        User user = optionalUserDetails.get();
        String encMobile = user.getMobile();
        String decMobile = attributeConverter.convertToEntityAttribute(encMobile);
        user.setMobile(decMobile);
        return ResponseEntity.ok(optionalUserDetails.isPresent() ? user : null);
    }
}