package buttonnab;
//Run this in Netbeans or Eclipse.
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
public class ButtonNab {
    public static void main(String[] args) {
        JFrame f = new JFrame("Press Button");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Karachi.");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}