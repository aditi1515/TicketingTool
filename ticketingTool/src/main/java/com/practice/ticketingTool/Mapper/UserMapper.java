package com.practice.ticketingTool.Mapper;

import com.practice.ticketingTool.DTO.UserDTO;
import com.practice.ticketingTool.Entities.User;

public interface UserMapper {

	public User toUserEntity(UserDTO userDTO);
	public UserDTO toUserDTO(User user);
}
