package observer.controllers;

import observer.models.ModelIntegers;
import observer.ui.ConsoleInputWindow;

public class ConsoleInputController {

	ConsoleInputWindow m_input;
	ModelIntegers m_model;

	public ConsoleInputController(ModelIntegers model, ConsoleInputWindow input) {
            m_model = model;
            m_input = input;
	}
        
        public void multiply(){
            try {
                m_model.modifyValues(Integer.parseInt(m_input.getInput1()), Integer.parseInt(m_input.getInput2()));
            } catch (NumberFormatException nfex) {
                m_input.showError("Bad input: '" + m_input.getInput1() + "'" + ", '" + m_input.getInput2() + "'");
            }
        }
        
        public void reset(){
            m_model.reset();
        }

}