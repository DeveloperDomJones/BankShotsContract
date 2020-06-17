package com.bankshotscontract.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bankshotscontract.model.SettingsDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "accountSettings")
public class Settings {
	
	@Id
	@JsonIgnore
	private ObjectId id;
	private String email;
	private String password;
	private LocalDate dateCreated;
	private LocalDateTime lastActive;
	private LocalDateTime lastUpdate;
	private String role;
	private boolean online; 
	private SettingsDetails accountSettingsDetails;

}
