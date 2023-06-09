package com.emmanuel.oauth2.oauth2sociallogin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("HELLO USER FROM A SECURED END POINT");
    }

}
