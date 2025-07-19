package com.example.OnlineShop.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.function.Function;

public class JwtService {
    private static final String SECRET_KEY="e8f3a9c1d5b2746f9e0a3c7b8d4f1e2a3c9b7d6e8f02a1c4b5d6f7e8a9c0b1d\n";
    public String extractUsername(String jwt) {
        return extractClaim(jwt, Claims::getSubject);
    }


    public <T> T extractClaim(String token, Function<Claims,T>claimsResolver){
        final Claims claims= extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey(){
        byte[] keybytes= Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keybytes);
    }
}
