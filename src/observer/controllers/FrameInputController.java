package observer.controllers;

import observer.models.ModelIntegers;
import observer.ui.FrameInputWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameInputController { //controller for all Frame Input windows

    FrameInputWindow m_input;
    ModelIntegers m_model;

    public FrameInputController(ModelIntegers model, FrameInputWindow input) {
        m_model = model;
        m_input = input;
//... Add listeners to the input.
        input.addMultiplyListener(new MultiplyListener());
        input.addClearListener(new ClearListener());
    }

    public class MultiplyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                m_model.modifyValues(Integer.parseInt(m_input.getInput1()), Integer.parseInt(m_input.getInput2()));
            } catch (NumberFormatException nfex) {
                m_input.showError("Bad input: '" + m_input.getInput1() + "'" + ", '" + m_input.getInput2() + "'");
            }
        }
    }//end inner class MultiplyListener

    public class ClearListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_input.reset();
        }
    }// end inner class ClearListener
}
