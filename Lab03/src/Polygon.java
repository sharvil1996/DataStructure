import java.util.ArrayList;

class Polygon {

	public boolean isPollygon(ArrayList<Line> arrayList) {
		double arr[] = new double[arrayList.size()];
		int i = 0;
		for (Line line : arrayList) {
			arr[i++] = line.compulateLength();
		}
		boolean flag = false;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				flag = true;
		}
		return flag ? true : false;

	}

	public String computeArea(ArrayList<Line> arrayList, double length) {

		double temp = arrayList.size();
		double p = temp * length;
		double q = temp / Math.abs(2 * (Math.tan(180 / length)));
		return (p * q) / 2 + "";
	}

}
