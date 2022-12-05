package com.example.demo.java.classes.controller;

import com.example.demo.java.classes.Request.RequestDTO;
import com.example.demo.java.classes.repository.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import java.text.SimpleDateFormat;

//@Controller
@RestController
@RequiredArgsConstructor
public class TestController {
    private final AuthenticationRepository authenticationRepository;
/*
    @GetMapping("/test")
    @ResponseBody
    public String test(@RequestParam("login") String userName, @RequestParam("password") String passWord,
                       @ModelAttribute Authentication humanDTO, Model model) throws SQLException {

        humanDTO.setUsername(userName);
        humanDTO.setPassword(passWord);

        for (Authentication authentication : authenticationRepository.findAll()) {

            System.out.println(humanDTO.getUsername() + " " + humanDTO.getPassword());

            if (authentication.getUsername().equals(humanDTO.getUsername())) {
                model.addAttribute("error", "wrong credentials");
                return "User already exits ! ";
            }
        }

        authenticationRepository.save(new Authentication(humanDTO.getUsername(), humanDTO.getPassword()));
        return "User successfully added !\nUsername [ " + userName + " ] \nPassword [ " + passWord + " ]";
    }*/

//    la tine in afara de autentificare in DTO va fi un oarecare task si automat se va pune ziua de astazi.
//    Adica va fi obiectul Task cu descrierea si timpul crearii.

    @PostMapping("/user")
    public RequestDTO registerUserCredential(@RequestBody RequestDTO user) {
//        String message = "Abcdefg";
//
//
//        user.getMesage().setMessage(message);
//        System.out.println("User ID: " +  user.getUser().getUsername());
//        System.out.println("User ID: " +  user.getUser().getPassword());
        System.out.println(user);
        return user;
    }
}