class Parent{
	int a;
	int b;
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + ", b=" + b + "]";
	}

	
	
}

class Child extends Parent{

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(int a, int b) {
		super(a, b);
		a = 50;
		b = 60;
		System.out.println(a +" "+ b);
		System.out.println(super.a +" "+ super.b);
		// TODO Auto-generated constructor stub
	}
	//If variable in parent is private, the child would not inherited the variables
	//Method will be inherited 
	//Using super() means trying to call the parent constructor -> constructor chaining
	//Either your method has a super() method in the method or a this method, they are mutually exclusive, constructor call must be the first line in a constructor
	
	
	
}

class Children extends Child{
	//multi-level inheritance is permitted 
	//multiple (2 parents) is not permitted
	//Constructor will not get inherited 
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(100,200);
		System.out.println(c.toString());
	}

}
