package com.exam;
class Vehicle{
	String make;
	String model;
	int year;
	double baseRentalPrice;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	
	
	
}
class Economy extends Vehicle{
	
	double baseRentalPrice=40;
	int days;
	public Economy(String make, String model, int year,int days) {
		super(make, model, year);
		this.days=days;
	}
	
	public void RentPrice() {
		System.out.println("Rent of economy vehicle is :"+(baseRentalPrice*days));
	}
	@Override
	public String toString() {
		return "Economy [baseRentalPrice=" + baseRentalPrice + ", make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}

	

	
	
	
}
class Luxury extends Vehicle{
	double baseRentalPrice=100;
	int days;
	public Luxury(String make, String model, int year,int days) {
		super(make, model, year);
		this.days=days;
	}
	
	public void RentPrice() {
		System.out.println("Rent of luxury vehicle is :"+(baseRentalPrice*days));
	}
	@Override
	public String toString() {
		return "Economy [baseRentalPrice=" + baseRentalPrice + ", make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}

	
	
	
}
class SUV extends Vehicle{
	double baseRentalPrice=70;
	int days;
	public SUV(String make, String model, int year,int days) {
		super(make, model, year);
		this.days=days;
	}
	
	public void RentPrice() {
		System.out.println("Rent of SUV vehicle is :"+(baseRentalPrice*days));
	}
	@Override
	public String toString() {
		return "Economy [baseRentalPrice=" + baseRentalPrice + ", make=" + make + ", model=" + model + ", year=" + year
				+ "]";
	}

	
	
	
}
public class Q9 {
	public static void main(String[] args) {
		Economy e1=new Economy("TATA", "NANO", 2000, 5);
		System.out.println(e1.toString());
		e1.RentPrice();
		
		Luxury l1=new Luxury("BWM", "Q1", 2005, 10);
		System.out.println(l1.toString());
		l1.RentPrice();
		
		SUV s1=new SUV("AUDI", "A1", 2010, 12);
		System.out.println(s1.toString());
		s1.RentPrice();
	}
}
