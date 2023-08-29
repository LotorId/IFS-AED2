package image;

public class Pixel {

    private int column;
    private int line;

    public Pixel(int column, int line) {
        this.column = column;
        this.line = line;
    }

    // GETTERS AND SETTERS

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
