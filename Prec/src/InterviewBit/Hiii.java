package InterviewBit;

import java.util.ArrayList;

public class Hiii {

	public double findArea(int x1, int y1, int x2, int y2, int x3, int y3) {
		return (Math.abs(0.5 * (x1 * (y1 - y2)) + (x2 * (y1 - y3)) + (x3 * (y1 - y2))));
	}

	public int liesBetween(ArrayList<Integer> A, ArrayList<Integer> B, int x, int y, double ractArea) {

		double totalArea = 0;

		for (int i = 0; i < 4; i++) {
			double area = findArea(A.get(i % 4), B.get(i % 4), A.get((i + 1) % 4), B.get((i + 1) % 4), x, y);
			if (area == 0)
				return 0;
			totalArea += area;
		}

		if (totalArea == ractArea)
			return 1;

		return 0;
	}

	public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {

		int n = C.size();
		int cnt = 0;

		double ractArea = findArea(A.get(0), B.get(0), A.get(1), B.get(1), A.get(2), B.get(2));
		ractArea += findArea(A.get(2), B.get(2), A.get(3), B.get(3), A.get(0), B.get(0));

		for (int i = 0; i < n; i++) {
			cnt += liesBetween(A, B, C.get(i), D.get(i), ractArea);
		}

		return cnt;
	}

	public static void main(String[] args) {

	}

}
