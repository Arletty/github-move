package com.isj.gestion_hospitaliere.controllers;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Data
@Controller
public class HopitalContolleur {
    @GetMapping("/")
    public String index(){return "EnregistrerClient.html";}
}
