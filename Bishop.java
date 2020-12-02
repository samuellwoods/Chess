

public class Bishop extends ChessPiece{

    public Bishop(int row, int column, String color){
        super("Bi",true, row, column, color);
    }

    public boolean canMove(int x, int y, ChessPiece[][] array){
        if((x-this.getRow() > 0) && (x-this.getRow() == y-this.getColumn())){
            for(int i = x-this.getRow(); i <= x; i++){
                if(array[this.getRow() + i][this.getColumn() + i] != null){
                    return false;
                }
            }
            return true;
        }
        if((x-this.getRow() < 0) && (x-this.getRow() == y-this.getColumn())){
            for(int i = this.getRow()-x; i <= x; i++){
                if(array[this.getRow() - i][this.getColumn() - i] != null){
                    return false;
                }
            }
            return true;
        }
        if(true){}
        if(true){}
        return false;
    }
}
