package com.passwordreset.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User {
    private Integer userId;
    private String username;
    private String email;
    private String password;
    private boolean enabled;
    private String role;
}
