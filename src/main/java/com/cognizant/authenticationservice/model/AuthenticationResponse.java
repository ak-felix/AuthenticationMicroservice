package com.cognizant.authenticationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
	@Getter
	@Setter
	private String userid;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private boolean isValid;
}