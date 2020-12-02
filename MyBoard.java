import java.util.Random;
import java.util.Scanner;

/**
 * NAME: Samuel Woods
 * DATE: 10/31/2020 Happy Halloween!
 * 
 * This class' purpose is to interact with the user, create
 * the game board, and handle logic.
 */
public class MyBoard {
    ChessPiece[][] arr;
    boolean game;

    /**
     * Initializes a 2-D array of ChessPiece objects and
     * starts the game.
     */
    public MyBoard() {

        this.game = true;

        this.arr = new ChessPiece[8][8];
        this.arr[0][0] = new Rook(0, 0, "White");
        this.arr[0][1] = new Knight(0, 1, "White");
        this.arr[0][2] = new Bishop(0, 2, "White");
        this.arr[0][3] = new Queen(0, 3, "White");
        this.arr[0][4] = new King(0, 4, "White");
        this.arr[0][5] = new Bishop(0, 5, "White");
        this.arr[0][6] = new Knight(0, 6, "White");
        this.arr[0][7] = new Rook(0, 7, "White");
        for (int i = 0; i < 8; i++) {
            this.arr[1][i] = new Pawn(1, i, "White");
        }

        this.arr[7][0] = new Rook(7, 0, "Black");
        this.arr[7][1] = new Knight(7, 1, "Black");
        this.arr[7][2] = new Bishop(7, 2, "Black");
        this.arr[7][3] = new Queen(7, 3, "Black");
        this.arr[7][4] = new King(7, 4, "Black");
        this.arr[7][5] = new Bishop(7, 5, "Black");
        this.arr[7][6] = new Knight(7, 6, "Black");
        this.arr[7][7] = new Rook(7, 7, "Black");
        for (int i = 0; i < 8; i++) {
            this.arr[6][i] = new Pawn(6, i, "Black");
        }
    }

    /**
     * This method keeps the game alive by keeping it
     * in a loop. The game ends when 'alive' is set to 
     * false.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBoard board = new MyBoard();
        Random random = new Random();

        System.out.println("Enter game mode ('twoPlayer' or 'auto'): ");
        String gameMode = scanner.nextLine();

        while (true) {
            if(!(gameMode.equals("twoPlayer") || gameMode.equals("auto"))){
                System.out.println("Error. Incorrect usage.");
            }else{
                break;
            }
        }

        while (board.game != false) {
            board.printBoard();
            if(gameMode.equals("twoPlayer")){
                board.twoPlayer();
            }
            board.game = false;
        }
    }

    /**
     * Handles moves in a two player instance.
     */
    public void twoPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("White to move. Enter your desired piece's row:");
        int row1 = Integer.parseInt(scanner.nextLine());
        System.out.print("White to move. Enter your desired piece's column:");
        int column1 = Integer.parseInt(scanner.nextLine());

        if (this.arr[row1][column1] != null) {
            System.out.print("Enter your desired row destination:");
            int row2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter your desired column destination");
            int column2 = Integer.parseInt(scanner.nextLine());
            if (this.arr[row1][column1].canMove(row2, column2, this.arr)) {
                this.arr[row2][column2] = this.arr[row1][column1];
                this.arr[row1][column1] = null;
            }

            this.printBoard();
        }

    }

    /**
     * Prints the game state.
     */
    public void printBoard() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                if (this.arr[i][j] == null) {
                    System.out.print("[" + "    " + "]");
                } else {
                    System.out.print(
                            "[" + this.arr[i][j].getColor().substring(0, 1) + "." + this.arr[i][j].getName() + "]");
                }
            }
            System.out.println();
        }

    }
}