/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICApp;

import javax.swing.JOptionPane;

/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
public class IceCreamApplicaton extends javax.swing.JFrame {

    /**
     * Creates new form IceCreamApplicaton
     */
    public IceCreamApplicaton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Strwbry_RadBtn = new javax.swing.JRadioButton();
        Van_RadBtn = new javax.swing.JRadioButton();
        BBry_RadBtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Sprinkle_Chk = new javax.swing.JCheckBox();
        Pnuts_Chk = new javax.swing.JCheckBox();
        Wfr_Chk = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SubTot_TF = new javax.swing.JTextField();
        Tax_TF = new javax.swing.JTextField();
        Total_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cal_BTN = new javax.swing.JButton();
        Reset_BTN = new javax.swing.JButton();
        Exit_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(Strwbry_RadBtn);
        Strwbry_RadBtn.setText("Strawberyy Rs.100");

        buttonGroup1.add(Van_RadBtn);
        Van_RadBtn.setText("Vanilla Rs.80");
        Van_RadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Van_RadBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(BBry_RadBtn);
        BBry_RadBtn.setText("Blueberry Rs.160");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Flavours");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBry_RadBtn)
                            .addComponent(Van_RadBtn)
                            .addComponent(Strwbry_RadBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Strwbry_RadBtn)
                .addGap(13, 13, 13)
                .addComponent(Van_RadBtn)
                .addGap(18, 18, 18)
                .addComponent(BBry_RadBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Sprinkle_Chk.setText("Sprinkles Rs.50");

        Pnuts_Chk.setText("Peanuts Rs.80");

        Wfr_Chk.setText("Waffer Rs.70");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Toppings");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Wfr_Chk)
                            .addComponent(Sprinkle_Chk)
                            .addComponent(Pnuts_Chk)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sprinkle_Chk)
                .addGap(18, 18, 18)
                .addComponent(Pnuts_Chk)
                .addGap(18, 18, 18)
                .addComponent(Wfr_Chk)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        jLabel1.setText("Ice Cream Application");

        jLabel2.setText("Sub Total");

        jLabel3.setText("Tax");

        jLabel4.setText("Total");

        Cal_BTN.setText("Calculate");
        Cal_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cal_BTNActionPerformed(evt);
            }
        });

        Reset_BTN.setText("Reset");
        Reset_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_BTNActionPerformed(evt);
            }
        });

        Exit_BTN.setText("Exit");
        Exit_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cal_BTN)
                        .addGap(18, 18, 18)
                        .addComponent(Reset_BTN)
                        .addGap(24, 24, 24)
                        .addComponent(Exit_BTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SubTot_TF)
                    .addComponent(Tax_TF)
                    .addComponent(Total_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubTot_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cal_BTN)
                            .addComponent(Reset_BTN)
                            .addComponent(Exit_BTN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tax_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Van_RadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Van_RadBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Van_RadBtnActionPerformed

    private void Exit_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_BTNActionPerformed
        int confirmation=JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Alert!",
        JOptionPane.YES_NO_OPTION);
         if (confirmation == JOptionPane.YES_OPTION) {
      dispose();
    }
    }//GEN-LAST:event_Exit_BTNActionPerformed

    private void Reset_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_BTNActionPerformed
       int confirmation=JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to Reset?", "Reset Alert!",
        JOptionPane.YES_NO_OPTION);
       if (confirmation == JOptionPane.YES_OPTION) {
        buttonGroup1.clearSelection();
        Pnuts_Chk.setSelected(false);
        Sprinkle_Chk.setSelected(false);
        Wfr_Chk.setSelected(false);
        SubTot_TF.setText(null);
        Tax_TF.setText(null);        
        Total_TF.setText(null);       
       }
    }//GEN-LAST:event_Reset_BTNActionPerformed

    private void Cal_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cal_BTNActionPerformed
    double total, subtotal =0; double tax;
      final double TAXRATE = 0.05;
       String a=Van_RadBtn.getText();String b=Strwbry_RadBtn.getText();
       String c=BBry_RadBtn.getText();String d=Pnuts_Chk.getText();
       String l=Wfr_Chk.getText();String m=Sprinkle_Chk.getText();
      
     //String z=b.substring((b.indexOf('.')+1), b.length());
      if (Van_RadBtn.isSelected()){
          subtotal=subtotal+ Integer.parseInt(a.substring((a.indexOf('.')+1), a.length()));
                }
      else if(Strwbry_RadBtn.isSelected()){
          subtotal=subtotal+ Integer.parseInt(b.substring((b.indexOf('.')+1), b.length())) ;
      }
      
       else if(BBry_RadBtn.isSelected()){
          subtotal=subtotal+ Integer.parseInt(c.substring((c.indexOf('.')+1), c.length()));
      }
      if(Sprinkle_Chk.isSelected()){
          subtotal=subtotal+ Integer.parseInt(m.substring((m.indexOf('.')+1), m.length()));
      }
      
      if(Pnuts_Chk.isSelected()){
          subtotal=subtotal+ Integer.parseInt(d.substring((d.indexOf('.')+1), d.length()));
      }
      if(Wfr_Chk.isSelected()){
          subtotal=subtotal+ Integer.parseInt(l.substring((l.indexOf('.')+1), l.length()));
      }
      
      SubTot_TF.setText(Double.toString(subtotal));
      subtotal=Double.parseDouble(SubTot_TF.getText());
      
      tax=subtotal *TAXRATE;
      total=subtotal+tax;
      Tax_TF.setText(Double.toString(tax));
      Total_TF.setText(Double.toString(total));

    }//GEN-LAST:event_Cal_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IceCreamApplicaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IceCreamApplicaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IceCreamApplicaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IceCreamApplicaton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IceCreamApplicaton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BBry_RadBtn;
    private javax.swing.JButton Cal_BTN;
    private javax.swing.JButton Exit_BTN;
    private javax.swing.JCheckBox Pnuts_Chk;
    private javax.swing.JButton Reset_BTN;
    private javax.swing.JCheckBox Sprinkle_Chk;
    private javax.swing.JRadioButton Strwbry_RadBtn;
    private javax.swing.JTextField SubTot_TF;
    private javax.swing.JTextField Tax_TF;
    private javax.swing.JTextField Total_TF;
    private javax.swing.JRadioButton Van_RadBtn;
    private javax.swing.JCheckBox Wfr_Chk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
