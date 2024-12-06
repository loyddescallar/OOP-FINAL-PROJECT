
package myproject.oop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
   Connection conn;
   PreparedStatement pst;
   ResultSet rs;

    public Login() {
        initComponents();
       conn = MyprojectOOP.conn();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Left.setBackground(new java.awt.Color(41, 37, 37));
        Left.setForeground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(500, 600));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOYD\\Documents\\NetBeansProjects\\Myproject,OOP\\src\\myproject\\oop\\photo\\Logo2.jpg")); // NOI18N
        Left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 400, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descallar Satellite Services");
        Left.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myproject/oop/photo/Facebook-logo.png"))); // NOI18N
        Left.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CignalTVBalayan");
        Left.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOYD\\Documents\\NetBeansProjects\\Myproject,OOP\\src\\myproject\\oop\\photo\\png-transparent-iphone-telephone-computer-icons-center-electronics-text-telephone-call.png")); // NOI18N
        Left.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("09175119647 / 09755718056");
        Left.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOYD\\Documents\\NetBeansProjects\\Myproject,OOP\\src\\myproject\\oop\\photo\\googlemaps.jpg")); // NOI18N
        Left.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Langgangan, Balayan, Batangas");
        Left.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 556, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cignal TV Balayan");
        Left.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 50));

        jPanel1.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));
        Left.getAccessibleContext().setAccessibleName("");

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(500, 600));
        Right.setPreferredSize(new java.awt.Dimension(500, 600));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOGIN");
        Right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Account Number:");
        Right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Account Name:");
        Right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Enter the account holder name");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Right.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 450, 43));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Enter the account number of cignal box");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Right.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 450, 43));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Right.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 105, 35));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Admin ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Right.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 105, 37));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("100% Digital 100% HD");
        Right.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Since 2009");
        Right.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("I Don't Have a account, Register?");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Right.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        jPanel1.add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Admin AdminFrame = new Admin();
        AdminFrame.setVisible (true);
        AdminFrame.pack();
        AdminFrame.setLocationRelativeTo(null);
        this.dispose();
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible (true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String AccountName = jTextField1.getText();
      String AccountNumber = jTextField2.getText();
       try{
           String sqlquery = "SELECT * FROM user_register WHERE AccountName=? AND AccountNumber=?";
           pst = conn.prepareStatement(sqlquery);
           pst.setString(1, AccountName);
           pst.setString(2,String.valueOf(AccountNumber));
           rs = pst.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Login Successful");
      ClientInterface ClientInterfaceFrame = new ClientInterface();
      ClientInterfaceFrame.setVisible(true);
      ClientInterfaceFrame.pack();
      ClientInterfaceFrame.setLocationRelativeTo(null);
      this.dispose();
}
           else{
               JOptionPane.showMessageDialog(null, "AccountName and AccountNumber is Incorrect");
           }
       }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
        
       
       
//      ClientInterface ClientInterfaceFrame = new ClientInterface();
//      ClientInterfaceFrame.setVisible(true);
//      ClientInterfaceFrame.pack();
//      ClientInterfaceFrame.setLocationRelativeTo(null);
//      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       this.setVisible(false);
       new Register().setVisible(true);        
    }//GEN-LAST:event_jLabel8MouseClicked
   
   
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
