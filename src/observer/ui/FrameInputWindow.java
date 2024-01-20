package observer.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public abstract class FrameInputWindow extends JFrame implements InputWindow {

    protected JTextField input1TF;
    protected JTextField input2TF;
    protected JButton multiplyBtn;
    protected JButton clearBtn;

    @Override
    public String getInput1() {
        return input1TF.getText();
    }

    @Override
    public String getInput2() {
        return input2TF.getText();
    }

    @Override
    public void showError(String errMsg) {
        JOptionPane.showMessageDialog(this, errMsg);
    }

    public void reset() {
        input1TF.setText("");
        input2TF.setText("");
    }

    public void addMultiplyListener(ActionListener mal) {
        multiplyBtn.addActionListener(mal);
    }

    public void addClearListener(ActionListener cal) {
        clearBtn.addActionListener(cal);
    }

}
