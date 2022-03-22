import java.util.Arrays;

class OOP2 {
	public static void main(String args[]) {
		
		/*int[] a = {4,2,1,7};
		int[] b = new int[a.length];
		int total = a[0];
		
		
		for(int i=0; i<a.length; i++) {
			if(total != a[i]) {
				total = total * a[i];
			}
		}
		for(int i=0; i<b.length; i++) {
			b[i] = total / a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	
		
		int[] c = {1,0,2,0,3,4,0,5};
		int[] d = new int[c.length];
		int count = 0;
		
		for(int i=0; i < c.length; i++) {
			if(c[i] != 0) {
				d[count] = c[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	
		*/
		
		
		MathStuff ms = new MathStuff();
		int add = ms.addition(new int[]{1,2,3,4,5});
		int mul = ms.multiply(new int[]{1,2,3,4,5});
		System.out.println(add);
		System.out.println(mul);
		
		
	}
	
		
}


class MathStuff{
	int addition(int[] aList) {
		int sum = 0;
		for(int i=0; i < aList.length; i++) {
			sum += aList[i];
		}
		return sum;
	}
	
	int multiply(int[] mList) {
		int sum = 1;
		for(int i=0; i < mList.length; i++) {
			sum *= mList[i];
		}
		return sum;
	}
	
}