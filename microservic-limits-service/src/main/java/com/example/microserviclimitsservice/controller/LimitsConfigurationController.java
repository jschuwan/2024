package com.example.microserviclimitsservice.controller;

import com.example.microserviclimitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private LimitsConfiguration mylimits;
    @GetMapping("/Limits")
    public LimitsConfiguration returnLimits(){
        return new LimitsConfiguration(mylimits.getMaximum(),mylimits.getMinimum());
    }
}
