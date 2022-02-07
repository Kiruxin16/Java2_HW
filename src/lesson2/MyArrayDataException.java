package lesson2;

public class MyArrayDataException extends IllegalArgumentException  {
    private int row;
    private int column;

    public MyArrayDataException(String s, int row, int column) {
        super(s);
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
