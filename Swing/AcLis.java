//Program of Action Listener 

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AcLis {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        JTextField tf = new JTextField();
        tf.setBounds(125, 150, 150, 40);
        JButton b = new JButton("Click");
        b.setBounds(150, 200, 70, 50);
        b.addActionListener((ActionEvent e) -> {
            tf.setText("Hello Student");
        });
        f.add(b);
        f.add(tf);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
