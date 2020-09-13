package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	
	}
	
	
	@Override
	public void fight() {
		System.out.println("Fighting");
	}
	
	@Override
	public String toString() {
		return "Fighter Jet [model=" + this.getModel() + ", speed=" + this.getSpeed() + ", range=" + this.getRange() + ", price=" + this.getPrice() + "]";
	}
	
	@Override
	public void printString() {
		System.out.println(this.toString());
	}

	
}
