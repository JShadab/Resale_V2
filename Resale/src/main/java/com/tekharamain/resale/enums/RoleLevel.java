package com.tekharamain.resale.enums;

public enum RoleLevel {

	ADMIN("Admin"), BUSINESS("Business"), USER("User");

	private String name;

	private RoleLevel(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
