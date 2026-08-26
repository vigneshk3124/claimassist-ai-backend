package com.tvs.claimassist.backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        if (request.getEmployeeId() != null && !request.getEmployeeId().isEmpty()
                && request.getPassword() != null && !request.getPassword().isEmpty()) {
            return new LoginResponse(
                    "fake-jwt-token-" + System.currentTimeMillis(),
                    "Login successful"
            );
        } else {
            return new LoginResponse(null, "Invalid credentials");
        }
    }
}
