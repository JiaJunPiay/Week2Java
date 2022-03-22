import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class TTT {
	static String ttt[][] = { { "1", "|", "2", "|", "3" }, { "-", "+", "-", "+", "-" }, { "4", "|", "5", "|", "6" },
			{ "-", "+", "-", "+", "-" }, { "7", "|", "8", "|", "9" } };
	static ArrayList<Integer> selectedPos = new ArrayList<Integer>();
	static ArrayList<Integer> playerPos = new ArrayList<Integer>();
	static ArrayList<Integer> botPos = new ArrayList<Integer>();
	private String playerShape;
	private String botShape;

	public String getPlayerShape() {
		return playerShape;
	}

	public void setPlayerShape(String playerShape) {
		this.playerShape = playerShape;
	}

	public String getBotShape() {
		return botShape;
	}

	public void setBotShape(String botShape) {
		this.botShape = botShape;
	}

	public void updateTTT(int pos, String shape) {
		selectedPos.add(pos);
		switch (pos) {
		case 1:
			ttt[0][0] = shape;
			break;
		case 2:
			ttt[0][2] = shape;
			break;
		case 3:
			ttt[0][4] = shape;
			break;
		case 4:
			ttt[2][0] = shape;
			break;
		case 5:
			ttt[2][2] = shape;
			break;
		case 6:
			ttt[2][4] = shape;
			break;
		case 7:
			ttt[4][0] = shape;
			break;
		case 8:
			ttt[4][2] = shape;
			break;
		case 9:
			ttt[4][4] = shape;
			break;
		default:
			System.out.println("Position not within 1 - 9");
		}
	}

	public void printResult() {
		System.out.println();
		for (int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt[i].length; j++) {
				System.out.print(ttt[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
/*	
	public static void winningCondition() {
		ArrayList<List> winCond = new ArrayList<List>();
		List toprow = Arrays.asList(1,2,3);
		winCond.add(toprow);
		
		List midrow = Arrays.asList(4,5,6);
		winCond.add(midrow);
		
		List btmrow = Arrays.asList(7,8,9);
		winCond.add(btmrow);
		
		List frscol = Arrays.asList(1,4,7);
		winCond.add(frscol);
		
		List seccol = Arrays.asList(2,5,8);
		winCond.add(seccol);
		
		List thrcol = Arrays.asList(3,6,9);
		winCond.add(thrcol);
		
		List firdia = Arrays.asList(1,5,9);
		winCond.add(firdia);
		
		List secdia = Arrays.asList(3,5,7);
		winCond.add(secdia);
		
		for(List x:winCond) {
			if(playerPos.containsAll(x)) {
				
			}
			else if(botPos.containsAll(x)) {
				
			}
			else if(playerPos.size() + botPos.size() == 9) {
				
			}
		}
	}
*/
	public boolean checkResult() {
		String result = "";
		for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				result = ttt[0][0] + ttt[0][2] + ttt[0][4];
				break;
			case 2:
				result = ttt[2][0] + ttt[2][2] + ttt[2][4];
				break;
			case 3:
				result = ttt[4][0] + ttt[4][2] + ttt[4][4];
				break;
			case 4:
				result = ttt[0][0] + ttt[2][0] + ttt[4][0];
				break;
			case 5:
				result = ttt[0][2] + ttt[2][2] + ttt[4][2];
				break;
			case 6:
				result = ttt[4][2] + ttt[4][2] + ttt[4][4];
				break;
			case 7:
				result = ttt[0][0] + ttt[2][2] + ttt[4][4];
				break;
			case 8:
				result = ttt[0][4] + ttt[2][2] + ttt[4][0];
				break;

			}
			if (result.equals(playerShape + playerShape + playerShape)) {
				this.printResult();
				System.out.println("Player 1 wins!");
				return false;
			} 
			if (result.equals(botShape + botShape + botShape)) {
				this.printResult();
				System.out.println("Player 2 wins!");
				return false;
			}
			else if(selectedPos.size() == 9 && i == 9) {
				this.printResult();
				System.out.println("Draw!");
				return false;
			}

		}
		return true;
	}

}

public class TicTacToe {
	public static void main(String args[]) {
		TTT tictac = new TTT();
		boolean game = true;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//Get the options for player 
		System.out.println("Please select your gametype");
		System.out.println("1. Vs Bot");
		System.out.println("2. Vs Player");
		System.out.print("Option : ");
		int gametype = scan.nextInt();
		while(gametype < 0 || gametype > 3) {
			System.out.println("Invalid Option! Please select again : ");
			gametype = scan.nextInt();
		}
		scan.nextLine();
		
		//Get the 2 symbols that represent each player 
		System.out.print("Please enter first symbol : ");
		String shape = scan.nextLine();
		tictac.setPlayerShape(shape);
		System.out.print("Please enter your second symbol : ");
		String shapeBot = scan.nextLine();
		tictac.setBotShape(shapeBot);

		while (game) {
			tictac.printResult();
			System.out.println("Player 1 turn!");
			System.out.print("Please enter a position : ");
			int pos = scan.nextInt();

			while (TTT.selectedPos.contains(pos) || pos < 0 || pos > 9) {
				System.out.print("Position error! Please enter a new position : ");
				pos = scan.nextInt();
			}

			tictac.updateTTT(pos, shape);
			
			//Check if player 1 wins
			game = tictac.checkResult();
			if(game == false)
				break;
			
			//Check if it's a bot playing or player 2
			if(gametype == 1) {
				tictac.printResult();
				System.out.println("Bots turn!");
				int botPos = rand.nextInt(9) + 1;

				while (TTT.selectedPos.contains(botPos)) {
					botPos = rand.nextInt(9) + 1;
				}
				
				tictac.updateTTT(botPos, shapeBot);

			}
			else {
				tictac.printResult();
				System.out.println("Player 2 turn!");
				System.out.print("Please enter a position : ");
				int player2Pos = scan.nextInt();

				while (TTT.selectedPos.contains(player2Pos) || player2Pos < 0 || player2Pos > 9) {
					System.out.print("Position error! Please enter a new position : ");
					player2Pos = scan.nextInt();
				}
				tictac.updateTTT(player2Pos, shapeBot);
			}
			
			//Check if bot or player 2 wins
			game = tictac.checkResult();
			if(game == false)
				break;
			

		}
	}
}
