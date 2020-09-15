package com.skilldistillery.jet;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApplication {
	public Airfield1 jetsAvailable = new Airfield1("JetList");

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
//		int choice = printMenu(sc);
		chooseOption(sc); 

	}
//	Scanner sc
	public void printMenu() {
		int c = 0;
		System.out.println("1. List fleet");
		System.out.println("2.Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4.View jet with longest range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Fight!");
		System.out.println("7.Add a jet to Fleet");
		System.out.println("8.Remove a jet from Fleet");
		System.out.println("9. Quit");
//		c = sc.nextInt();
//		return c;
	}
//	int choice = printMenu(sc);
	public void chooseOption(Scanner sc) {
		boolean keepGoing =true;
		while (keepGoing) {
		printMenu();
		int choice=sc.nextInt();
			
		switch (choice) {
		case 1:
			this.jetsAvailable.printAirfieldJets();
			break;

		case 2:
			jetsAvailable.flyAll();
			break;
		case 3:
			this.jetsAvailable.fastestJet();
			break;
			
		case 4:
			this.jetsAvailable.longestRange();
			break;

		case 5:
			this.jetsAvailable.loadingCargo();
			break;

		case 6:
			this.jetsAvailable.fighting();
			break;

		case 7:
			System.out.println("Please enter the following");
			System.out.println("Model:");
			String mod = sc.next();
			sc.nextLine();
			System.out.println("Speed:");
			double sp = Double.parseDouble((sc.nextLine()));
			System.out.println("Range");
			int ran = Integer.parseInt(sc.nextLine());
			System.out.println("Price");
			long pri = sc.nextLong();
			this.jetsAvailable.addJet(mod, sp, ran, pri);
			this.jetsAvailable.printAirfieldJets();
			break;

		case 8:
			System.out.println("Please select the index of the Jet you would like to remove (starting at index 1):");
			this.jetsAvailable.printAirfieldJets();
			int jetToRemove= sc.nextInt();
			this.jetsAvailable.removeJet(jetToRemove);
			break;

		case 9:
			System.out.println("Quitting the program");
			keepGoing=false;
			break;

		default:
			break;
		}
	}

}
}
