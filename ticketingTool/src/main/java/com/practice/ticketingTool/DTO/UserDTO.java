package com.practice.ticketingTool.DTO;

import java.util.UUID;

import com.practice.ticketingTool.Entities.UserType;

public record UserDTO(UUID userId, String firstName, String lastName, String email, UserType userType) {

}
