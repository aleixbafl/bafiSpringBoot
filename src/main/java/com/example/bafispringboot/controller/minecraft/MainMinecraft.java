package com.example.bafispringboot.controller.minecraft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMinecraft {
    @GetMapping("/minecraft")
    public String minecraft() {
        return "minecraft/index";
    }
}
