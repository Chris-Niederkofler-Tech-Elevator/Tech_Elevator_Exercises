package com.techelevator;

public class FavoriteThings {
	private String color;
	private String food;
	private String season;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getColor() {
		return color.substring(0, 1).toUpperCase() + color.substring(1);
	}
	public String getFood() {
		return food.substring(0, 1).toUpperCase() + food.substring(1);
	}
	public String getSeason() {
		return season.substring(0, 1).toUpperCase() + season.substring(1);
	}
}