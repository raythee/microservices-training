package com.turnkeyafrica.turnkeytraining.underwritingservice.v2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("PoliciesControllerVersion2")
@RequestMapping("${turnkey.app.v2.context-path}/policies")
public class PoliciesController {
    @GetMapping
    public String getAllPolicies(){
        return "All policies v2";
    }
}
