package com.turnkeyafrica.turnkeytraining.quotationsservice.v1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("QuotationsControllerVersion1")
@RequestMapping("${turnkey.app.v1.context-path}/quotations")
public class QuotationsController {
    @GetMapping
    public String getAllQuotes(){
        return "All Quotations V1";
    }
}
