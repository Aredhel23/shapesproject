package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

import it.ariadne.shapes.model.Circle;
import it.ariadne.shapes.model.Square;
import it.ariadne.shapes.model.Triangle;
import it.ariadne.shapes.Shape;
public class Canvas {
	private List<Shape> shapes = new ArrayList<>();
	public int size() {
		
		return shapes.size();
	}

	public void add(Shape shape) {
		shapes.add(shape);
		
	}


	public int totArea() {
		int area = 0;
		for (int i=0; i<shapes.size(); i++) {
			area += shapes.get(i).calculateArea();
		}

		return area;
	}

}
