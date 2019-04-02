package com.tekharamain.resale.enums;

public enum Category {

	MOBILES("Mobiles"), ELECTRONICS("Electronics & Appliances"), CARS("Cars"), BIKES("Bikes"), FURNITURES("Furnitures"),
	PETS("Pets"), BOOKS_SPORTS_HOBBIES("Books, Sports & Hobbies"), FASHION("Fashion"), KIDS("Kids"),
	SERVICES("Services"), JOBS("Jobs"), REAL_STATE("Real Estates");

	private String name;

	private Category(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
