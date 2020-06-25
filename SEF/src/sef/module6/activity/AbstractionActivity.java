package sef.module6.activity;

public abstract class AbstractionActivity {
	
	public static void main(String[] args) {		
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLenght(5);
		rectangle.setBreadth(6);
		rectangle.setColor("Black");
		
		Square square = new Square();
		square.setLenght(5);
		square.setColor("Red");
		
		System.out.println("Rectangle area is " + rectangle.calculateArea());
		System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());
		System.out.println("Rectangle color is " + rectangle.getColor());
		
		System.out.println("Square area is " + square.calculateArea());
		System.out.println("Square perimeter is " + square.calculatePerimeter());
		System.out.println("Square color is " + square.getColor());
	}
}
