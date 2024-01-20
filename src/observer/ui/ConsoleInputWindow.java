package observer.ui;

import observer.controllers.ConsoleInputController;
import java.util.Scanner;

public class ConsoleInputWindow implements InputWindow {

    private final Scanner in;
    private String input1;
    private String input2;
    private ConsoleInputController cc;

    public ConsoleInputWindow() {
        in = new Scanner(System.in);
        input1 = "";
        input2 = "";
    }

    public void addController(ConsoleInputController cc) {
        this.cc = cc;
    }

    public void setInputs() {
        System.out.print("Enter input 1:");
        input1 = in.nextLine();
        System.out.print("Enter input 2:");
        input2 = in.nextLine();
        cc.multiply();
    }

    @Override
    public String getInput1() {
        return this.input1;
    }

    @Override
    public String getInput2() {
        return this.input2;
    }

    public boolean checkForExit() {
        System.out.print("Multiply more numbers?(y/n/c(lear)/e(xit)) ");
        String userIN = in.nextLine();
        if (userIN.equalsIgnoreCase("y")) {
            return true;
        } else if (userIN.equalsIgnoreCase("c")) {
            System.exit(0);
        } else if (userIN.equalsIgnoreCase("r")) {
            cc.reset();
            return true;
        } else;
        return false;
    }

    public void showOpeningMessage() {
        System.out.println("Console Input Frame");
        System.out.println("Awaiting input");
    }

    @Override
    public void showError(String errMsg) {
        System.err.println(errMsg);
    }

}
