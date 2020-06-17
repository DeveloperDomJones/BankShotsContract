package com.bankshotscontract.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SettingsDetails {
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String country;
	private LocalDate birthday;
	private String employmentStatus;
	private String employer;
	private String occupation;
	
	

}

