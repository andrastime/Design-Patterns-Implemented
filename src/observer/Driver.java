package observer;

import observer.controllers.ConsoleInputController;
import observer.controllers.FrameInputController;
import observer.models.ModelIntegers;
import observer.observers.ObserverViewFrame;
import observer.ui.ConsoleInputWindow;
import observer.ui.FrameInputWindowImpl;
import observer.ui.FrameInputWindowImpl2;

public class Driver {

    public static void main(String[] args) {
//Initialise the variables to be used.
        ModelIntegers model = new ModelIntegers();
        FrameInputWindowImpl frame = new FrameInputWindowImpl();
        FrameInputWindowImpl2 frame2 = new FrameInputWindowImpl2();
        ConsoleInputWindow console = new ConsoleInputWindow();
        //initialise the controllers
        FrameInputController controller = new FrameInputController(model, frame);
        FrameInputController controller2 = new FrameInputController(model, frame2);
        ConsoleInputController consController = new ConsoleInputController(model, console);
        console.addController(consController);
// Show the first input window
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
// Show the second input window
        int xPos = frame.getLocation().x;
        int yPos = frame.getLocation().y;
        int height = frame.getHeight();
        frame2.setLocation(xPos, yPos - height);
        frame2.setVisible(true);
// add the observers to observable
        for (int i = 0; i < 3; i++) {
            model.addObserver(new ObserverViewFrame(i));
        }
// Set console for input
        console.showOpeningMessage();
        do {
            console.setInputs();
        } while (console.checkForExit());

    }
}
