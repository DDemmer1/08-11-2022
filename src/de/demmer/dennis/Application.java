package de.demmer.dennis;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// aufgabe 1
		int i = posNeg1(-8);
		int y = posNeg2(8);

		System.out.println(i);
		System.out.println(y);

		// ------------------------------

		// aufgabe 2

//		checkUserInput("exit");
		
		
		
		// extra
		Scanner scanner = new Scanner(System.in);

		
		while(true) {
			String userEingabe = scanner.nextLine();
			checkUserInput(userEingabe);
		}
		
		

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

	// -----------aufgabe 2 ---------------

	static void checkUserInput(String userInput) {

		
		switch (userInput) {
		case "exit":
			System.out.println("Das Programm wird beendet");
			System.exit(0);
			break;
		case "start":
			System.out.println("Das Programm wird gestartet");
			break;
		case "pause":
			System.out.println("Das Programm wird pausiert");
			break;
		case "help":
			System.out.println("exit, pause, start");
			break;
		default:
			System.out.println("Eingabe ungültig. Gib 'help' ein für alle Optionen ");

		}

	}

}
