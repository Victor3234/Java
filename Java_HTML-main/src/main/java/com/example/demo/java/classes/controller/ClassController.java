package com.example.demo.java.classes.controller;

import com.example.demo.java.classes.entity.Authentication;
import com.example.demo.java.classes.repository.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
@RequiredArgsConstructor
public class ClassController {

    private final AuthenticationRepository authenticationRepository;

    @GetMapping()
    public String greetingForm() {
        return "index";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute Authentication user, Model model) throws SQLException {
        for (Authentication authentication : authenticationRepository.findAll()) {
            if (authentication.getUsername().equals(user.getUsername())) {
                model.addAttribute("error", "wrong credentials");
                return "index";
            }
        }

        authenticationRepository.save(new Authentication(user.getUsername(), user.getPassword()));
        return "redirect:result";
    }

    @GetMapping("/result")
    public String showResult(Model model) {
        model.addAttribute("users", authenticationRepository.findAll());
        return "result";
    }
}