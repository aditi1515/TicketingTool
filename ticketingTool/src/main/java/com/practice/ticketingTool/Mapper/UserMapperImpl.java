package com.practice.ticketingTool.Mapper;

import org.springframework.stereotype.Component;

import com.practice.ticketingTool.DTO.UserDTO;
import com.practice.ticketingTool.Entities.User;

@Component
public class UserMapperImpl implements UserMapper {

	@Override
	public User toUserEntity(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return new User(userDTO.userId(), userDTO.firstName(), userDTO.lastName(), userDTO.email(), userDTO.userType(),
				null);
	}

	@Override
	public UserDTO toUserDTO(User user) {
		// TODO Auto-generated method stub
		return new UserDTO(user.getUserId(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getUserType());
	}

}
