/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoiTac;

import MainPage.DatabaseConnection;
import MainPage.MainRegister;
import java.sql.PreparedStatement;
import java.sql.Connection;
import static MainPage.MainRegister.getPassword;
import static MainPage.MainRegister.getUsername;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class PartnerRegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form PartnerRegisterForm
     */
    private Connection conn;
    DatabaseConnection db;
    String partnerID;
    public PartnerRegisterForm() {
        db = new DatabaseConnection();
        conn = db.getDbConnection(getUsername(), getPassword());
        initComponents();
    }
    public String getPartnerID(){
        return partnerID;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PartnerNameTextField = new javax.swing.JTextField();
        DeputyTextField = new javax.swing.JTextField();
        OrdersTextField = new javax.swing.JTextField();
        ProductTypeTextField = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NumBranchTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(248, 193, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PartnerNameTextField.setBackground(new java.awt.Color(239, 232, 232));
        PartnerNameTextField.setForeground(new java.awt.Color(51, 51, 51));
        PartnerNameTextField.setText("Partner name");
        PartnerNameTextField.setBorder(null);
        PartnerNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        DeputyTextField.setBackground(new java.awt.Color(239, 232, 232));
        DeputyTextField.setForeground(new java.awt.Color(51, 51, 51));
        DeputyTextField.setText("Deputy name");
        DeputyTextField.setBorder(null);
        DeputyTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        OrdersTextField.setBackground(new java.awt.Color(239, 232, 232));
        OrdersTextField.setForeground(new java.awt.Color(51, 51, 51));
        OrdersTextField.setText("Number of orders");
        OrdersTextField.setBorder(null);
        OrdersTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ProductTypeTextField.setBackground(new java.awt.Color(239, 232, 232));
        ProductTypeTextField.setForeground(new java.awt.Color(51, 51, 51));
        ProductTypeTextField.setText("Product type");
        ProductTypeTextField.setBorder(null);
        ProductTypeTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        RegisterButton.setBackground(new java.awt.Color(190, 8, 8));
        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");
        RegisterButton.setToolTipText("");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(190, 8, 8));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PARTNER ACCOUNT REGISTER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 97, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 98, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        NumBranchTextField.setBackground(new java.awt.Color(239, 232, 232));
        NumBranchTextField.setForeground(new java.awt.Color(51, 51, 51));
        NumBranchTextField.setText("Number of branch");
        NumBranchTextField.setBorder(null);
        NumBranchTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        EmailTextField.setBackground(new java.awt.Color(239, 232, 232));
        EmailTextField.setForeground(new java.awt.Color(51, 51, 51));
        EmailTextField.setText("Email");
        EmailTextField.setBorder(null);
        EmailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        AddressTextField.setBackground(new java.awt.Color(239, 232, 232));
        AddressTextField.setForeground(new java.awt.Color(51, 51, 51));
        AddressTextField.setText("Address");
        AddressTextField.setBorder(null);
        AddressTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PartnerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeputyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NumBranchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(OrdersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartnerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeputyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumBranchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrdersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(190, 8, 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FAST-STORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        try{
            String partnerName = PartnerNameTextField.getText();
            String deputy = DeputyTextField.getText();
            String productType = ProductTypeTextField.getText();
            String numBranch = NumBranchTextField.getText();
            String addr = AddressTextField.getText();
            String email = EmailTextField.getText();
            String orders = OrdersTextField.getText();
            boolean error = false;

            if (partnerName.length() == 0
                    || deputy.length() == 0
                    || addr.length() == 0
                    || email.length() == 0
                    || productType.length() == 0
                    || numBranch.length() == 0) // TODO add your handling code here:
            {
                JOptionPane.showMessageDialog(null, "Please enter all fields");
                error = true;
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Please enter a right email");
                error = true;
            } else if (!numBranch.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Please enter a right phone number");
                error = true;
            } else if (!orders.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Please enter a right phone number");
                error = true;
            } 
        
            if (!error) {
                String username = MainRegister.getUsername();
                String password = MainRegister.getPassword();

                String accountTable = "SELECT * FROM TAIKHOAN";
                String insertAccount = "INSERT INTO TAIKHOAN VALUES(?, ?, ?, ?, ?)";
                String insertDriver = "INSERT INTO DOITAC(MADT, TENDT,"
                        + " DAIDIENDT, DIACHIDT, EMAILDT, SOCHINHANHDK, "
                        + "TONGSODONHANG, LOAIHANGVANCHUYEN) VALUES(?,?,?,?,?,?,?,?)";

                int accountTableSize = 0;

                Connection adminConn = db.getAdminConnection();
                if (adminConn != null) {
                    Statement stmt = adminConn.createStatement();
                    ResultSet rs = stmt.executeQuery(accountTable);

                    while (rs.next()) {
                        accountTableSize++;
                    }

                    int id = accountTableSize + 1;
                    partnerID = "TK"+id;
                    PreparedStatement st = adminConn.prepareStatement(insertAccount);
                    st.setString(1, "TK" + id);
                    st.setString(2, username);
                    st.setString(3, password);
                    st.setInt(4, 1);
                    st.setInt(5, 3);
                    st.executeUpdate();

                    st = adminConn.prepareStatement(insertDriver);
                    st.setString(1, "TK" + id);
                    st.setString(2, partnerName);
                    st.setString(3, deputy);
                    st.setString(4, addr);
                    st.setString(5, email);
                    st.setString(6, numBranch);
                    st.setString(7, orders);
                    st.setString(8, productType);
                    st.executeUpdate();
                }

                System.out.println(accountTableSize + "\n" + username + " " + password);

                db.closeConnection(adminConn);
                
                setVisible(false);
                new MainPartnerForm().setVisible(true);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PartnerRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartnerRegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField DeputyTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField NumBranchTextField;
    private javax.swing.JTextField OrdersTextField;
    private javax.swing.JTextField PartnerNameTextField;
    private javax.swing.JTextField ProductTypeTextField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}