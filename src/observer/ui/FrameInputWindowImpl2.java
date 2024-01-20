package observer.ui;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameInputWindowImpl2 extends FrameInputWindow {

    public FrameInputWindowImpl2() {
        Font f = new Font("Courier", Font.BOLD,14);
        input1TF = new JTextField(5);
        input2TF = new JTextField(5);        
        multiplyBtn = new JButton("Multiply");
        multiplyBtn.setFont(f);
        clearBtn = new JButton("Clear");
        clearBtn.setFont(f);
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        JLabel in1 = new JLabel("Input 1");
        in1.setFont(f);
        content.add(in1);
        content.add(input1TF);
        JLabel in2 = new JLabel("Input 2");
        in2.setFont(f);
        content.add(in2);
        content.add(input2TF);
        content.add(multiplyBtn);        
        content.add(clearBtn);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Alternative Input Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
