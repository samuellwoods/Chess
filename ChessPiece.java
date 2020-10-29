public class ChessPiece {
    private String name;
    private boolean alive;
    private int row;
    private int column;
    private String color;

    public ChessPiece(String name, boolean alive, int row, int column, String color) {
        this.setName(name);
        this.setAlive(true);
        this.setRow(row);
        this.setColumn(column);
        this.setColor(color);
    }

    public void move() {
        this.move();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
