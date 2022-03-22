class Plane{
	
	void takeOff() {
		System.out.println("This plane is taking off!");
	}
	
	void fly() {
		System.out.println("This plane is flying!");
	}
	
	void land() {
		System.out.println("This plane is landing!");
	}
}

class PassengePlane extends Plane{
	void fly() {
		System.out.println("This Passenger plane is flying!");
	}
	
	void carryPassengers() {
		System.out.println("Passenger plane carries passenger!");
	}
}

class CargoPlane extends Plane{
	void fly() {
		System.out.println("This Cargo plane is flying!");
	}
	
	void carryCargo() {
		System.out.println("Cargo plane carries cargo!");
	}
}


class FighterPlane extends Plane{
	void fly() {
		System.out.println("This Fighter plane is flying!");
		this.carryArms();
	}
	
	void carryArms() {
		System.out.println("Fighter plane carries arms!");
	}
	
	
}

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class PlaneInheritance {
	public static void main(String args[]) {
		PassengePlane pass = new PassengePlane();
		CargoPlane cargo = new CargoPlane();
		FighterPlane fighter = new FighterPlane();
		Airport ap = new Airport();
		
		//Polymorphism as Plane is a parent class that ref the child class (Passenger, Cargo, Fighter)
		//The method below is called as True Polymorphism as 1 single method (permit)) is capable for multiple methods (passenger, cargo, and fighter) 1:M
		ap.permit(pass);
		ap.permit(cargo);
		ap.permit(fighter);
		
		
	}

}
