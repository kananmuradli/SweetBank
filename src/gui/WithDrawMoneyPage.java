/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.settings.ActionSettings;
import gui.settings.IRegulyator;
import gui.settings.TextSettings;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WithDrawMoneyPage extends javax.swing.JFrame implements IRegulyator{

    private int withdrawQuantity = 0;
    
    /**
     * Creates new form withDrawMoneyPage
     */
    public WithDrawMoneyPage() {
        initComponents();
        getEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawmoneyPagePanel = new javax.swing.JPanel();
        userNameSurnameLabel = new javax.swing.JLabel();
        limitWarningLabel = new javax.swing.JLabel();
        withdrawmoneyQuantity = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        totalBalance = new javax.swing.JLabel();
        withdrawmoneyQuantityText = new javax.swing.JTextField();
        withdrawMoneyButton = new javax.swing.JButton();
        previousIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        withdrawmoneyPagePanel.setBackground(new java.awt.Color(255, 255, 153));

        userNameSurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userNameSurnameLabel.setForeground(new java.awt.Color(255, 102, 102));
        userNameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameSurnameLabel.setText("[KULLANICI ADI SOYADI]");

        limitWarningLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limitWarningLabel.setText("You can withdraw 5000$ and below at once.");

        withdrawmoneyQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        withdrawmoneyQuantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        withdrawmoneyQuantity.setText("How much will you draw :");

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        balanceLabel.setText("[Balance]");

        totalBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalBalance.setText(" Your total balance :");

        withdrawmoneyQuantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawmoneyQuantityTextActionPerformed(evt);
            }
        });
        withdrawmoneyQuantityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                withdrawmoneyQuantityTextKeyReleased(evt);
            }
        });

        withdrawMoneyButton.setText("Withdraw Money");
        withdrawMoneyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawMoneyButtonActionPerformed(evt);
            }
        });

        previousIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/previousIcon.png"))); // NOI18N
        previousIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout withdrawmoneyPagePanelLayout = new javax.swing.GroupLayout(withdrawmoneyPagePanel);
        withdrawmoneyPagePanel.setLayout(withdrawmoneyPagePanelLayout);
        withdrawmoneyPagePanelLayout.setHorizontalGroup(
            withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawmoneyPagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userNameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                .addGroup(withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousIcon)
                    .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(totalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(balanceLabel))
                    .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(limitWarningLabel))
                    .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(withdrawmoneyQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(withdrawMoneyButton))
                            .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(withdrawmoneyQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        withdrawmoneyPagePanelLayout.setVerticalGroup(
            withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawmoneyPagePanelLayout.createSequentialGroup()
                .addComponent(previousIcon)
                .addGap(31, 31, 31)
                .addComponent(userNameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(limitWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(withdrawmoneyPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawmoneyQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawmoneyQuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(withdrawMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        withdrawmoneyPagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {balanceLabel, limitWarningLabel, withdrawmoneyQuantity});

        withdrawmoneyPagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {userNameSurnameLabel, withdrawmoneyQuantityText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawmoneyPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(withdrawmoneyPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawmoneyQuantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawmoneyQuantityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawmoneyQuantityTextActionPerformed

    private void withdrawMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawMoneyButtonActionPerformed
        JOptionPane.showMessageDialog(this, "SUCCESSFUL.\n"
                + "Withdraw Quantity :" + this.withdrawQuantity + " $");
        ActionSettings.setVisible(this, new AccountPage());
    }//GEN-LAST:event_withdrawMoneyButtonActionPerformed

    private void withdrawmoneyQuantityTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_withdrawmoneyQuantityTextKeyReleased
        this.withdrawQuantity = TextSettings.checkTheTextKeyReleased(withdrawmoneyQuantityText, 5000);
    }//GEN-LAST:event_withdrawmoneyQuantityTextKeyReleased

    private void previousIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousIconMouseClicked
        ActionSettings.setVisible(this, new AccountPage());
    }//GEN-LAST:event_previousIconMouseClicked

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
            java.util.logging.Logger.getLogger(WithDrawMoneyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithDrawMoneyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithDrawMoneyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithDrawMoneyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithDrawMoneyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel limitWarningLabel;
    private javax.swing.JLabel previousIcon;
    private javax.swing.JLabel totalBalance;
    private javax.swing.JLabel userNameSurnameLabel;
    private javax.swing.JButton withdrawMoneyButton;
    private javax.swing.JPanel withdrawmoneyPagePanel;
    private javax.swing.JLabel withdrawmoneyQuantity;
    private javax.swing.JTextField withdrawmoneyQuantityText;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getEdits() {
    this.setLocationRelativeTo(null);
    withdrawmoneyPagePanel.setFocusable(true);
    TextSettings.setOnlyNumber(withdrawmoneyQuantityText);
    TextSettings.setMaxLimit(withdrawmoneyQuantityText, 4);
    
    }
}