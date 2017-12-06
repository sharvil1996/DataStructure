class Square extends Shape1 {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square-draw Calling...!");
	}

	@Override
	void erase() {
		// TODO Auto-generated method stub
		System.out.println("Square-Erase Calling...!");
	}

	@Override
	void computeArea() {
		// TODO Auto-generated method stub
		System.out.println("Square-Computer Area Calling...!");
	}

	public boolean isSquare(double a, double b, double c, double d) {

		if (a == b && b == c && c == d)
			return true;
		else
			return false;

	}

	public double computeArea1(double d) {

		return d*d;
	}

}
