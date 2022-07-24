package testcirnab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
interface GeometricObject {
    double getPerimeter();
    double getArea();

}
class Circle implements GeometricObject {
    protected double radius;

    Circle(double r) {
        radius = r;
    }

    public double getPerimeter() {
        double p = 2 * 3.142 * radius;
        return p;
    }
    public double getArea() {
        double a = 3.142 * radius * radius;
        return a;
    }

    public void showchar() {
        JOptionPane.showMessageDialog(null, "\nCircle Characteristics \n" +
            "Radius(By Default): " + radius + "\n" +
            "Perimeter Of Circle: " + getPerimeter() + "\n" +
            "Area Of Circle: " + getArea());
    }

}


interface Resizable {
    double resize(int p);
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }
    public double resize(int percentage) {
        radius = percentage;
        return radius;
    }

    public void showchar1() {
        JOptionPane.showMessageDialog(null, "\nResizing Circle Characteristics \n" +
            "After Resizing radius Perimeter Of Circle: " + getPerimeter() + "\n" +
            "After Resizing radius Area Of Circle: " + getArea());
    }
}

public class TestReSCirNab {
    public static void main(String arg[]) {
        int n = 7;
        ResizableCircle r1 = new ResizableCircle(8);
        Circle c1 = new Circle(n);
        JFrame jfrm = new JFrame("Geometric Objects");
        jfrm.setSize(480, 480);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnC = new JButton("Circle");
        JButton jbtnR = new JButton("Resize Circle");
        jbtnC.setBounds(180, 100, 95, 30);
        jbtnR.setBounds(150, 280, 150, 30);
        jfrm.add(jbtnC);
        jfrm.add(jbtnR);
        JTextField tf1;
        tf1 = new JTextField();
        tf1.setBounds(150, 250, 150, 20);
        jfrm.add(tf1);
        JLabel jlab = new JLabel("Change Radius", JLabel.CENTER);
        //jlab.setBounds(240, 140, 150, 30);
        jbtnR.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                String s1 = tf1.getText();
                int a = Integer.parseInt(s1);
                r1.resize(a);
                r1.showchar1();
            }
        });
        jbtnC.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                c1.showchar();
            }
        });
        jfrm.add(jlab);
        //Display the frame.
        jfrm.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TestReSCirNab();
            }
        });
    }
}