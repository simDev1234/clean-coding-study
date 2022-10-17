package templateMethod.keyboard;

import templateMethod.key.KeyboardKey;

public class LoggingKeyboard extends Keyboard {
    @Override
    protected void keyUp(KeyboardKey key) {
        System.out.println("logging...key up : " + key.getKey());
    }

    @Override
    protected void keyDown(KeyboardKey key) {
        System.out.println("logging...key down : " + key.getKey());
    }
}
