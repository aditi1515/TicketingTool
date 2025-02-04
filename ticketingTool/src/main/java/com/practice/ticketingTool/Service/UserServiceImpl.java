package com.practice.ticketingTool.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.ticketingTool.Entities.User;
import com.practice.ticketingTool.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub

		if (user.getUserId() != null) {
			throw new IllegalArgumentException("User already exists");
		}
		if (user.getFirstName() == null || user.getFirstName().isBlank()) {
			throw new IllegalArgumentException("First name is required");
		}
		if (user.getEmail() == null || user.getEmail().isBlank()) {
			throw new IllegalArgumentException("Email is required");
		}
		if (user.getUserType() == null) {
			throw new IllegalArgumentException("User Type is required");
		}

		LocalDateTime nowDateTime = LocalDateTime.now();
		User userToSave = new User(null, user.getFirstName(), Optional.ofNullable(user.getLastName()).orElse(null),
				user.getEmail(), user.getUserType(), nowDateTime);
		return userRepository.save(userToSave);

	}
}
