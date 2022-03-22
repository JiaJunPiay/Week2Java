class AdditionLoop{
	public static int add(int[] arr) {
		int sum=0;
		//For Each Loop
		for(int a: arr) {
			System.out.println(a);
			sum+=a;
		}
		return sum;
	}
}
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int arr[] = {1,2,3,4,5};
		
		System.out.println("Total Sum = " +  AdditionLoop.add(arr));
		*/
		
		String a = "SACHIN";
		String b = null; 
		
		for(int i=a.length(); i > 0; i--) {
			b += a.charAt(i-1);
		}
		System.out.println(a);
		System.out.println(b);
	}

}
