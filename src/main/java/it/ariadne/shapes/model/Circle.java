package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius; //this.radius è l'attributo della classe, radius è la variabile
	}

	public int calculateArea() {
		// TODO FAKE IT
		return radius * radius * 3;
	}

}
