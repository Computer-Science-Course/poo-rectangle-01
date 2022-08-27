package entities;
import java.lang.Math;

public class Rectangle {
	private double width, height;
	
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter(){
		return 2 * this.width + 2 * this.height; 
	}
	
	public double diagonal(){
		return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
	}
}
