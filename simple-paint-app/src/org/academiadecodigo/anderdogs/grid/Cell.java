package org.academiadecodigo.anderdogs.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.anderdogs.grid.Grid.CELL_SIZE;
import static org.academiadecodigo.anderdogs.grid.Grid.PADDING;

public class Cell {

    //the cell will know its form and if it is painted or not
    protected Rectangle rectangle;
    private boolean painted;

    //the cell will know its position
    protected int row;
    protected int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        //cols and rows to pixels
        rectangle = new Rectangle(col * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();
    }

    //paint cell
    public void paint() {
        painted = true;
        rectangle.fill();
    }

    //erase cell
    public void erase() {
        painted = false;
        rectangle.delete();
    }

    //getters
    public boolean isPainted() {
        return painted; //default is false
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    //how this translates to string, link to grid
    @Override
    public String toString() {
        return painted ? "1" : "0";
    }
}
