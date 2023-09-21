package com.mycompany.app;

public class TestMe {
	private double value;

	public TestMe() {}

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	public double square() {
		return value * value;
	}

	public double cube() {
		return value * value * value;
	}

	public double div(double x) throws ArithmeticException {
		if(x == 0.0) {
			throw new ArithmeticException("Cannot divide by zero!");
		} else {
			return value / x;
		}
	}

	public boolean is_whole() {
		return (value % 1 == 0);
	}

	public void setValue(double v) {
		value = v;
	}

	public double getValue() {
		return value;
	}

}
