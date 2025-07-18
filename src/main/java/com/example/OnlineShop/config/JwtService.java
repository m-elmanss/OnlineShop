package com.example.OnlineShop.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.function.Function;

public class JwtService {
    private static final String SECRET_KEY="https://www.amazon.com/s?i=fashion-novelty&rh=p_6%3AATVPDKIKX0DER&s=date-desc-rank&hidden-keywords=Lightweight%2C+Classic+fit%2C+Double-needle+sleeve+and+bottom+hem+-Longsleeve+-Raglan+-Vneck+-Tanktop&language=en_US";
    public String extractUsername(String jwt) {
        return null;
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
