package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Airfield1 {
	private ArrayList<Jet> jets;

	public Airfield1(String jetString) {
		jets = new ArrayList<Jet>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetString))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				typeOfJet(fields);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void printAirfieldJets() {
		for (Jet jet : this.getJets()) {
			System.out.println(jet);
		}
	}

	public ArrayList<Jet> getJets() {
		return this.jets;
	}

	public void typeOfJet(String[] x) {
		if (x[0].equals("f")) {
			this.jets.add(new FighterJet(x[1], Double.parseDouble(x[2]), Integer.parseInt(x[3]), Long.parseLong(x[4])));
		}
		if (x[0].equals("c")) {
			this.jets.add(new CargoPlane(x[1], Double.parseDouble(x[2]), Integer.parseInt(x[3]), Long.parseLong(x[4])));
		}

	}

	public void flyAll() {
		for (int i = 0; i < this.jets.size(); i++) {
			this.jets.get(i).fly();
		}
	}

	public void fastestJet() {
		int fastestIndex = 0;
		for (int i = 1; i < this.jets.size(); i++) {

			if (this.jets.get(i).getSpeed() > this.jets.get(fastestIndex).getSpeed()) {
				fastestIndex = i;
			}
		}
			System.out.println("The fastest jet is " + jets.get(fastestIndex).getModel());
	}

	public void longestRange() {
		int longestRange = 0;
		for (int i = 1; i < this.jets.size(); i++) {

			if (this.jets.get(i).getRange() > this.jets.get(longestRange).getRange()) {
				longestRange = i;
			}
		}
			System.out.println("The jet with the longest range is " + jets.get(longestRange).getModel());

	

	}

	public void loadingCargo() {
		for (int i = 0; i < this.jets.size(); i++) {
			if (this.jets.get(i) instanceof CargoPlane) {
				((CargoPlane) this.jets.get(i)).loadCargo();
			}
		}
	}

	public void fighting() {
		for (int i = 0; i < this.jets.size(); i++) {
			if (this.jets.get(i) instanceof FighterJet) {
				((FighterJet) this.jets.get(i)).fight();
			}
		}
	}

	public void removeJet(int removed) {
		removed--;
		this.jets.remove(removed);
		printAirfieldJets();
	}

	public void addJet(String mod, double spe, int rang, long pric) {
		JetImpl jetimp = new JetImpl(mod, spe, rang, pric);
		this.jets.add(jetimp);
	}
}
