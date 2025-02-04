package com.practice.ticketingTool.Entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id" , nullable = false,updatable = false)
	private UUID userId;
	@Column(name = "firstName" , nullable = false)
	
	private String firstName;
	@Column(name = "lastName" )

	private String lastName;
	@Column(name = "email" , nullable = false)

	private String email;
	@Column(name = "userType" , nullable = false)

	private UserType userType;
	
	@Column(name = "created" , nullable = false)

	private LocalDateTime created;
	
	

}
