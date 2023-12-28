/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainMenu;

/**
 *
 * @author Hui Shan
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNewsSection = new javax.swing.JButton();
        btnPointsShop = new javax.swing.JButton();
        btnLeaderBoard = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        btnDailyTrivia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 249, 168, 240));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("MAIN MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 120));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51, 100));

        btnNewsSection.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnNewsSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/news.png"))); // NOI18N
        btnNewsSection.setText("     News Section");
        btnNewsSection.setToolTipText("");
        btnNewsSection.setActionCommand("        News Section");
        btnNewsSection.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNewsSection.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsSectionActionPerformed(evt);
            }
        });

        btnPointsShop.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnPointsShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pointsshop.png"))); // NOI18N
        btnPointsShop.setText("     Points Shop");
        btnPointsShop.setActionCommand("        Points Shop");
        btnPointsShop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPointsShop.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointsShopActionPerformed(evt);
            }
        });

        btnLeaderBoard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnLeaderBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-leaderboard-48_1.png"))); // NOI18N
        btnLeaderBoard.setText("   Leaderboard");
        btnLeaderBoard.setToolTipText("");
        btnLeaderBoard.setActionCommand("        News Section");
        btnLeaderBoard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLeaderBoard.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderBoardActionPerformed(evt);
            }
        });

        btnCheckIn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/daily check-in.png"))); // NOI18N
        btnCheckIn.setText("     Daily Check-In");
        btnCheckIn.setBorder(null);
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        btnDailyTrivia.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnDailyTrivia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/quiz.png"))); // NOI18N
        btnDailyTrivia.setText("     Daily Trivia");
        btnDailyTrivia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDailyTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyTriviaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewsSection, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDailyTrivia, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPointsShop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLeaderBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewsSection, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPointsShop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDailyTrivia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLeaderBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 890, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/road_between_green_trees_grass_plants_bushes_sunbeam_hd_nature.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnDailyTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyTriviaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDailyTriviaActionPerformed

    private void btnNewsSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsSectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewsSectionActionPerformed

    private void btnPointsShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointsShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPointsShopActionPerformed

    private void btnLeaderBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderBoardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeaderBoardActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnDailyTrivia;
    private javax.swing.JButton btnLeaderBoard;
    private javax.swing.JButton btnNewsSection;
    private javax.swing.JButton btnPointsShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
