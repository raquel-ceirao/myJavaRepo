package org.academiadecodigo.anderdogs.movement;

import org.academiadecodigo.anderdogs.PaintApp;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardOptions implements KeyboardHandler {

    private Keyboard keyboard;
    private PaintApp paintApp;

    public KeyboardOptions(PaintApp paintApp) {
        this.paintApp = paintApp;
        movementKeys();
    }

    public void movementKeys() {

        keyboard = new Keyboard(this);

        //Listen to Up key
        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upPressed);

        //Listen to Down key
        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downPressed);

        //Listen to Left key
        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(leftPressed);

        //Listen to Right key
        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(rightPressed);

        //Listen to Space key
        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);

        //Listen to C key
        KeyboardEvent cPressed = new KeyboardEvent();
        cPressed.setKey(KeyboardEvent.KEY_C);
        cPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cPressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            paintApp.moveCellPainter(Direction.UP);
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            paintApp.moveCellPainter(Direction.DOWN);
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            paintApp.moveCellPainter(Direction.LEFT);
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            paintApp.moveCellPainter(Direction.RIGHT);
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            paintApp.setPainting(false);
            paintApp.paintCell();
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_C) {
            paintApp.clear();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            paintApp.setPainting(true);
        }
    }
}
