
class ComplexNumber {
	int imaginary;
	int real;

	public ComplexNumber(int imaginary, int real) {
		this.imaginary = imaginary;
		this.real = real;
	}

	String add(ComplexNumber a) {

		return "The Addition is " + (imaginary + (a.imaginary)) + "+" + (real + (a.real)) + "i";
	}

	String sub(ComplexNumber a) {
		return "The Substration is " + (imaginary + (a.imaginary)) + "-" + (real + (a.real)) + "i";
	}

	String mult(ComplexNumber a) {

		int lasts = real * a.real;

		if (lasts > 0)
			lasts = -lasts;
		else
			lasts = +lasts;

		System.out.println(imaginary * a.imaginary);

		return "The Multiplicaation is " + ((imaginary * a.imaginary) + lasts) + "+"
				+ ((imaginary * a.real) + (real * a.imaginary)) + "i";
	}

	String div(ComplexNumber a) {

		int x = imaginary * a.imaginary;
		int y = imaginary * a.real * -1;
		int w = real * a.imaginary;
		int z = real * a.real;

		if (z > 0)
			z = -z;
		else
			z = +z;

		System.out.println(x + z);
		System.out.println(y + w);

		int p = a.imaginary * a.imaginary;
		int s = a.real * a.real;

		return (x + z) + "/" + (p + s) + "+" + (y + w) + "i/" + (p + s);

	}
}