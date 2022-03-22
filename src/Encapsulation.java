class Dog{
	//Using private to prevent users from directly accessing the variables, must use Getters and Setters to declare it
	private String name;
	private String color;
	private int cost;
	
	//"this" method/keyword is used to reference things within the same class 
	
	
	//Constructor if nothing is declared
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		//Constructor
	public Dog(String name, String color, int cost) {
		//parent constructor, java is going to provide it if the user don't provide it
		super();
		//instance variable = local variable
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	
	/*
	public Dog() {
		name = "Ruby";
		color = "Black";
		cost = 15000;
	}
	
	public Dog(String name, String color){
		this.name = name;
		this.color = color;
	}
	//Constructor
	public Dog(String name, String color, int cost) {
		this("Spinny", "White");
	}
	*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
	
}
public class Encapsulation {

	public static void main(String args[]) {
		Dog d = new Dog("Hashbrown", "Brown", 1000);
		System.out.println(d.toString());
		Dog d2 = new Dog();
		System.out.println(d2.toString());
	}
}
