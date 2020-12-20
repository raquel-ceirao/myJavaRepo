package org.academiadecodigo.anderdogs;

import org.academiadecodigo.anderdogs.grid.CellPainter;
import org.academiadecodigo.anderdogs.grid.Grid;
import org.academiadecodigo.anderdogs.movement.KeyboardOptions;

public class Main {

    public static void main(String[] args) {

        PaintApp paintApp = new PaintApp(28, 28);
        KeyboardOptions keyboardOptions = new KeyboardOptions(paintApp);

    }
}
