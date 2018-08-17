package com.inapp.testjava.util;

public class Area {
	// int a; int b;int c;
	static final double pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.add(2, 3);
		System.out.println("radius=" + area.calculateAreaOfCircle(5));

		System.out.println("Diamter=" + area.calculateAreaOfCircleByDiameter(5));
		System.out.println("Recatngle=" + area.calculateAreaOfReactangle(5, 10));

	}

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("sum=" + c);
		return c;
	}

	public double calculateAreaOfCircle(double radius) {
		double area = pi * radius * radius;
		return area;
	}

	public double calculateAreaOfCircleByDiameter(double diameter) {
		double radius = diameter / 2;
		return calculateAreaOfCircle(radius);
	}

	public double calculateAreaOfReactangle(int length, int breadth) {
		double area = length * breadth;
		return area;
	}

	public double calculateAreaOfSquare(int side) {
		return calculateAreaOfReactangle(side, side);
	}

	public double calculateAreaOfTrianglr(double breadth, double length) {
		double area = 0.5 * length * breadth;
		return (area);
	}
}

class circle {
	public static void main(String[] args) {
		System.out.println("the value of pi " + Area.pi);
	}

}
