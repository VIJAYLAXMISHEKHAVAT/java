package javabasics;

public class Car {
	//color - this is state or attribute of the object
	private String color;
	//make
	public String make;
	//model
	private String model;
	//year
	private int year;
	//Behavior of object(car)
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	
	public void setMake(String make) {
		//this is the keyword to access class level variable
		this.make = make;
	}
	public String getMake() {
		return make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
