
class Line{

	Point l1 = new Point();
	Point l2 = new Point();

	public Line(int x1, int y1, int x2, int y2) {
		l1.setXY(x1, y1);
		l2.setXY(x2, y2);
	}

	public double compulateLength() {

		int x = Math.abs(l1.getX() - l2.getX());
		int y = Math.abs(l1.getY() - l2.getY());
		int temp = (x * x) + (y * y);
		return Math.sqrt(temp);

	}

	boolean isParallel(Line anotherLine) {

		if (((l2.getY() - l1.getY()) / (l2.getX() - l1.getX())) == (anotherLine.l2.getY() - anotherLine.l1.getY())
				/ (anotherLine.l2.getX() - anotherLine.l1.getX()))
			return true;
		else
			return false;
	}

	Point getIntersectionPoint(Line anotherLine) {

		int x1 = l1.getX();
		int y1 = l1.getY();
		int x2 = l2.getX();
		int y2 = l2.getY();

		int x3 = anotherLine.l1.getX();
		int y3 = anotherLine.l1.getY();
		int x4 = anotherLine.l2.getX();
		int y4 = anotherLine.l2.getY();

		double a = ((((x1 * y2) - (y1 * x2)) * (x3 - x4))) - ((x1 - x2) * ((x3 * y4) - (y3 * x4)));
		double b = (((x1 - x2) * (y3 - y4))) - ((y1 - y2) * (x3 - x4));

		a = a / b + 0.5;

		int line1Cordinate = (int) a;
		a = ((((x1 * y2) - (y1 * x2)) * (y3 - y4))) - ((y1 - y2) * ((x3 * y4) - (y3 * x4)));
		a = (a / b) + 0.5;

		int line2Cordinate = (int) a;
		Point point = new Point(line1Cordinate, line2Cordinate);

		return point;

	}

	
	
	
}
