/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.CourseBLL;
import DTO.OnsiteCourseDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lộc
 */
public class OnsiteCourseSelector extends javax.swing.JFrame {
    private DefaultTableModel modelOnsite = new DefaultTableModel();
    private DefaultTableModel resOfSearch;
    private ArrayList<OnsiteCourseDTO> listSearch=new ArrayList<OnsiteCourseDTO>();
    private CourseBLL coursebll=new CourseBLL();
    
    /**
     * Creates new form DepartmentSelector
     */
    public OnsiteCourseSelector() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btAll = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOnsite = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DANH SÁCH KH ONLINE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tìm kiếm");

        btSearch.setText("TÌM");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btAll.setText("TẤT CẢ");
        btAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllActionPerformed(evt);
            }
        });

        btSelect.setText("CHỌN");
        btSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectActionPerformed(evt);
            }
        });

        btClose.setText("ĐÓNG");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        btNew.setText("TẠO MỚI");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        tbOnsite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã khoá học", "Tên khoá học", "Số tín chỉ", "Khoa", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbOnsite);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btAll, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btNew))
                                    .addComponent(txSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAll, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(btSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void List() throws Exception{
        if(coursebll.getListOnsite()==null)
            coursebll.listOnsite();
        ArrayList<OnsiteCourseDTO> list = coursebll.getListOnsite();
        Vector header=new Vector();
        header.add("Mã khoá học");
        header.add("Tên khoá họv");
        header.add("Số tín chỉ");
        header.add("Khoa");
        header.add("Vị trí");
        header.add("Ngày học");
        header.add("Thời gian học");
        if (modelOnsite.getRowCount() == 0) 
                modelOnsite = new DefaultTableModel(header, 0);
        for(OnsiteCourseDTO p: list) {
            Vector row=new Vector();
            row.add(p.getCourseID());
            row.add(p.getTitle());
            row.add(p.getCredits());
            row.add(p.getDepartmentID());
            row.add(p.getLocation());
            row.add(p.getDays());
            row.add(p.getTime());
            modelOnsite.addRow(row);
        }
        tbOnsite.setModel(modelOnsite);
    }
    
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if(coursebll.getListOnsite().isEmpty()){
            return;
        }
        
        try {
            listSearch=coursebll.SearchOnsiteForSelect(txSearch.getText());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        if (listSearch.size()==0){
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            tbOnsite.setModel(modelOnsite);
        }
        else{
            Vector header = new Vector();
            header.add("Mã khoá học");
            header.add("Tên khoá học");
            header.add("Số tín chỉ");
            header.add("Khoa");
            header.add("Vị trí");
            header.add("Ngày học");
            header.add("Thời gian học");
            resOfSearch = new DefaultTableModel(header, 0);
            for(OnsiteCourseDTO p: listSearch){
                Vector row=new Vector();
                row.add(p.getCourseID());
                row.add(p.getTitle());
                row.add(p.getCredits());
                row.add(p.getDepartmentID());
                row.add(p.getLocation());
                row.add(p.getDays());
                row.add(p.getTime());
                resOfSearch.addRow(row);
            }
            tbOnsite.setModel(resOfSearch);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
        if (coursebll.getListOnline().size()>0)
            tbOnsite.setModel(modelOnsite);
        listSearch.clear();
    }//GEN-LAST:event_btAllActionPerformed

    private void btSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectActionPerformed
        int i=tbOnsite.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(null, "Chưa chọn học viên", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }   
        try{
            ManageGrade.setOnsiteCourseID(String.valueOf(coursebll.getListOnsite().get(i).getCourseID()));
        }
        catch (Exception ex){
            ManageInstructor.setOnsiteCourseID(String.valueOf(coursebll.getListOnsite().get(i).getCourseID()));
        }
        this.dispose();
    }//GEN-LAST:event_btSelectActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        txSearch.setText("");
    }//GEN-LAST:event_btNewActionPerformed

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
            java.util.logging.Logger.getLogger(OnsiteCourseSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OnsiteCourseSelector DepSel=new OnsiteCourseSelector();
                try {
                    DepSel.List();          
                } catch (Exception ex) { 
                    System.out.println(ex);
                }
                DepSel.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAll;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbOnsite;
    private javax.swing.JTextField txSearch;
    // End of variables declaration//GEN-END:variables
}
