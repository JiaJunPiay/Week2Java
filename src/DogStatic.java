class DogObject{
	private String name;
	private String breed;
	private float price;
	static int count = 0;
	{
		//this is a non-static block, will execute everytime the class is called
		//Not used often as it doesn't make much sense as there is no name to identify it
		count++;
	}
	public DogObject() {
		super();
		/*
		//intialise everytime a new dogobject is created
		 count++
		 
		 */	
	}
}	
	
public class DogStatic {
	public static void main(String args[]) {
		System.out.println(DogObject.count);
		
		DogObject d1 = new DogObject();
		DogObject d2 = new DogObject();
		DogObject d3 = new DogObject();
		
		System.out.println(DogObject.count);
	}
	static {
		//Static block will always get executed first
		System.out.println("Hi!");
	}

}
