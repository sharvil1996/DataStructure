
class TriangleCalculate {

	double computeArea(double sideA, double sideB, double sideC) {
		double square = (sideA + sideB + sideC) / 2;
		return Math.sqrt(square * (square - sideA) * (square - sideB) * (square - sideC));
	}

	boolean isTriangle(double sideA, double sideB, double sideC) {
		if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA)
			return true;
		else
			return false;
	}

	boolean isIsosceles(double sideA, double sideB, double sideC) {
		if (sideA == sideB || sideB == sideC || sideA == sideC)
			return true;
		else
			return false;
	}

	boolean isEquilateral(double sideA, double sideB, double sideC) {
		if (sideA == sideB && sideB == sideC)
			return true;
		else
			return false;
	}

}
