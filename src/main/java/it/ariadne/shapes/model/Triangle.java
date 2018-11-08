package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Triangle implements Shape {

	private int h;
	private int b;
	

	public Triangle(int h, int b) {
		this.h = h;
		this.b = b;
	}


	public int calculateArea() {
		// TODO Auto-generated method stub
		return b * h/2;
	}

}
