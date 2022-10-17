package templateMethod;

import templateMethod.keyboard.Keyboard;
import templateMethod.keyboard.LoggingKeyboard;

public class Main {
    public static void main(String[] args) {
//        Keyboard keyboard = new LoggingKeyboard();
        Keyboard keyboard = new EscKeyMonitoringKeyboard();
        keyboard.press(new AlphabetKey("A"));
        keyboard.press(new AlphabetKey("B"));
        keyboard.press(new AlphabetKey("C"));
        keyboard.press(new AlphabetKey("ESC"));

    }
}
