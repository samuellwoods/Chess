import java.util.Random;

public class MyBoard{
    ChessPiece[][] arr;
    boolean game;
    
    public MyBoard(){

        game = true;

        this.arr = new ChessPiece[8][8];
        this.arr[0][0] = new Rook("W",0,0);
        this.arr[0][1] = new Knight("W");
        this.arr[0][2] = new Bishop("W");
        this.arr[0][3] = new Queen("W");
        this.arr[0][4] = new King("W");
        this.arr[0][5] = new Bishop(0,3,"W");
        this.arr[0][6] = new Knight("W");
        this.arr[0][7] = new Rook("W");
        for(int i = 0; i < 8; i++){
            this.arr[1][i] = new Pawn();
        }

        this.arr[7][0] = new Rook("L","B");
        this.arr[7][1] = new Knight("L","B");
        this.arr[7][2] = new Bishop("L","B");
        this.arr[7][3] = new Queen("B");
        this.arr[7][4] = new King("B");
        this.arr[7][5] = new Bishop("L","B");
        this.arr[7][6] = new Knight("L","B");
        this.arr[7][7] = new Rook("L","B");
        for(int i = 0; i < 8; i++){
            this.arr[6][i] = new Pawn();
        }
    }
    public static void main(String[] args){
        MyBoard board = new MyBoard();
        Random random = new Random();
        
        while(board.game != false)
            board.arr[random.nextInt(8)][random.nextInt(8)].move();
    }
}