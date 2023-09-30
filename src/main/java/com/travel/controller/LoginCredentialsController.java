package com.travel.controller;

import com.travel.dto.LoginCredentialsDto;
import com.travel.dto.LoginDto;
import com.travel.entity.LoginMessage;
import com.travel.service.LoginCredentialsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class LoginCredentialsController {
    @Autowired
    private LoginCredentialsService lcService;
    @PostMapping(path = "/save")
    public String saveLoginDetails(@RequestBody LoginCredentialsDto lcDto)
    {
        String name = lcService.addUser(lcDto);
        return name;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto lDto)
    {
    	LoginMessage loginMessage = lcService.loginUser(lDto);
        return ResponseEntity.ok(loginMessage);
    }
}