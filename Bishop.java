

public class Bishop extends ChessPiece{
    String name;
    boolean alive;

    public Bishop(int row, int column, String color){
        super("Bishop",true, row, column, color);
    }
}
