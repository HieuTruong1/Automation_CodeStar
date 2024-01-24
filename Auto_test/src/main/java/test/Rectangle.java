package test;
import java.util.Scanner;

public class Rectangle extends Shape{

	@Override
	public void draw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Draw " +super.getColor()+ " rectangle");
		System.out.println("input the color");
		String color = sc.nextLine();
		super.setColor2(color);
		System.out.println("Draw " +super.getColor2()+ " rectangle");
	}
}
