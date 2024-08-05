import java.util.Random;
import java.util.Scanner;

public class Manager {
	public Scanner input = new Scanner(System.in);
	public Random random = new Random();
	public int diceOut=0;
    public int currentLocation = -1;
    public String[] board= new String[12];
    public void makeMove() {
    	while(true) {
    		String[] board = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    		System.out.println("Enter M to play next move");
        	String decide =input.nextLine();
        	if(!decide.equals("M")) {
        		break;
        	}
        	diceOut = random.nextInt(6)+1;
        	currentLocation = currentLocation + diceOut;
        	
        	board[currentLocation]=board[currentLocation]+"U";
        	
        	printMove();
        }
    }
    
    public void printMove() {
    	for(int i=0; i<12; i++) {
	    	System.out.print(board[i]+" ");
	    }
    	
    	makeMove();
    }
    
    
    
}
