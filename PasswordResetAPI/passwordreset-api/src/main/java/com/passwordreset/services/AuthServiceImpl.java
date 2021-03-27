package com.passwordreset.services;

import java.rmi.NoSuchObjectException;

import com.passwordreset.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository repo;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public User register(User user) {

//		encrypt and set the password for the User.
		user.setPassword(encoder.encode(user.getPassword()));
//		set the enabled field of the object to true.
		user.setEnabled(true);
//		set the role field of the object to "standard".
		user.setRole("standard");
//		saveAndFlush the user using the UserRepo.
//		return the User object.
		return repo.saveAndFlush(user);
	}
}
