package hw8;
import java.util.*;
public class TicTacToe {
	static ArrayList<Integer> playerPositions= new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions= new ArrayList<Integer>();
	public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };

        printGameBoard(gameBoard);
        

        while (true) {
        	String win = "";
        	Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
           while (playerPositions.contains(playerPos)||cpuPositions.contains(playerPositions)) {
			System.out.println("Position taken! Enter another position!");
			playerPos=scan.nextInt();
		}
            placePiece(gameBoard, playerPos, "player");
            Random rand= new Random();
            int cpupos= rand.nextInt(9)+1;
            while (playerPositions.contains(cpupos)||cpuPositions.contains(cpupos)) {
    			
    			cpupos= rand.nextInt(9)+1;
    		}
            placePiece(gameBoard, cpupos, "cpu");
            printGameBoard(gameBoard);
            win=checkWinner();
            if (!win.equals("")) {
            	System.out.println(checkWinner());
            	break;
			}
            
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
    	for (int i = 0; i < 5; i++) {

    		String str = new String(gameBoard[i]);
    		System.out.println(str);
    	}
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch (pos) {
		case 1: {
			gameBoard[0][0] = symbol;
			break;
		}
		case 2: {
			gameBoard[0][2] = symbol;
			break;
		}
		case 3: {
			gameBoard[0][4] = symbol;
			break;
		}
		case 4: {
			gameBoard[2][0] = symbol;
			break;
		}
		case 5: {
			gameBoard[2][2] = symbol;
			break;
		}
		case 6: {
			gameBoard[2][4] = symbol;
			break;
		}
		case 7: {
			gameBoard[4][0] = symbol;
			break;
		}
		case 8: {
			gameBoard[4][2] = symbol;
			break;
		}
		case 9: {
			gameBoard[4][4] = symbol;
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + pos);
			
		}

    }

    public static String checkWinner() {
    	
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);
        
        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(leftCol);
        winning.add(cross1);
        winning.add(cross2);
        
        for(List list: winning) {
        	
        	if(playerPositions.containsAll(list)) {
        		return "Congratulations! you win!";
        	} else if (cpuPositions.containsAll(list)) {
        		return "Sorry, computer wins!";
			} else if (playerPositions.size()+cpuPositions.size()==9) {
				return "CAT!";
			}
        	
        }
        
        return "";
    }
}
