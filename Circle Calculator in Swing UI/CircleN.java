package circlen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
class CircleN {
    double radius;
    double getRadius() {
        return radius;
    }
    public void setRadius(double value) {
        radius = value;
    }
    double calculateDiameter() {
        double k = radius * 2;
        return k;
    }
    double calculateCircumference() {
        double n = 2 * radius * 3.142;
        return n;
    }
    double calculateArea() {
        double a = 3.142 * (radius * radius);
        return a;
    }

    void ShowCharacteristics() {
        JOptionPane.showMessageDialog(null, "\nCircle Characteristics \n" +
            "Side:          " + getRadius() + "\n" +
            "Diameter:      " + calculateDiameter() + "\n" +
            "Circumference: " + calculateCircumference() + "\n" +
            "Area:          " + calculateArea());
    }


}
class Sphere extends CircleN {
    public void ShowCharacteristics() {
        // Because Sphere is based on Circle, you can access
        // any public member(s) of Circle without qualifying it(them)
        JOptionPane.showMessageDialog(null, "\nSphere Characteristics\n" + "\n" +
            "Side:          " + getRadius() + "\n" +
            "Diameter:      " + calculateDiameter() + "\n" +
            "Circumference: " + calculateCircumference() + "\n" +
            "Area:          " + calculateArea());
    }

}
public class CirSpNab {
    public static void main(String[] args) {
        JLabel jlab = new JLabel("Radius");
        JFrame jfrm = new JFrame("Radius of Circle and Sphere");
        jfrm.setSize(400, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnC = new JButton("Circle");
        JButton jbtnS = new JButton("Sphere");
        jfrm.add(jbtnC);
        jfrm.add(jbtnS);
        CircleN c = new CircleN();
        Sphere c1 = new Sphere();


        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 120, 50, 30);
        jfrm.add(tf1);
        jbtnC.setBounds(50, 200, 95, 30);
        jbtnS.setBounds(200, 200, 95, 30);

        // String s1=tf1.getText();  
        //double l=Integer.parseInt(s1);
        // c.setRadius(l);
        jbtnC.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                String s1 = tf1.getText();
                double l = Integer.parseInt(s1);
                c.setRadius(l);
                c.ShowCharacteristics();

            }
        });
        jbtnS.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                String s2 = tf1.getText();
                double v = Integer.parseInt(s2);
                c1.setRadius(v);
                c1.ShowCharacteristics();
            }
        });


        //Add the label to the content pane.
        jfrm.add(jlab);
        //Display the frame.
        jfrm.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CircleN();
            }
        });
    }
}
