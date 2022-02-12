import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 *
 * @author docho
 */
public class main extends javax.swing.JFrame {
            private static final String username = "root";
            private static final String password = "";
            private static final String dataConn = "jdbc:mysql://localhost:3306/student";
            
            Connection sqlConn = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
            int q, i, id, deleteItem;

    public main() {
        initComponents();
    }
    
    //function begin
    public void upDateDB(){
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("select * from mycontact");
                
                rs = pst.executeQuery();
                ResultSetMetaData stData = rs.getMetaData();
                
                q = stData.getColumnCount();
                
                DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                RecordTable.setRowCount(0);
                
                while (rs.next()) {
                        Vector columnData = new Vector();
                        
                        for (i = 1; i <= q; i++) {
                            columnData.add(rs.getString("id"));
                            columnData.add(rs.getString("stdSBD"));
                            columnData.add(rs.getString("stdName"));
                            columnData.add(rs.getString("stdPhone"));
                            columnData.add(rs.getString("stdAge"));
                            columnData.add(rs.getString("stdAddress"));
                            columnData.add(rs.getString("stdExamsSubject"));
                        }
                        RecordTable.addRow(columnData);
                }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    //function end

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbtnThemMoi = new javax.swing.JButton();
        jbtnDangXuat = new javax.swing.JButton();
        jbtnXoa = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnXuat = new javax.swing.JButton();
        jbtnCapNhat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtSBD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtHoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtSoDienThoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtNamSinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtKhoiThi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnThemMoi.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnThemMoi.setText("Thêm mới");
        jbtnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemMoiActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnThemMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 30));

        jbtnDangXuat.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnDangXuat.setText("Đăng xuất");
        jbtnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDangXuatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, 30));

        jbtnXoa.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 30));

        jbtnReset.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));

        jbtnXuat.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnXuat.setText("Xuất");
        jbtnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXuatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 30));

        jbtnCapNhat.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jbtnCapNhat.setText("Cập nhật");
        jbtnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCapNhatActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/function.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel8)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 210, 400));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 210, 380));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("SBD:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 20));
        jPanel4.add(jtxtSBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 370, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setText("Họ Tên:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 90, 20));
        jPanel4.add(jtxtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Số điện thoại:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, 20));
        jPanel4.add(jtxtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 370, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setText("Năm sinh:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, 20));
        jPanel4.add(jtxtNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 370, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("Địa chỉ:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, 20));
        jPanel4.add(jtxtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 370, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setText("Khối thi:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, 20));
        jPanel4.add(jtxtKhoiThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 370, -1));

        jTable1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SBD", "Họ tên", "Số điện thoại", "Năm sinh", "Địa chỉ", "Khối thi"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 580, 160));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel9.setText("ID:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 20));
        jPanel4.add(jtxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 370, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 600, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/education.png"))); // NOI18N
        jLabel1.setText("QUẢN LÍ THI TỐT NGHIỆP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //đăng xuất
    private JFrame frame;
    private void jbtnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDangXuatActionPerformed
            frame = new JFrame("Đăng xuất");
            if (JOptionPane.showConfirmDialog(frame, "Co chac muon dang xuat khong?", "Canh bao",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
            }
    }//GEN-LAST:event_jbtnDangXuatActionPerformed
    
    //reset
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
            jtxtID.setText("");
            jtxtSBD.setText("");
            jtxtHoTen.setText("");
            jtxtSoDienThoai.setText("");
            jtxtNamSinh.setText("");
            jtxtDiaChi.setText("");
            jtxtKhoiThi.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed
    
    //thêm mới
    private void jbtnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemMoiActionPerformed
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("insert into mycontact(id,stdSBD, stdName, stdPhone, stdAge, stdAddress, stdExamsSubject)value(?,?,?,?,?,?,?)");
                
                pst.setString(1, jtxtID.getText());
                pst.setString(2, jtxtSBD.getText());
                pst.setString(3, jtxtHoTen.getText());
                pst.setString(4, jtxtSoDienThoai.getText());
                pst.setString(5, jtxtNamSinh.getText());
                pst.setString(6, jtxtDiaChi.getText());
                pst.setString(7, jtxtKhoiThi.getText());
                                
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Da them vao!");
                upDateDB();
    }//GEN-LAST:event_jbtnThemMoiActionPerformed

          catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private void jbtnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCapNhatActionPerformed
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("update mycontact set stdSBD =?, stdName =?, stdPhone =?, stdAge =?, stdAddress =?, stdExamsSubject =? where id =?");
                
                pst.setString(1, jtxtID.getText());
                pst.setString(2, jtxtSBD.getText());
                pst.setString(3, jtxtHoTen.getText());
                pst.setString(4, jtxtSoDienThoai.getText());
                pst.setString(5, jtxtNamSinh.getText());
                pst.setString(6, jtxtDiaChi.getText());
                pst.setString(7, jtxtKhoiThi.getText());             
                
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Da cap nhat!");
                upDateDB();
    }                                           

          catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCapNhatActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            int SelectedRows = jTable1.getSelectedRow();
            
            jtxtID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
            jtxtSBD.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
            jtxtHoTen.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
            jtxtSoDienThoai.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
            jtxtNamSinh.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
            jtxtDiaChi.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
            jtxtKhoiThi.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXuatActionPerformed
        MessageFormat header  = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch (java.awt.print.PrinterException e) {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnXuatActionPerformed

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null, "Chap nhan neu muon xoa item", "Canh bao!", JOptionPane.YES_NO_OPTION);
            
            if (deleteItem == JOptionPane.YES_OPTION) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                    pst = sqlConn.prepareStatement("delete from mycontact where id =?");
                    
                    pst.setInt(1, id);
                    pst.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "Da cap nhat!");
                    upDateDB();
                    
                    jtxtID.setText("");
                    jtxtSBD.setText("");
                    jtxtSBD.requestFocus();
                    jtxtHoTen.setText("");
                    jtxtSoDienThoai.setText("");
                    jtxtNamSinh.setText("");
                    jtxtDiaChi.setText("");
                    jtxtKhoiThi.setText("");
                    
            }
        }
        catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(Java_MysqlConn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jbtnXoaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new main().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnCapNhat;
    private javax.swing.JButton jbtnDangXuat;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnThemMoi;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JButton jbtnXuat;
    private javax.swing.JTextField jtxtDiaChi;
    private javax.swing.JTextField jtxtHoTen;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtKhoiThi;
    private javax.swing.JTextField jtxtNamSinh;
    private javax.swing.JTextField jtxtSBD;
    private javax.swing.JTextField jtxtSoDienThoai;
    // End of variables declaration//GEN-END:variables
}
