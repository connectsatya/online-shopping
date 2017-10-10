package com.satyajeet.shoppingbackend.dto;

public class Category {
/*
 * Private Fields*/
	private int id;//for uniquely identifying a category
	private String name;//for setting category name
	private String description;//for category description
	private String imageUrl;//to store image url only
	private boolean active=true; //for activating or de-activating a category
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
