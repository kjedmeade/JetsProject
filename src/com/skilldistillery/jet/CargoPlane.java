package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoCarrier{
	
	public CargoPlane() {
		super();
	
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	
		
	}
	@Override
	public void loadCargo() {
		System.out.println("....loading cargo");
		
	}
	@Override
	public String toString() {
		return "Cargo Plane [model=" + this.getModel() + ", speed=" + this.getSpeed() + ", range=" + this.getRange() + ", price=" + this.getPrice() + "]";
	}

	@Override
	public void printString() {
		System.out.println(this.toString());
	}
	
}
