package org.academiadecodigo.anderdogs;

import org.academiadecodigo.anderdogs.grid.Cell;
import org.academiadecodigo.anderdogs.grid.CellPainter;
import org.academiadecodigo.anderdogs.grid.Grid;
import org.academiadecodigo.anderdogs.movement.Direction;

public class PaintApp {

    private Grid grid;
    private CellPainter cellPainter;
    private boolean painting;
    private FileEditor fileEditor;

    public PaintApp(int rows, int cols) {
        grid = new Grid(rows, cols);
        cellPainter = new CellPainter();
        fileEditor = new FileEditor();
    }

    //movement
    public void moveCellPainter(Direction direction) {

        switch (direction) {
            case UP:
                cellPainter.moveUp();
                break;
            case DOWN:
                cellPainter.moveDown();
                break;
            case LEFT:
                cellPainter.moveLeft();
                break;
            case RIGHT:
                cellPainter.moveRight();
                break;
        }

        if (painting) {
            paintCell();
        }
    }

    //action: paint cell
    public void paintCell() {
        Cell cell = grid.getCell(cellPainter.getRow(), cellPainter.getCol());
        if (cell.isPainted()) {
            cell.erase();
        } else {
            cell.paint();
        }
    }

    //action: clear grid
    public void clear() {
        grid.clearGrid();
    }

    //action: save grid
    public void save() {
        fileEditor.saveToFile(grid.toString());
    }

    //setters
    public void setPainting(boolean painting) {
        this.painting = painting;
    }
}
