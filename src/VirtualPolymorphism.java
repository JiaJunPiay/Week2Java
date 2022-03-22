//a class can have the same method that accepts different input

class Addition{
	int add(int x, int y) {
		return x+y;
	}
	
	float add(float x, float y) {
		return x+y;
	}
	
	int add(int x, int y, int z) {
		return x+y+z;
	}
}


public class VirtualPolymorphism {
	public static void main(String args[]) {
		int x=1,y=2,z=3;
		Addition a = new Addition();
		
		System.out.println(a.add(x,y));
		System.out.println(a.add(x,y,z));
	}

}
