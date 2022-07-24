package foodordernab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nabeel Ahmed Siddiqui - https://github.com/nabeelsiddiquidev97
 */
class FoodOrder {
    int pizza = 0;
    int burger = 0;
    int colddrink = 0;

    void setPizza(int p) {
        pizza = p;
    }

    int getPizza() {
        return pizza;
    }

    void setBurger(int b) {
        burger = b;
    }

    int getBurger() {
        return burger;
    }

    void setColddrink(int cd) {
        colddrink = cd;
    }

    int getColddrink() {
        return colddrink;
    }

    void total() {
        int t = pizza + burger + colddrink;

        JOptionPane.showMessageDialog(null, "\n***Order Total*** \n" +
            "Pizza : Rs." + getPizza() + "\n" +
            "Burger : Rs." + getBurger() + "\n" +
            "Cold Drink Rs.: " + getColddrink() + "\n" +
            "------------------" + "\n" +
            "Total : Rs." + t
        );
    }
}
public class FoodOrderNab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jfrm = new JFrame("Food Ordering Application");
        JLabel label = new JLabel();
        FoodOrder fd = new FoodOrder();
        //label.setBounds(100, 20, 50, 50);
        //label.getBounds();
        //label.setLayout(new FlowLayout());
        //label.setAlignmentX(150);
        //label.setAlignmentY(250);
        JCheckBox checkBox1 = new JCheckBox("Pizza @ Rs.130");
        checkBox1.setBounds(100, 100, 150, 50);
        JCheckBox checkBox2 = new JCheckBox("Burger @ Rs.50");
        checkBox2.setBounds(100, 150, 150, 50);
        JCheckBox checkBox3 = new JCheckBox("Cold Drink @ Rs.30");
        checkBox3.setBounds(100, 200, 150, 50);
        //checkBox1.isSelected();
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkBox1.isSelected() == true)
                    fd.setPizza(130);

                else if (checkBox1.isSelected() == false)
                    fd.setPizza(0);

            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkBox2.isSelected() == true)
                    fd.setBurger(50);

                else if (checkBox2.isSelected() == false)
                    fd.setBurger(0);
            }
        });
        checkBox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkBox3.isSelected() == true)
                    fd.setColddrink(30);

                else if (checkBox3.isSelected() == false)
                    fd.setColddrink(0);
            }
        });


        jfrm.add(checkBox1);
        jfrm.add(checkBox2);
        jfrm.add(checkBox3);

        JButton jbtn = new JButton("Order");
        jbtn.setBounds(100, 250, 100, 50);
        jbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                fd.total();
            }
        });
        label.setText("Welcome To! Food Ordering System");
        //label.setBounds(150, 50, 100, 30);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        jfrm.setLayout(null);
        jfrm.add(jbtn);
        jfrm.add(label);

        jfrm.setSize(400, 450);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jfrm.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FoodOrderNab();
            }
        });
    }
}