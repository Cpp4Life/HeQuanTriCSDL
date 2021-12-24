/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hcmus.system.TaiXe;

import hcmus.system.MainPage.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form TaiXeLogin
     */
    public Order() {
        initComponents();
        showOrders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderPanel = new javax.swing.JPanel();
        logoBtn = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        orderBtn = new javax.swing.JButton();
        onGoingBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        detailPanel = new javax.swing.JPanel();
        shipFeeLabel = new javax.swing.JLabel();
        shipFee = new javax.swing.JTextField();
        qtyLabel = new javax.swing.JLabel();
        qtyField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        acceptBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products Management System");
        setResizable(false);

        orderPanel.setBackground(new java.awt.Color(255, 222, 105));

        logoBtn.setBackground(new java.awt.Color(255, 222, 105));
        logoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hcmus/system/images/logo.png"))); // NOI18N
        logoBtn.setBorderPainted(false);
        logoBtn.setContentAreaFilled(false);

        dateField.setEditable(false);
        dateField.setBackground(new java.awt.Color(255, 255, 255));
        dateField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateField.setText("Date: ");

        orderBtn.setBackground(new java.awt.Color(190, 8, 8));
        orderBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("Orders");
        orderBtn.setBorderPainted(false);

        onGoingBtn.setBackground(new java.awt.Color(190, 8, 8));
        onGoingBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onGoingBtn.setForeground(new java.awt.Color(255, 255, 255));
        onGoingBtn.setText("On-Going");
        onGoingBtn.setBorderPainted(false);
        onGoingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGoingBtnActionPerformed(evt);
            }
        });

        historyBtn.setBackground(new java.awt.Color(190, 8, 8));
        historyBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(255, 255, 255));
        historyBtn.setText("History");
        historyBtn.setBorderPainted(false);

        orderTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product ID", "Delivery Status", "Delivery Address", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        detailPanel.setBackground(new java.awt.Color(255, 255, 255));

        shipFeeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shipFeeLabel.setText("Ship Fee");

        shipFee.setEditable(false);
        shipFee.setBackground(new java.awt.Color(255, 255, 255));
        shipFee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shipFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        shipFee.setText("25.000đ");

        qtyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qtyLabel.setText("Quantity");

        qtyField.setEditable(false);
        qtyField.setBackground(new java.awt.Color(255, 255, 255));
        qtyField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qtyField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setText("Total");

        totalField.setEditable(false);
        totalField.setBackground(new java.awt.Color(255, 255, 255));
        totalField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        acceptBtn.setBackground(new java.awt.Color(190, 8, 8));
        acceptBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setText("ACCEPT");
        acceptBtn.setBorderPainted(false);

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptBtn)
                .addGap(60, 60, 60))
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(shipFeeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shipFee, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(qtyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipFeeLabel)
                    .addComponent(shipFee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel))
                .addGap(27, 27, 27)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(acceptBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        profileBtn.setBackground(new java.awt.Color(190, 8, 8));
        profileBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText("Profile");
        profileBtn.setBorderPainted(false);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        helpBtn.setBackground(new java.awt.Color(190, 8, 8));
        helpBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        helpBtn.setForeground(new java.awt.Color(255, 255, 255));
        helpBtn.setText("Help");
        helpBtn.setBorderPainted(false);

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(logoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(onGoingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(profileBtn)
                                .addGap(30, 30, 30)
                                .addComponent(helpBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(helpBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(profileBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onGoingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DriverProfile().setVisible(true);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
            int selectedIndexRow = orderTable.getSelectedRow();
            String orderId = tableModel.getValueAt(selectedIndexRow, 0).toString();
            System.out.println("orderId");

            Connection adminConn = db.getAdminConnection();
            String selectDonHang = "SELECT * FROM DONHANG WHERE MADH='" + orderId + "'";

            PreparedStatement stmt = adminConn.prepareStatement(selectDonHang);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int qty = rs.getInt("SOLUONG");
                double total = rs.getDouble("TONGTIEN");

                qtyField.setText(String.valueOf(qty));
                totalField.setText(String.valueOf(total));
            }

            db.closeConnection(adminConn);
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderTableMouseClicked

    private void onGoingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGoingBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new OnGoingOrder().setVisible(true);
    }//GEN-LAST:event_onGoingBtnActionPerformed

    private void showOrders() {
        Connection adminConn = db.getAdminConnection();
        String selectDonHang = "SELECT * FROM DONHANG";

        try {
            DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();

            PreparedStatement stmt = adminConn.prepareStatement(selectDonHang);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String orderId = rs.getString("MADH");
                String productId = rs.getString("MASP");
                String deliveryAddr = rs.getString("DIACHIGIAOHANG");
                double price = rs.getDouble("DONGIA");
                int deliveryStatus = rs.getInt("TINHTRANG");

                Object[] data = {orderId, productId, deliveryStatus, deliveryAddr, price};
                tableModel.addRow(data);
            }

            db.closeConnection(adminConn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(DriverRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    private DatabaseConnection db = new DatabaseConnection();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JTextField dateField;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoBtn;
    private javax.swing.JButton onGoingBtn;
    private javax.swing.JButton orderBtn;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton profileBtn;
    private javax.swing.JTextField qtyField;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField shipFee;
    private javax.swing.JLabel shipFeeLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
