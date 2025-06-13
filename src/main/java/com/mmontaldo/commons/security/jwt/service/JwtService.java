package com.mmontaldo.commons.security.jwt.service;

public interface JwtService {

    String generateToken(String username);
    boolean validateToken(String token);
    String getUsernameFromToken(String token);
}
