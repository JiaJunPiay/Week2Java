import java.util.Scanner;

class Guesser{
	//give the numbers
	int gNum;
	
	int guessNum(){
		System.out.print("Guessor please guess a number : ");
		Scanner scan = new Scanner(System.in);
		
		gNum = scan.nextInt();
		return gNum;
	}

}
class Player{
	//need to guess the number
	int pNum;
	
	int guessNum() {
		
		Scanner scan = new Scanner(System.in);
		pNum = scan.nextInt();
		return pNum;
	}
}

class Umpine{
	//get numbers from guessers and players
	int gNum;
	int[] pNum = new int[3];
	
	void getNumFromGuessor(){
		Guesser g = new Guesser();
		gNum = g.guessNum();
	}
	
	void getNumFromPlayer() {
		Player p = new Player();
		for(int i=0; i< pNum.length; i++) {
			System.out.print("Player " + (i+1) + " please guess the guessor's number : ");
			pNum[i] = p.guessNum();
		}
	}
	
	void winners() {
		for(int i=0; i<pNum.length; i++) {
			if(pNum[i] == gNum) {
				System.out.println("Player " + (i+1) + " wins!");
			}
			else {
				System.out.println("Player " + (i+1) + " lost!");
			}
		}
	}
}

public class OOP {
	public static void main(String agrs[]) {
	
		Umpine up = new Umpine();
		up.getNumFromGuessor();
		up.getNumFromPlayer();
		up.winners();
	
	}
}







