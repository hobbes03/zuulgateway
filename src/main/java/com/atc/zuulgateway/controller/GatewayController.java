package com.atc.zuulgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/available")
    public String available() {
        return "This book is available";
    }

}
