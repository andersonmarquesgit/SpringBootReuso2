package com.engreuso.model;

public enum UserType {
	ADMIN("Administrador"), 
	USER("Usuario");
	
	private String value;
	
	private UserType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
