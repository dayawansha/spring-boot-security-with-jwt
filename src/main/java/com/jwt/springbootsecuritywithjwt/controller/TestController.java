package com.jwt.springbootsecuritywithjwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String updateEntity() throws Exception {
        return "Hallow Test World";
    }


}
