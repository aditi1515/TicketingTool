package com.practice.ticketingTool.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ticketingTool.DTO.UserDTO;
import com.practice.ticketingTool.Entities.User;
import com.practice.ticketingTool.Mapper.UserMapperImpl;
import com.practice.ticketingTool.Service.UserServiceImpl;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	private UserServiceImpl userServiceImpl;
	private UserMapperImpl userMapperImpl;

	public UserController(UserServiceImpl userServiceImpl, UserMapperImpl userMapperImpl) {
		this.userMapperImpl = userMapperImpl;
		this.userServiceImpl = userServiceImpl;
	}

	@PostMapping
	public UserDTO createUser(@RequestBody UserDTO user) {
		
		User savedUser = userServiceImpl.createUser(userMapperImpl.toUserEntity(user));
		
		return userMapperImpl.toUserDTO(savedUser);

	}
}
