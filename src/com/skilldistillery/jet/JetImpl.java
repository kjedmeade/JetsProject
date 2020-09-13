package com.skilldistillery.jet;

public class JetImpl extends Jet {

	public JetImpl() {
		
	}

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	@Override
	public String toString() {
		return "Jet [model=" + this.getModel() + ", speed=" + this.getSpeed() + ", range=" + this.getRange() + ", price=" + this.getPrice() + "]";
	}

	@Override
	public void printString() {
		System.out.println(this.toString());
	}
	
	

	}


