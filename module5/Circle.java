package module5;

import java.util.Scanner;

public class Circle {

	private int r;
	private double area1;
	private double peri;
	final double PI = 3.14;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("enter radius");
		r = sc.nextInt();
	}

	public void display() {
		System.out.println("radius is" + r);
		System.out.println("area is" + area1);
		System.out.println("perimeter is" + peri);

	}

	public void calarea() {
		area1 = PI * r * r;
	}

	public void calperi() {
		peri = 2 * PI * r;

	}
}
