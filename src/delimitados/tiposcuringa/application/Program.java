package delimitados.tiposcuringa.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import delimitados.tiposcuringa.entities.Circle;
import delimitados.tiposcuringa.entities.Rectangle;
import delimitados.tiposcuringa.entities.Shape;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		List<Rectangle> myRectangle = new ArrayList<>();
		myRectangle.add(new Rectangle(2.0, 6.5));
		myRectangle.add(new Rectangle(3.0, 5.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));
		System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
		System.out.println("Total area: " + String.format("%.2f", totalArea(myRectangle)));
	}

	// ? extends Shape (pode ser Shape ou qualquer subtipo de Shape...
	public static double totalArea(List<? extends Shape> list) {
		// Porém, não podemos adicionar nada na lista atraves desse metodo.
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
