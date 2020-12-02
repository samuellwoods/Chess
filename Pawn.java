

public class Pawn extends ChessPiece{
    public Pawn(int row, int column, String color){
        super("Pa",true, row, column, color);
    }

    public boolean canMove(int row, int column, ChessPiece[][] array){
        if(column != this.getColumn()){
            return false;
        }
        if((row-this.getRow()) == 1){
            return true;
        }
        if((row-this.getRow()) > 1){
            return false;
        }
        return false;
    }
}
