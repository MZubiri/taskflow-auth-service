package com.taskflow.authservice.service;

public interface JwtService {

    String generarToken(String username);
}