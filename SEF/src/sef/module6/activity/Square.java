package sef.module6.activity;

public class Square extends Shape{
		
	private double lenght;
	
	public Square(){ 
		System.out.println("I'm an Square Constructor"); 
	}
	
	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}	
	
	@Override
	public double calculateArea() {
		return lenght*lenght;
	}	

	@Override
	public double calculatePerimeter() {
		return 4*lenght;
	}
}

