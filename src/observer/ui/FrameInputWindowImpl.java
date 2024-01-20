package observer.ui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameInputWindowImpl extends FrameInputWindow {

    public FrameInputWindowImpl() {
        input1TF = new JTextField(10);
        input2TF = new JTextField(10);
        multiplyBtn = new JButton("Multiply");
        clearBtn = new JButton("Clear");
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input 1"));
        content.add(input1TF);
        content.add(new JLabel("Input 2"));
        content.add(input2TF);
        content.add(multiplyBtn);        
        content.add(clearBtn);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Input Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
