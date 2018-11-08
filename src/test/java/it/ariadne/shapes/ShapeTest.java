package it.ariadne.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import it.ariadne.shapes.model.Circle;
import it.ariadne.shapes.model.Rectangle;
import it.ariadne.shapes.model.Square;
import it.ariadne.shapes.model.Triangle;

public class ShapeTest {

	@Test
	public void testCircleArea() {
		Circle circle = new Circle(2);
		int circleArea = circle.calculateArea();
		Circle circle2 = new Circle(3);
		int circleArea2 = circle2.calculateArea();
		// Assert first
		assertEquals("L'area di un cerchio con raggio 2 è 12", 12, circleArea);
		// Triangulate
		assertEquals("L'area di un cerchio con raggio 3 è 27", 27, circleArea2);
		
	}
	
	@Test
	public void testSquareArea() {
		Square square = new Square(2);
		Square square2 = new Square(3);
		int squareArea = square.calculateArea();
		int squareArea2 = square2.calculateArea();
		// Assert first
		assertEquals("L'area di un quadrato con lato 2 è 4", 4, squareArea);
		// Triangulate
		assertEquals("L'area di un quadrato con lato 3 è 9", 9, squareArea2);
		
	}
	
	@Test
	public void testTriangleArea() {
		Triangle triangle = new Triangle(3,2);
		Triangle triangle2 = new Triangle(5, 4);
		int triangleArea = triangle.calculateArea();
		int triangleArea2 = triangle2.calculateArea();
		// Assert first
		assertEquals("L'area di un triangolo con base 2 e altezza 3 è 3", 3, triangleArea);
		// Triangulate
		assertEquals("L'area di un triangolo con base 4 e altezza 5 è 10", 10, triangleArea2);
		
	}
	
	
	@Test
	public void testAddCanvas() {
		Canvas canvas = new Canvas();
		Triangle triangle = new Triangle(3,2);
		Square square = new Square(2);
		Circle circle = new Circle(2);
		canvas.add(circle);
		canvas.add(square);		
		canvas.add(triangle);
		
		int canvasSize = canvas.size() ;
		assertEquals("Il canvas a cui ho aggiunto 3 forme ha dimensione 3", 3, canvasSize);
	}
	
	@Test
	public void testSumAreas() {
		Canvas c = new Canvas();
		Circle circle = new Circle(2);
		c.add(circle);
		Triangle triangle = new Triangle(2,2);
		c.add(triangle);
		Canvas c2 = new Canvas();
		Square square = new Square(2);
		Rectangle rectangle = new Rectangle(2, 3); 
		c2.add(square);
		c2.add(circle);
		c2.add(rectangle);
		int totArea = c.totArea();
		int totArea2 = c2.totArea();
		assertEquals("L'area totale di un triangolo e di h 2 e b 2 e di un cerchio con 2 è 14 ", 14, totArea);
		assertEquals("L'area totale di un quadrato di l 2 e di un cerchio con 2  e un rettangolo "
				+ "con h 2 e b 3 è 16 ", 22, totArea2);
	}


}
