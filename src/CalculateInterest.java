import java.util.Scanner;

class Interest{
	private int principle;
	private int duration;
	private float rate = 2.5f;
	private float simepleInterest;
	
	/*public Interest() {
		super();
	}
	
	public Interest(int principle, int duration) {
		super();
		this.principle = principle;
		this.duration = duration;
	}
	 */
	
	public void inputInterest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter principle : ");
		this.principle = scan.nextInt();
		System.out.print("Enter duration : ");
		this.duration = scan.nextInt();

	}
	
	public float computeInterest() {
		return this.principle*this.duration*this.rate/100;
	}
	
	public void displayInterest() {
		System.out.println("Your interest rate is : " + computeInterest());
	}
}


public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest i = new Interest();
		i.inputInterest();
		i.displayInterest();

	}

}
