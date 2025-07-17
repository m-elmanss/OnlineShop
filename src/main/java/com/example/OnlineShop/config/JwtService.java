package com.example.OnlineShop.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtService {
    private static final String SECRET_KEY="";
    public String extractUsername(String jwt) {
        return null;
    }
    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
