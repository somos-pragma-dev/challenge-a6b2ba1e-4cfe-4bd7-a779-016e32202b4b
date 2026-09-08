package com.ecommerce.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtTokenUtil {
    private String secret = "secret";
    private long validityInMilliseconds = 3600000; // 1hr

    public String generateToken(String subject) {
        return Jwts.builder().setSubject(subject).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + validityInMilliseconds))
               .signWith(SignatureAlgorithm.HS256, secret).compact();
    }
}