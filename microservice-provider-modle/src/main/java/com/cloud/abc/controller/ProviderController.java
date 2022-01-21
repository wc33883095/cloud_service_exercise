package com.cloud.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProviderController {
    @GetMapping("/get/{id}")
    public String get(@PathVariable String id) {
        return id;
    }
}
