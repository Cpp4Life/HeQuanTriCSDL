/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hcmus.system.MainPage;

import hcmus.system.KhachHang.RegisterScreen;
import hcmus.system.NhanVien.StaffRegister;
import hcmus.system.TaiXe.DriverRegister;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class MainRegister extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public MainRegister() {
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

        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        loginNameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwdLabel = new javax.swing.JLabel();
        password2Label = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        passwordField = new javax.swing.JPasswordField();
        password2Field = new javax.swing.JPasswordField();
        continueBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products Management System");
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 222, 105));

        loginLabel.setBackground(new java.awt.Color(190, 8, 8));
        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("FAST - STORE");
        loginLabel.setOpaque(true);

        titleLabel.setBackground(new java.awt.Color(190, 8, 8));
        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Registration Form");
        titleLabel.setOpaque(true);

        loginNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginNameLabel.setText("Login Username");

        usernameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        passwdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwdLabel.setText("Password");

        password2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password2Label.setText("Confirm Password");

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeLabel.setText("Type of");

        typeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Đối tác", "Khách hàng", "Tài xế", "Nhân viên" }));
        typeComboBox.setAutoscrolls(true);

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        password2Field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        continueBtn.setBackground(new java.awt.Color(190, 8, 8));
        continueBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        continueBtn.setForeground(new java.awt.Color(255, 255, 255));
        continueBtn.setText("Continue");
        continueBtn.setBorderPainted(false);
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameField)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginNameLabel)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwdLabel)
                                            .addComponent(typeLabel)
                                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password2Label))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(continueBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel)
                .addGap(51, 51, 51)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdLabel)
                    .addComponent(password2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(typeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(continueBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        // TODO add your handling code here:
        this.username = usernameField.getText();
        this.password = String.valueOf(passwordField.getPassword());
        String password2 = String.valueOf(password2Field.getPassword());
        String type = String.valueOf(typeComboBox.getSelectedItem());
        boolean error = false;

        if (username.length() == 0 || password.length() == 0 || password2.length() == 0) {
            error = true;
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else if (!password.equals(password2)) {
            error = true;
            JOptionPane.showMessageDialog(null, "Passwords do not match");
        } else if (type.equals("None")) {
            error = true;
            JOptionPane.showMessageDialog(null, "Please choose a type of account");
        }

        if (!error) {
            System.out.println(username + " " + password);
            try {
                Connection conn = db.getAdminConnection();

                String createLogin = "CREATE LOGIN " + this.username + " WITH PASSWORD = '" + this.password + "'";
                String userSQL = this.username;
                String createUser = "CREATE USER " + userSQL + " FOR LOGIN " + this.username;
                String addRole = null;

                if (type.equals("Đối tác")) {
                    addRole = "EXEC SP_ADDROLEMEMBER 'DT', ?";
                } else if (type.equals("Khách hàng")) {
                    addRole = "EXEC SP_ADDROLEMEMBER 'KH', ?";
                } else if (type.equals("Tài xế")) {
                    addRole = "EXEC SP_ADDROLEMEMBER 'TX', ?";
                } else if (type.equals("Nhân viên")) {
                    addRole = "EXEC SP_ADDROLEMEMBER 'NV', ?";
                }

                System.out.println(createLogin);
                System.out.println(createUser);
                System.out.println(addRole);

                // CREATE LOGIN
                System.out.println("\nCALL CREATE LOGIN");
                PreparedStatement stmt = conn.prepareStatement(createLogin);
                int i = stmt.executeUpdate();
                System.out.println(i + "row(s) affected");

                // CREATE USER FOR LOGIN
                System.out.println("\nCALL CREATE USER");
                stmt = conn.prepareStatement(createUser);
                i = stmt.executeUpdate();
                System.out.println(i + "row(s) affected");

                // EXEC SP_ADDROLEMEMBER
                System.out.println("\nEXECUTE ADD ROLE MEMBER");
                CallableStatement st = conn.prepareCall(addRole);
                st.setString(1, userSQL);
                st.execute();

                db.closeConnection(conn);

                setVisible(false);
                if (type.equals("Đối tác")) {

                } else if (type.equals("Khách hàng")) {
                    new RegisterScreen().setVisible(true);
                } else if (type.equals("Tài xế")) {
                    new DriverRegister().setVisible(true);
                } else if (type.equals("Nhân viên")) {
                    new StaffRegister().setVisible(true);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Username has been taken");
                Logger.getLogger(MainRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_continueBtnActionPerformed

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
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
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainRegister().setVisible(true);
            }
        });
    }

    DatabaseConnection db = new DatabaseConnection();
    private static String username, password;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginNameLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passwdLabel;
    private javax.swing.JPasswordField password2Field;
    private javax.swing.JLabel password2Label;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
