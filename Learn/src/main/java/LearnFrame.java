import java.awt.event.ActionEvent;

public class LearnFrame extends javax.swing.JFrame {

    /**
     * Creates new form LearnFrame
     */
    public LearnFrame() {
        initComponents();
        
        // Add ActionListeners for buttons
        sqrtButton.addActionListener((ActionEvent evt) -> {
            calculateSqrt();
        });

        powerButton.addActionListener((ActionEvent evt) -> {
            calculateSquare();
        });

        cubeButton.addActionListener((ActionEvent evt) -> {
            calculateCube();
        });
        
        swapButton.addActionListener((ActionEvent evt) -> {
            calculateSwap();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        outPut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inPut = new javax.swing.JTextField();
        sqrtButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        swapButton = new javax.swing.JButton();
        cubeButton = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outPut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outPutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter Number");

        sqrtButton.setText("sqrt");

        powerButton.setText("sqr");

        swapButton.setText("swap");

        cubeButton.setText("cube");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(outPut, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sqrtButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(powerButton)
                                .addGap(18, 18, 18)
                                .addComponent(swapButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(inPut, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(cubeButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(outPut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inPut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqrtButton)
                    .addComponent(powerButton)
                    .addComponent(swapButton)
                    .addComponent(cubeButton))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outPutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outPutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outPutActionPerformed

    private void calculateSqrt() {
        try {
            double number = Double.parseDouble(inPut.getText());
            double sqrtValue = Math.sqrt(number);
            outPut.setText(String.valueOf(sqrtValue));
        } catch (NumberFormatException e) {
            outPut.setText("Invalid input");
        }
    }

    private void calculateSquare() {
        try {
            double number = Double.parseDouble(inPut.getText());
            double squareValue = Math.pow(number, 2);
            outPut.setText(String.valueOf(squareValue));
        } catch (NumberFormatException e) {
            outPut.setText("Invalid input");
        }
    }

    private void calculateCube() {
        try {
            double number = Double.parseDouble(inPut.getText());
            double cubeValue = Math.pow(number, 3);
            outPut.setText(String.valueOf(cubeValue));
        } catch (NumberFormatException e) {
            outPut.setText("Invalid input");
        }
    }
    
    private void calculateSwap() {
        double temp = Double.parseDouble(inPut.getText());
        int lastDigit = (int)temp % 10;
        int firstDigit = (int) temp / 10;
        outPut.setText(String.valueOf(lastDigit)+String.valueOf(firstDigit));
    }

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
            java.util.logging.Logger.getLogger(LearnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LearnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LearnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LearnFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LearnFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cubeButton;
    private javax.swing.JTextField inPut;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField outPut;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton swapButton;
    // End of variables declaration//GEN-END:variables
}