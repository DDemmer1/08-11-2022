package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {
		int i = posNeg1(-8);
		int y = posNeg2(8);
		
		System.out.println(i);
		System.out.println(y);

	}

	static int posNeg1(int zahl) {
		int ergebnis = 0;

		if (zahl > 0) {
			ergebnis = 1;
		} else if (zahl < 0) {
			ergebnis = -1;
		}

		return ergebnis;
	}

	
	static int posNeg2(int zahl) {
		if (zahl > 0) {
			return 1;
		} else if (zahl < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	
	

}
