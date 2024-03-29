/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mamnkeli.Khaka
 */
public class InputFrame extends javax.swing.JFrame {

    /**
     * Creates new form InputFrame
     */
    public InputFrame() {
        initComponents();
        groupRadio();
    }
    
    public void groupRadio(){
       buttonGroup2.add(rbUnder65);
       buttonGroup2.add(rbUnder75);
       buttonGroup2.add(rbOver75);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfIncome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAfter = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        Monthly = new javax.swing.JLabel();
        tfMonth = new javax.swing.JTextField();
        rbUnder65 = new javax.swing.JRadioButton();
        rbUnder75 = new javax.swing.JRadioButton();
        rbOver75 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Enter Annual Income");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Tax Amount");

        tfTax.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Income After Tax");

        tfAfter.setEditable(false);

        btnGenerate.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        Monthly.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Monthly.setText("Monthly Income");

        tfMonth.setEditable(false);

        buttonGroup2.add(rbUnder65);
        rbUnder65.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbUnder65.setSelected(true);
        rbUnder65.setText("Under age 65");
        rbUnder65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnder65ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbUnder75);
        rbUnder75.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbUnder75.setText("Age 65 to 75");
        rbUnder75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnder75ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbOver75);
        rbOver75.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbOver75.setText("Over age 75");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Tax Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnGenerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Monthly))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfIncome)
                                .addComponent(tfTax)
                                .addComponent(tfAfter)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rbUnder65)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbUnder75)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(rbOver75))))
                                        .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(4, 4, 4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(resultLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUnder65)
                    .addComponent(rbUnder75)
                    .addComponent(rbOver75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAfter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Monthly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(btnClear))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfIncome.setText("");
        tfTax.setText("");
        tfAfter.setText("");
        tfMonth.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        double income = Double.parseDouble(tfIncome.getText());
        double tax;
        double incomeAfterTax;
        double monthly;
        double rebate = 0;
        
        if(rbUnder65.isSelected()){
           // Apply tax rates based on income brackets
        if (income <= 95750) {
            tax = 0;
            rebate = 0;
        } else if (income > 95750 && income <= 237100) {
            tax = income * 0.18;
            rebate = 17235;
        } else if (income > 237100 && income <=370500) {
            tax = 42678 + ((income - 237100) * 0.26);
            rebate = 17235;
        } else if (income >370500 && income <= 512800) {
            tax = 77362 + ((income - 370500) * 0.31);
            rebate = 17235;
        } else if (income >512800 && income <= 673000) {
            tax = 121475 + ((income - 512800) * 0.36);
            rebate = 17235;
        } else if (income >673000 && income <= 857900) {
            tax = 179147 + ((income - 673000) * 0.39);
            rebate = 17235;
        } else if (income >857900 && income <= 1817000) {
            tax = 251258 + ((income - 857900) * 0.41);
            rebate = 17235;
        } else {         
            tax = 644489 + ((income - 1817000) * 0.45);
            rebate = 17235;
        }
        incomeAfterTax = income - tax;
        monthly = (incomeAfterTax + rebate) / 12;
        tfTax.setText("R" + tax);
        tfAfter.setText("R" + incomeAfterTax);
        tfMonth.setText("R" + monthly);
        
        
        }else if(rbUnder75.isSelected()){
        // Apply tax rates based on income brackets
        if (income <= 148217) {
            tax = 0;
        } else if (income > 148217 && income <= 237100) {
            tax = income * 0.18;
            rebate = 94444;
        } else if (income > 237100 && income <=370500) {
            tax = 42678 + ((income - 237100) * 0.26);
            rebate = 94444;
        } else if (income >370500 && income <= 512800) {
            tax = 77362 + ((income - 370500) * 0.31);
            rebate = 94444;
        } else if (income >512800 && income <= 673000) {
            tax = 121475 + ((income - 512800) * 0.36);
            rebate = 94444;
        } else if (income >673000 && income <= 857900) {
            tax = 179147 + ((income - 673000) * 0.39);
            rebate = 94444;
        } else if (income >857900 && income <= 1817000) {
            tax = 251258 + ((income - 857900) * 0.41);
            rebate = 94444;
        } else {
            tax = 644489 + ((income - 1817000) * 0.45);
            rebate = 94444;
        }
        incomeAfterTax = income - tax;
        monthly = (incomeAfterTax + rebate) / 12;
        tfTax.setText("R" + tax);
        tfAfter.setText("R" + incomeAfterTax);
        tfMonth.setText("R" + monthly);
        
        }else if(rbOver75.isSelected()){
                  // Apply tax rates based on income brackets
        if (income <= 165689) {
            tax = 0;
        } else if (income > 165689 && income <= 237100) {
            tax = income * 0.18;
            rebate = 3145;
        } else if (income > 237100 && income <=370500) {
            tax = 42678 + ((income - 237100) * 0.26);
            rebate = 3145;
        } else if (income >370500 && income <= 512800) {
            tax = 77362 + ((income - 370500) * 0.31);
            rebate = 3145;
        } else if (income >512800 && income <= 673000) {
            tax = 121475 + ((income - 512800) * 0.36);
            rebate = 3145;
        } else if (income >673000 && income <= 857900) {
            tax = 179147 + ((income - 673000) * 0.39);
            rebate = 3145;
        } else if (income >857900 && income <= 1817000) {
            tax = 251258 + ((income - 857900) * 0.41);
            rebate = 3145;
        } else {
            tax = 644489 + ((income - 1817000) * 0.45);
            rebate = 3145;
        }
        incomeAfterTax = income - tax;
        monthly = (incomeAfterTax + rebate) / 12;
        tfTax.setText("R" + tax);
        tfAfter.setText("R" + incomeAfterTax);
        tfMonth.setText("R" + monthly);  
        }
        

         
        
    }//GEN-LAST:event_btnGenerateActionPerformed


    
    private void rbUnder65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnder65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbUnder65ActionPerformed

    private void rbUnder75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnder75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbUnder75ActionPerformed

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
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Monthly;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbOver75;
    private javax.swing.JRadioButton rbUnder65;
    private javax.swing.JRadioButton rbUnder75;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField tfAfter;
    private javax.swing.JTextField tfIncome;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfTax;
    // End of variables declaration//GEN-END:variables
}
