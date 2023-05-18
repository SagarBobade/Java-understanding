package general;

class Vehicle{

	// instance variables
	private String brand;
	private String color;

	// constructor
	public Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	
	//methods
	public void accelerate() {
		System.out.println("Inside accelerate method of class Vehicle");
	}
	
	public void brake() {
		System.out.println("Inside brake method of class Vehicle");
	}
	
	//getters
	public String getBrandName() {
		return this.brand;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// setters
	public void setBrandName(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}

class Car extends Vehicle{
	
	// instance variables
	private String make;
	private String model;
	private int year;

	// constructor
	public Car(String brand, String color, String make, String model, int year) {
		super(brand, color);

		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// methods
	public void start() {
		System.out.println("Inside start method of Class Car");
	}
	
	public void stop() {
		System.out.println("Inside stop method of Class Car");
	}
	
	// getters
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}

	// setters
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}
}


public class Inheritance {

	public static void main(String[] args) {

		// Creating object of child class where we can access properties of parent class too
		Car myCar = new Car("Tata", "Black", "Punch", "xz", 2023);
		
		// accessing properties and methods of parent class
		System.out.println("Brand of my car is: "+myCar.getBrandName());
		System.out.println("Color of my car is: "+myCar.getColor());
		
		myCar.accelerate();
		myCar.brake();
		
		// accessing properties and methods of child class
		System.out.println("Make of my car is: "+myCar.getMake());
		System.out.println("Year of manufacturing is: "+myCar.getYear());
		
		myCar.start();
		myCar.stop();
	
	}
}
