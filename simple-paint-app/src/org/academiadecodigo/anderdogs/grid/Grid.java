package org.academiadecodigo.anderdogs.grid;

public class Grid {

    //fixed grid values throughout app
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 25;

    //grid as an array of cells
    private int numberOfRows;
    private int numberOfCols;
    private Cell[][] cells;

    //draw grid when object is initialized
    public Grid(int numberOfRows, int numberOfCols) {
        this.numberOfRows = numberOfRows;
        this.numberOfCols = numberOfCols;
        drawGrid();
    }

    public void drawGrid() {

        cells = new Cell[numberOfRows][numberOfCols];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public void clearGrid() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                cells[i][j].erase();
            }
        }
    }

    //getters
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfCols() {
        return numberOfCols;
    }
}
