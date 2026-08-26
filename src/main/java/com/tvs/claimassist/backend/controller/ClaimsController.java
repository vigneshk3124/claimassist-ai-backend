package com.tvs.claimassist.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimsController {

    @GetMapping
    public List<Claim> getClaims() {
        return Arrays.asList(
                new Claim("CLM-2291", "Honda City · TN 07 BQ 4410", "Kelambakkam · 2h ago", "Photos pending", "⚡ Weather risk"),
                new Claim("CLM-2288", "TVS Apache RTR 160", "Tambaram · Yesterday", "Report ready", "⚡ Fraud score normal"),
                new Claim("CLM-2279", "Maruti Swift · TN 22 AD 1190", "Thoraipakkam · 4h ago", "Photos pending", "⚡ Waiting for photos")
        );
    }
}