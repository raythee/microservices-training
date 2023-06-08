package com.turnkeyafrica.turnkeytraining.underwritingservice.v1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("PoliciesControllerVersion1")
@RequestMapping("${turnkey.app.v1.context-path}/policies")
public class PoliciesController {
    @GetMapping
    public String getAllPolicies(){
        return "All policies v1";
    }
}
