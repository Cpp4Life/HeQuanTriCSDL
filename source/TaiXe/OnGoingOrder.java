/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hcmus.system;

/**
 *
 * @author asus
 */
public class OnGoingOrder extends javax.swing.JFrame {

    /**
     * Creates new form TaiXeLogin
     */
    public OnGoingOrder() {
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

        orderPanel = new javax.swing.JPanel();
        logoBtn = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        orderBtn = new javax.swing.JButton();
        onGoingBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        onGoingLabel = new javax.swing.JLabel();
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

        historyBtn.setBackground(new java.awt.Color(190, 8, 8));
        historyBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(255, 255, 255));
        historyBtn.setText("History");
        historyBtn.setBorderPainted(false);

        orderTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Delivery Status", "Delivery Description"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        onGoingLabel.setBackground(new java.awt.Color(190, 8, 8));
        onGoingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onGoingLabel.setForeground(new java.awt.Color(255, 255, 255));
        onGoingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onGoingLabel.setText("Orders on Delivery");
        onGoingLabel.setOpaque(true);

        profileBtn.setBackground(new java.awt.Color(190, 8, 8));
        profileBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText("Profile");
        profileBtn.setBorderPainted(false);

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
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(logoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(orderPanelLayout.createSequentialGroup()
                                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(profileBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(helpBtn))
                                    .addGroup(orderPanelLayout.createSequentialGroup()
                                        .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(onGoingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(onGoingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addGroup(orderPanelLayout.createSequentialGroup()
                                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onGoingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(onGoingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnGoingOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoBtn;
    private javax.swing.JButton onGoingBtn;
    private javax.swing.JLabel onGoingLabel;
    private javax.swing.JButton orderBtn;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables
}
