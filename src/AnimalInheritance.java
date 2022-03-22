class Animal{
	void eat() {
		System.out.println("Animal is currently being fed");
	}
	void sleep() {
		System.out.println("Animal is currently sleeping");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger is currently eating meat");
	}
	void movement() {
		System.out.println("Tiger hunts on 4 legs");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Deer is currently eating vegetables");
	}
	void movement() {
		System.out.println("Deer hides on 4 legs");
	}
}

class Monkey extends Animal{
	void eat() {
		System.out.println("Monkeys is currently eating fruits");
	}
	void movmement() {
		System.out.println("Monkey climbs with their hands and legs");
	}
}

class Zoo{
	void type(Animal a) {
		a.eat();
		a.sleep();
	}
}

public class AnimalInheritance {
	public static void main(String args[]) {
		Tiger t = new Tiger();
		Deer d =  new Deer();
		Monkey m = new Monkey();
		Zoo z = new Zoo();
		Animal a = new Animal();
		
		a=t;
		a.eat();
		((Tiger)(a)).movement();
		
		//Eg If a is int and to downcast to byte b; byte b = (byte) a
		//Downcasting only works with polymorphism 
		
		/*z.type(t);
		z.type(d);
		z.type(m);
		*/
	}
}
