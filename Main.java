import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int cardAce = 0;
		int cardAmount = 4;
		int cardRow = 3;
		int myAnswer = 0;
		boolean gameOver = false;
		
		do{
		char[][] cards = new char[][]{
				{'#', '#', '#' ,'#'},
				{'#', '#', '#', '#'},
				{'1', '2', '3', '4'}
		};
		cardAce = rand.nextInt(4) + 1;
		
		
		System.out.println("Which one is the Ace?");
		
		for(int i = 0; i < cardRow; i++){
			for(int j = 0; j < cardAmount; j++){
				System.out.print(cards[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.print("Answer: ");
		
		myAnswer = input.nextInt();
		
		if(myAnswer == cardAce){
			System.out.println("Nailed it!\n");
		}else{
			System.out.println("Sorry wrong card...\n");
		}
		
		for(int i = 0; i < cardRow; i++){
			for(int j = 0; j < cardAmount; j++){
				if(j == cardAce - 1){
				cards[i][j] = 'A';	
				System.out.print(cards[i][j] + "  ");
				}else{
				System.out.print(cards[i][j] + "  ");
				}
				
				}
			System.out.println();
		}
		System.out.println("------------------- \nYou wana play again? Y/N \n-------------------");
		String playAgain = input.next();
		
		if(playAgain.equals("Y") || playAgain.equals("y")){
			System.out.println("----------------New Game--------------------");
		}else{
			System.out.println("----------------Game Over--------------------");
			gameOver = true;
		}
		
		}while(gameOver == false);
	}
	
}
