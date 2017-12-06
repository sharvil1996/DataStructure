import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {

		Line line = new Line(15, 8, 49, 25);
		System.out.println("Length is " + line.compulateLength());

		Line anotherLine = new Line(10, 15, 40, 30);

		System.out.println(line.isParallel(anotherLine) ? "Parallel" : "Not Parallel");

		line = new Line(15, 10, 49, 25);
		anotherLine = new Line(29, 5, 32, 32);

		Point temp = line.getIntersectionPoint(anotherLine);
		System.out.println("Intersection point is : (" + temp.getX() + "," + temp.getY() + ")");

		/*
		 * Line l1 = new Line(0, 0, 2, 3); Line l2 = new Line(2, 3, 4, 0); Line
		 * l3 = new Line(4, 0, 0, 0);
		 */
		Line l1 = new Line(8, 3, 7, 8);
		Line l2 = new Line(7, 8, 2, 7);
		Line l3 = new Line(2, 7, 3, 2);

		System.out.println();
		TriangleCalculate triangle = new TriangleCalculate();
		System.out.println(triangle.isTriangle(l1.compulateLength(), l2.compulateLength(), l3.compulateLength())
				? "Triangle is Valid" : "Triangle is Not Valid");
		System.out.println(triangle.isIsosceles(l1.compulateLength(), l2.compulateLength(), l3.compulateLength())
				? "Triangle is Isosceles" : "Triangle is not Isosceles");
		System.out.println(triangle.isEquilateral(l1.compulateLength(), l2.compulateLength(), l3.compulateLength())
				? "Triangle is Equilateral" : "Triangle is not Equilateral");
		System.out.println("Area of Triangle is : "
				+ triangle.computeArea(l1.compulateLength(), l2.compulateLength(), l3.compulateLength()));

		System.out.println();
		Square s1 = new Square();
		Line l4 = new Line(3, 2, 8, 3);

		System.out.println(
				s1.isSquare(l1.compulateLength(), l2.compulateLength(), l3.compulateLength(), l4.compulateLength())
						? "This is Square" : "This is not Square");
		System.out.println("Area of Square is " + s1.computeArea1(l1.compulateLength()));

		l1 = new Line(-9, 4, -4, 9);
		l2 = new Line(-4, 9, -9, 7);
		l3 = new Line(-9, 7, -9, 4);

		// l4 = new Line(2, 2, 4, 10);
		// Line l6 = new Line(-1, -2, 1, 2);
		System.out.println();
		ArrayList<Line> arrayList = new ArrayList<Line>();
		arrayList.add(l1);
		arrayList.add(l2);
		arrayList.add(l3);
		// arrayList.add(l4);
		/*
		 * arrayList.add(l5); arrayList.add(l6);
		 */
		Polygon polygon = new Polygon();
		System.out.println(polygon.isPollygon(arrayList) ? "This is polyogon" : "This is not polyon");

		System.out.println("Length is " + polygon.computeArea(arrayList, l1.compulateLength()));
	}
}
