package com.example.demo.java.classes.Request;

import com.example.demo.java.classes.dto.HumanDTO;
import com.example.demo.java.classes.dto.Mesage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {
    Mesage mesage = new Mesage();
    HumanDTO user = new HumanDTO();
}