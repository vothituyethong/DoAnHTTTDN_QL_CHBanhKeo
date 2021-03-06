
package GUI;

import BLL.QuyenBLL;
import DTO.QuyenDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Frm_QLQuyen extends javax.swing.JFrame {

    
    public String id;
    public Frm_QLQuyen() {
        initComponents();
        addControl();
        loadAll();
    }
    
    private void addControl(){

        panelpq.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);        
        btn5.setBackground(Color.PINK);
        btn6.setBackground(Color.PINK);
        pq1.requestFocus();
        
        tf1.setText("Nhập mã quyền");
        tf2.setText("Nhập tên quyền");
        tf5.setText("Nhập dữ liệu cần tìm");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
        tf5.setForeground(Color.DARK_GRAY);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelpq = new javax.swing.JPanel();
        pq1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        btn6 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();

        pq1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pq1.setText(" QUẢN LÝ QUYỀN TRUY CẬP");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mã Quyền:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tên Quyền:");

        btn5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn5.setText("TÌM KIẾM");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn3.setText("XÓA");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn2.setText("SỬA");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn1.setText("THÊM");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        tf1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        tf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf1MouseClicked(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        tf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf2MouseClicked(evt);
            }
        });

        tf5.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tf5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf5FocusLost(evt);
            }
        });
        tf5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf5MouseClicked(evt);
            }
        });
        tf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf5KeyPressed(evt);
            }
        });

        tb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã quyền", "Tên quyền"
            }
        ));
        tb1.setRowHeight(30);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        btn6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn6.setText("XEM TẤT CẢ");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã quyền", "Tên quyền" }));

        javax.swing.GroupLayout panelpqLayout = new javax.swing.GroupLayout(panelpq);
        panelpq.setLayout(panelpqLayout);
        panelpqLayout.setHorizontalGroup(
            panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpqLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpqLayout.createSequentialGroup()
                        .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn5)
                            .addGroup(panelpqLayout.createSequentialGroup()
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelpqLayout.createSequentialGroup()
                                .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelpqLayout.createSequentialGroup()
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpqLayout.createSequentialGroup()
                        .addComponent(pq1)
                        .addGap(372, 372, 372))))
        );
        panelpqLayout.setVerticalGroup(
            panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpqLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pq1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelpqLayout.createSequentialGroup()
                        .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(panelpqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        QuyenDTO roleDTO=new QuyenDTO();
        roleDTO.setMA_QUYEN(tf1.getText());
        roleDTO.setTEN_QUYEN(tf2.getText());
        if (tf1.getText().equals("Nhập mã quyền") || tf2.getText().equals("Nhập tên quyền"))
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", 0);
        else {
            String patternMaHH = "^[a-zA-Z0-9]+$";
            if (tf1.getText().matches(patternMaHH) == false) {
                JOptionPane.showMessageDialog(null, "Mã quyền không được chứa ký tự đặc biệt!", "Thông báo", 0);
            } else {
                QuyenBLL roleBLL = new QuyenBLL();
                if (roleBLL.insertQuyen(roleDTO) != 0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Thêm quyền truy cập thành công!", "Thông báo", 1);
                } else
                    JOptionPane.showMessageDialog(null, "Thêm quyền truy cập thất bại!", "Thông báo", 0);
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        QuyenDTO roleDTO=new QuyenDTO();
        roleDTO.setMA_QUYEN(tf1.getText());
        if(tf1.getText().equals("Nhập mã quyền")) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã quyền!","Thông báo",0);
        else{
            QuyenBLL roleBLL=new QuyenBLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (roleBLL.deletetQuyen(roleDTO)!=0) {
                    loadAll();                
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã quyền này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn6ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tb1.getSelectedRow();
                
        if(tb1.getModel().getValueAt(selectedIndex,0)!=null&&tb1.getModel().getValueAt(selectedIndex,1)!=null&&tb1.getModel().getValueAt(selectedIndex,2)!=null){        
        tf1.setText(tb1.getModel().getValueAt(selectedIndex,1).toString());
        tf1.setForeground(Color.BLACK);
        id=tb1.getModel().getValueAt(selectedIndex,1).toString();
        tf2.setText(tb1.getModel().getValueAt(selectedIndex,2).toString());
        tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tb1MouseClicked

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        QuyenDTO roleDTO = new QuyenDTO();
        roleDTO.setMA_QUYEN(tf1.getText());
        roleDTO.setTEN_QUYEN(tf2.getText());
        if (tf1.getText().equals("Nhập mã quyền") || tf2.getText().equals("Nhập tên quyền"))
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", 0);
        else {
            String patternMaHH = "^[a-zA-Z0-9]+$";
            if (tf1.getText().matches(patternMaHH) == false) 
                JOptionPane.showMessageDialog(null, "Mã quyền không được chứa ký tự đặc biệt!", "Thông báo", 0);
            else {
                QuyenBLL roleBLL = new QuyenBLL();
                if (roleBLL.updateQuyen(roleDTO, id) != 0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Sửa quyền truy cập thành công!", "Thông báo", 1);
                    tf1.setText("");
                    tf2.setText("");
                } else
                    JOptionPane.showMessageDialog(null, "Sửa quyền truy cập thất bại!", "Thông báo", 0);
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        QuyenDTO roleDTO=new QuyenDTO();
        if(cb1.getSelectedIndex()==0){
            if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã quyền cần tìm!","Thông báo",0);
            }
            else{
                String patternMaHH = "^[a-zA-Z0-9]+$";
                if (tf5.getText().matches(patternMaHH) == false)
                    JOptionPane.showMessageDialog(null, "Mã quyền không được chứa ký tự đặc biệt!", "Thông báo", 0);
                else{
                     roleDTO.setMA_QUYEN(tf5.getText());
                     getQuyenMa(roleDTO);
                }
            }         
        }
        else{
             roleDTO.setTEN_QUYEN(tf5.getText());
            if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã quyền cần tìm!","Thông báo",0);
            }
            else       
                getQuyenTen(roleDTO);
        }
       
    }//GEN-LAST:event_btn5ActionPerformed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn5.doClick();
        }
    }//GEN-LAST:event_tf5KeyPressed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf2.requestFocus();
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập mã quyền")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên quyền")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        // TODO add your handling code here:
        if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
            tf5.setText("");
            tf5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf5MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập mã quyền");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập tên quyền");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    private void tf5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusLost
        // TODO add your handling code here:
        if(tf5.getText().equals("")){
            tf5.setText("Nhập dữ liệu cần tìm");
            tf5.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf5FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên quyền")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2FocusGained

    public void loadAll() {
	String[] header = { "STT","Mã quyền","Tên quyền"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<QuyenDTO> arr = new ArrayList<QuyenDTO>();
	 QuyenBLL roleBLL = new QuyenBLL();
	 arr = roleBLL.getAllQuyen();
	 QuyenDTO roleDTO = new QuyenDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 roleDTO = arr.get(i);		 
		 String id = roleDTO.getMA_QUYEN();
		 String name = roleDTO.getTEN_QUYEN();	
                 
		  Object[] row = { i+1,id, name};
		 dtm.addRow(row);
	 }
	 tb1.setModel(dtm);
    }
    
    public void getQuyenMa(QuyenDTO roleDTO) {
	String[] header = { "STT","Mã quyền","Tên quyền"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<QuyenDTO> arr = new ArrayList<QuyenDTO>();
	 QuyenBLL roleBLL = new QuyenBLL();
	 arr = roleBLL.searchQuyenMa(roleDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 roleDTO = arr.get(i);		 
		 String id = roleDTO.getMA_QUYEN();
		 String name = roleDTO.getTEN_QUYEN();	
                 
		  Object[] row = {i+1,id, name};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Quyền truy cập này không tồn tại.","Thông báo",0);
	 tb1.setModel(dtm);
    }
    
    public void getQuyenTen(QuyenDTO roleDTO) {
	String[] header = { "STT","Mã quyền","Tên quyền"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<QuyenDTO> arr = new ArrayList<QuyenDTO>();
	 QuyenBLL roleBLL = new QuyenBLL();
	 arr = roleBLL.searchQuyenTen(roleDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 roleDTO = arr.get(i);		 
		 String id = roleDTO.getMA_QUYEN();
		 String name = roleDTO.getTEN_QUYEN();	
                 
		  Object[] row = {i+1,id, name};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Quyền truy cập này không tồn tại.","Thông báo",0);
	 tb1.setModel(dtm);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelpq;
    private javax.swing.JLabel pq1;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
