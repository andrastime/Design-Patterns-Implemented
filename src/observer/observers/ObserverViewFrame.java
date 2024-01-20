package observer.observers;

import observer.models.ModelIntegers;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ObserverViewFrame extends JFrame implements Observer {

    private JTextField input1TF;
    private JTextField input2TF;
    private JTextField outputTF;

    public ObserverViewFrame(int index) {
        input1TF = new JTextField(10);
        input1TF.setEditable(false);
        input2TF = new JTextField(10);
        input2TF.setEditable(false);
        outputTF = new JTextField(10);
        outputTF.setEditable(false);
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input1 value"));
        content.add(input1TF);
        content.add(new JLabel("Input2 value"));
        content.add(input2TF);
        content.add(new JLabel("Result"));
        content.add(outputTF);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Observer Frame " + (index + 1));
        this.setLocation(0, index * 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ModelIntegers) {
            ModelIntegers s = (ModelIntegers) o;
            int input1 = s.getInput1();
            int input2 = s.getInput2();
            if (input1 == 0 && input2 == 0) {
                input1TF.setText(String.valueOf(""));
                input2TF.setText(String.valueOf(""));
                outputTF.setText(String.valueOf(""));
            } else {
                input1TF.setText(String.valueOf(input1));
                input2TF.setText(String.valueOf(input2));
                outputTF.setText(String.valueOf(input1*input2));
            }
        }
    }
}
