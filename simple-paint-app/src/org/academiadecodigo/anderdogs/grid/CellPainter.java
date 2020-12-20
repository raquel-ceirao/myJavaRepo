package org.academiadecodigo.anderdogs.grid;

import static org.academiadecodigo.anderdogs.grid.Grid.CELL_SIZE;
import static org.academiadecodigo.anderdogs.grid.Grid.PADDING;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class CellPainter extends Cell {

    private Grid grid = new Grid(28, 28);

    //start at position 0 with painted cell as cursor
    public CellPainter() {
        super(0, 0);
        rectangle.setColor(Color.PINK);
        paint();
    }

    //cursor movement with grid limits
    public void moveUp() {
        if (rectangle.getY() <= PADDING) {
            int yLimit = rectangle.getY();
            yLimit = PADDING;
        } else {
            row--;
            rectangle.translate(0, -CELL_SIZE);
        }
    }

    public void moveDown() {
        if (rectangle.getY() >= (grid.getNumberOfRows() - 1) * CELL_SIZE) {
            int heightLimit = rectangle.getHeight();
            heightLimit = (grid.getNumberOfRows() - 1) * CELL_SIZE;
        } else {
            row++;
            rectangle.translate(0, CELL_SIZE);
        }
    }

    public void moveLeft() {
        if (rectangle.getX() <= PADDING) {
            int xLimit = rectangle.getX();
            xLimit = PADDING;
        } else {
            col--;
            rectangle.translate(-CELL_SIZE, 0);
        }
    }

    public void moveRight() {
        if (rectangle.getX() >= (grid.getNumberOfCols() - 1) * CELL_SIZE) {
            int widthLimit = rectangle.getWidth();
            widthLimit = (grid.getNumberOfCols() - 1) * CELL_SIZE;
        } else {
            col++;
            rectangle.translate(CELL_SIZE, 0);
        }
    }

}
