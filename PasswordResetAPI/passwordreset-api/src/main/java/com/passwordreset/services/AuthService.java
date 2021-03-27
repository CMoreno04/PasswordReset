package com.passwordreset.services;

import org.springframework.security.core.userdetails.User;

public interface AuthService {
    public User register(User user);
}
