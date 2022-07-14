package swingnab;
import javax.swing.*;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
public class SwingNab {
    SwingNab() {
        JFrame jfrm = new JFrame("Hello JFrame");
        jfrm.setSize(800, 480);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing means Powerful GUI");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingNab(); {}
            }
        });
    }
}