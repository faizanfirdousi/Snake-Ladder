import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Manager {
    public Scanner input = new Scanner(System.in);
    public Random random = new Random();
    public int diceOut = 0;
    public int currentLocation = -1;
    public String[] board = new String[100];

    void initializeArray() {
        for (int i = 0; i < 100; i++) {
            board[i] = String.valueOf((i+1));
        }
        ladder(board);
    }

    public Manager() {
    }

    public void makeMove() {
        initializeArray();
        while (true) {
            System.out.println("Enter M to play next move");
            String decide = input.nextLine();
            if (!decide.equals("M")) {
                break;
            }
            diceOut = random.nextInt(6) + 1;
            currentLocation = currentLocation + diceOut;

            printMove();
        }
    }

    public void printMove() {
        String[] boardCopy = Arrays.copyOf(board, board.length);
        boardCopy[currentLocation] = boardCopy[currentLocation] + "U";
        for (int i = 99; i >= 0; i--) {
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
            System.out.print(boardCopy[i] + "\t");
        }

        makeMove();
    }

    public void ladder(String[] board) {
        this.board = board;
        board[3] += "L";
        board[10] += "L";
        board[15] += "L";
        board[20] += "L";
    }
}