
class Year {

	private int year;

	public Year(int year) {
		this.year = year;
	}

	String calculataion() {
		if (year < 1582)
			return "Please Enter Proper Range...!";
		else {
			if (year % 400 == 0)
				return "Leap Year";
			else {
				if (year % 4 == 0 && year % 100 != 0)
					return "Leap Year";
				else
					return "Not Leap Year";
			}
		}
	}
}
