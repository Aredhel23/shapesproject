package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;
public class Rectangle implements Shape {
	int h;
	int b;
	

	public Rectangle(int h, int b) {
		this.h = h;
		this.b = b;
	}


	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return b * h;
	}

}
