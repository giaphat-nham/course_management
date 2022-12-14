/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.StudentGradeBLL;
import DTO.StudentGradeDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lộc
 */
public class ManageGrade extends javax.swing.JFrame {
    private DefaultTableModel modelGrade = new DefaultTableModel();
    private DefaultTableModel resOfSearch;
    private ArrayList<StudentGradeDTO> listSearch=new ArrayList<StudentGradeDTO>();
    private StudentGradeBLL gradebll=new StudentGradeBLL();
    private boolean isEditing = false;
    private int selectedRow=-1;
    
    /**
     * Creates new form ManageGrade
     */
    public ManageGrade() {
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
        txEnID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txCourseID = new javax.swing.JTextField();
        txStudentID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txGrade = new javax.swing.JTextField();
        btOnline = new javax.swing.JButton();
        btOnsite = new javax.swing.JButton();
        btStudent = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btAll = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        btClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ KẾT QUẢ KHOÁ HỌC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã đăng ký");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã khoá học");

        txCourseID.setEditable(false);

        txStudentID.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Mã học viên");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Điểm");

        btOnline.setText("ONLINE");
        btOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOnlineActionPerformed(evt);
            }
        });

        btOnsite.setText("ONSITE");
        btOnsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOnsiteActionPerformed(evt);
            }
        });

        btStudent.setText("...");
        btStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStudentActionPerformed(evt);
            }
        });

        btAdd.setText("THÊM");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btSearch.setText("TÌM");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btNew.setText("TẠO MỚI");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btDelete.setText("XOÁ");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btAll.setText("TẤT CẢ");
        btAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllActionPerformed(evt);
            }
        });

        btEdit.setText("SỬA");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btSave.setText("LƯU");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setText("HUỶ");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã đăng ký", "Mã khoá học", "Mã học viên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrade);

        btClose.setText("ĐÓNG");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txEnID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txStudentID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btStudent))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txGrade)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOnline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOnsite))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btClose)
                .addGap(295, 295, 295))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txEnID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btOnline)
                        .addComponent(btOnsite)
                        .addComponent(btAdd)
                        .addComponent(btSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEdit)
                        .addComponent(btAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btDelete)
                        .addComponent(btNew)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancel)
                    .addComponent(btSave))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btClose)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btSave.setVisible(false);
        btCancel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void List() throws Exception{
        if(gradebll.getList()==null)
            gradebll.list();
        ArrayList<StudentGradeDTO> list = gradebll.getList();
        Vector header=new Vector();
        header.add("Mã đăng ký");
        header.add("Mã khoá học");
        header.add("Mã sinh viên");
        header.add("Điểm");
        if (modelGrade.getRowCount() == 0) 
                modelGrade = new DefaultTableModel(header, 0);
        for(StudentGradeDTO p: list) {
            Vector row=new Vector();
            row.add(p.getEnrollmentID());
            row.add(p.getCourseID());
            row.add(p.getStudentID());
            row.add(p.getGrade());
            modelGrade.addRow(row);
        }
        tbGrade.setModel(modelGrade);
    }
    
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCloseActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
        if (gradebll.getList().size()>0)
            tbGrade.setModel(modelGrade);
        listSearch.clear();
    }//GEN-LAST:event_btAllActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        if(!isEditing)
            txEnID.setText("");
        txCourseID.setText("");
        txStudentID.setText("");
        txGrade.setText("");
    }//GEN-LAST:event_btNewActionPerformed
    
    private boolean Validate() throws Exception{
        String id, course, student, grade;
        id=txEnID.getText();
        course=txCourseID.getText();
        student=txStudentID.getText();
        grade=txGrade.getText();
        
        if(id.equals("") || course.equals("") || student.equals("") || grade.equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(!id.matches("^\\d+")){
            JOptionPane.showMessageDialog(null, "Mã đăng ký phải ở định dạng số", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(!isEditing)
            for(StudentGradeDTO p: gradebll.getList()){
                if(id.equals(String.valueOf(p.getEnrollmentID()))){
                    JOptionPane.showMessageDialog(null, "Mã đã tồn tại", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
        }
        
        return true;
    }
    
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        try {
            if(!Validate())
                return;
        } catch (Exception ex) {
            System.out.println(ex);
        }

        StudentGradeDTO p=new StudentGradeDTO();
        p.setEnrollmentID(Integer.parseInt(txEnID.getText()));
        p.setCourseID(Integer.parseInt(txCourseID.getText()));
        p.setStudentID(Integer.parseInt(txStudentID.getText()));
        p.setGrade(Float.parseFloat(txGrade.getText()));

        try {
            gradebll.Add(p);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        Vector row=new Vector();
        row.add(p.getEnrollmentID());
        row.add(p.getCourseID());
        row.add(p.getStudentID());
        row.add(p.getGrade());
        
        modelGrade.addRow(row);

        tbGrade.setModel(modelGrade);
    }//GEN-LAST:event_btAddActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int selectedRow = tbGrade.getSelectedRow();
        if(gradebll.getList().size()>0){
            try {
                gradebll.Remove(gradebll.getList().get(selectedRow).getEnrollmentID());
            } catch (Exception ex) {
                System.out.println(ex);
            }
            modelGrade.removeRow(selectedRow);
            tbGrade.setModel(modelGrade);
            this.btNewActionPerformed(evt);
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if(gradebll.getList().isEmpty()){
            return;
        }
        String id, course, student, grade;
        id=txEnID.getText();
        course=txCourseID.getText();
        student=txStudentID.getText();
        grade=txGrade.getText();
        
        try {
            listSearch=gradebll.Search(id, course, student, grade);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        if (listSearch.size()==0){
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            tbGrade.setModel(modelGrade);
        }
        else{
            Vector header = new Vector();
            header.add("Mã đăng ký");
            header.add("Mã khoá học");
            header.add("Mã sinh viên");
            header.add("Điểm");
            resOfSearch = new DefaultTableModel(header, 0);
            for(StudentGradeDTO p: listSearch){
                Vector row=new Vector();
                row.add(p.getEnrollmentID());
                row.add(p.getCourseID());
                row.add(p.getStudentID());
                row.add(p.getGrade());
                resOfSearch.addRow(row);
            }
            tbGrade.setModel(resOfSearch);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        selectedRow=tbGrade.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Chọn kết quả cần chỉnh sửa", "Chú ý!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        isEditing = true;
        txEnID.setEditable(false);
        tbGrade.setEnabled(false);
        btAdd.setEnabled(false);
        btDelete.setEnabled(false);
        btSearch.setEnabled(false);
        btAll.setEnabled(false);
        btSave.setVisible(true);
        btCancel.setVisible(true);
    }//GEN-LAST:event_btEditActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        isEditing = false;
        txEnID.setEditable(true);
        tbGrade.setEnabled(true);
        btAdd.setEnabled(true);
        btDelete.setEnabled(true);
        btSearch.setEnabled(true);
        btAll.setEnabled(true);
        btSave.setVisible(false);
        btCancel.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        try {
            if(!Validate())
                return;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        if(gradebll.getList().size()>0){
            StudentGradeDTO p=new StudentGradeDTO();

            p.setEnrollmentID(Integer.parseInt(txEnID.getText()));
            p.setCourseID(Integer.parseInt(txCourseID.getText()));
            p.setStudentID(Integer.parseInt(txStudentID.getText()));
            p.setGrade(Float.parseFloat(txGrade.getText()));

            try {
                gradebll.Edit(p);
            } catch (Exception ex) {
                System.out.println(ex);
            }

            modelGrade.setValueAt(p.getEnrollmentID(), selectedRow, 0);
            modelGrade.setValueAt(p.getCourseID(), selectedRow, 1);
            modelGrade.setValueAt(p.getStudentID(), selectedRow, 2);
            modelGrade.setValueAt(p.getGrade(), selectedRow, 3);

            tbGrade.setModel(modelGrade);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStudentActionPerformed
        StudentSelector sel=new StudentSelector();
        try {
            sel.List();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        sel.setVisible(true);
    }//GEN-LAST:event_btStudentActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        selectedRow = tbGrade.getSelectedRow();
        if (gradebll.getList().size() > 0) {
            StudentGradeDTO p = new StudentGradeDTO(); 
            if(listSearch.size()>0)
                p = listSearch.get(selectedRow);
            else
                p = gradebll.getList().get(selectedRow);
            
            txEnID.setText(String.valueOf(p.getEnrollmentID()));
            txCourseID.setText(String.valueOf(p.getCourseID()));
            txStudentID.setText(String.valueOf(p.getStudentID()));
            txGrade.setText(String.valueOf(p.getGrade()));
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void btOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOnlineActionPerformed
        OnlineCourseSelector sel=new OnlineCourseSelector();
        try {
            sel.List();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        sel.setVisible(true);
    }//GEN-LAST:event_btOnlineActionPerformed

    private void btOnsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOnsiteActionPerformed
        OnsiteCourseSelector sel=new OnsiteCourseSelector();
        try {
            sel.List();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        sel.setVisible(true);
    }//GEN-LAST:event_btOnsiteActionPerformed
    
    public static void setStudentID(String id){
        txStudentID.setText(id);
    }
    
    public static void setOnlineCourseID(String id){
        txCourseID.setText(id);
    }
    
    public static void setOnsiteCourseID(String id){
        txCourseID.setText(id);
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
            java.util.logging.Logger.getLogger(ManageGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageGrade QLD=new ManageGrade();
                try {
                    QLD.List();          
                } catch (Exception ex) { 
                    System.out.println(ex);
                }
                QLD.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAll;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btOnline;
    private javax.swing.JButton btOnsite;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrade;
    private static javax.swing.JTextField txCourseID;
    private javax.swing.JTextField txEnID;
    private javax.swing.JTextField txGrade;
    private static javax.swing.JTextField txStudentID;
    // End of variables declaration//GEN-END:variables
}
