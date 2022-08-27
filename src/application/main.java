package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Give me a rectangle!");
		
		System.out.print("Width: ");
		rectangle.setWidth(scanner.nextDouble());
		
		System.out.print("Height: ");
		rectangle.setHeight(scanner.nextDouble());
		
		System.out.printf("Its area is: %.2f a.u..\n", rectangle.area());
		System.out.printf("Its perimeter is: %.2f p.u..\n", rectangle.perimeter());
		System.out.printf("Its diagonal is: %.2f s.u..\n", rectangle.diagonal());
		
		scanner.close();
	}

}
