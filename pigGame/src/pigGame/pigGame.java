package pigGame;

import java.util.*;

public class pigGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random diceRoll = new Random();
		int player1Total = 0;
		int player2Total = 0;
		int player1Turn = 0;
		int player2Turn = 0;
		int dice1;
		int dice2;
		String answer = "R"; //used for answer to prompting user to roll or bank
		System.out.println("A GAME OF PIG HAS BEGUN!");
		while(player1Total < 100 && player2Total < 100) {
			
			//Player 1
			System.out.println("\n\nPlayer 1's turn:");
	        do {
	        	dice1 = diceRoll.nextInt(6) + 1;
	        	System.out.println("\nrolling . . .");
		        System.out.println("player 1 rolled a " + dice1 + "!");
		        if(dice1 != 1) {
		        	player1Turn = player1Turn + dice1;
		        	System.out.println("Your total score this turn is " + player1Total);
		        	System.out.println("If you choose to hold, " + player1Turn + " points will add to total.");
		        	System.out.print("Enter \"R\" to roll once more, or \"B\" to Bank and end your turn: ");
		        	answer = input.next();
		        	if(answer.equals("B"));
		        } else {
		        	System.out.println("Your turn is over!");
		        	System.out.println("Your total score is now " + player1Total);
		        	player1Turn = 0;
		        	break;
		        }
	        } while(answer.equals("R")); {
		        player1Total = player1Total + player1Turn;
		        System.out.println("Player #1 score is " + player1Total);
		        player1Turn = 0; //reset turn value
		        if(player1Total >= 100){
		            System.out.println("PLAYER 1 WINS!");
		            break;
		        }
	        }
	        
	        //Player 2
	        System.out.println("\n\nPlayer 2's turn:");
	        do {
	        	dice2 = diceRoll.nextInt(6) + 1;
	        	System.out.println("\nrolling . . .");
		        System.out.println("player 2 rolled a " + dice2 + "!");
	        	if (dice2 != 1) {
	        		player2Turn = player2Turn + dice2;
		        	System.out.println("Your total score this turn is " + player2Total);
		        	System.out.println("If you choose to hold, " + player2Turn + " points will add to total.");
		        	System.out.print("Enter \"R\" to roll once more, or \"B\" to Bank and end your turn: ");
		        	answer = input.next();
		        	if(answer.equals("B"));
		        } else {
		        	System.out.println("Your turn is over!");
		        	System.out.println("Your total score is now " + player2Total);
		        	player2Turn = 0;	
		        	break;
		        }
	        } while (answer.equals("R")); {
	        	player2Total = player2Total + player2Turn;
        		System.out.println("Player #2 total is now " + player2Total);
        		player2Turn = 0; 
        		if (player2Total >= 100) {
        			System.out.println("Player TWO HAS WON!");
        			break;
        		}
    		} 
		}
	}    
}
