
package GUI;

import BLL.LoaiHangBLL;
import DTO.LoaiHangDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Frm_QLLoaiHang extends javax.swing.JFrame {

    public String id;
    public Frm_QLLoaiHang() {
        initComponents();
        addControl();
        loadAll();
    }
    private void addControl(){
        pn2.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);        
        btn7.setBackground(Color.PINK); 
        lbl_LH.requestFocus();
        
        tf2.setText("Nhập mã loại");
        tf1.setText("Nhập tên loại");
        tf3.setText("Nhập dữ liệu cần tìm");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
        tf3.setForeground(Color.DARK_GRAY);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn2 = new javax.swing.JPanel();
        lbl_LH = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        lblMaL = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();

        lbl_LH.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_LH.setText("QUẢN LÝ LOẠI HÀNG");

        lbl1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl1.setText("Tên Loại:");

        lbl2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl2.setText("Mã Loại:");

        tf1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        tf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf1MouseClicked(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn1.setText("THÊM");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn2.setText("SỬA");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn3.setText("XÓA");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn4.setText("XEM TẤT CẢ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn7.setText("TÌM KIẾM");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        tf3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf3FocusLost(evt);
            }
        });
        tf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf3MouseClicked(evt);
            }
        });
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
        });

        tbl2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ LOẠI", "TÊN LOẠI"
            }
        ));
        tbl2.setRowHeight(30);
        tbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl2);

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        tf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf2MouseClicked(evt);
            }
        });
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf2KeyPressed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã loại", "Tên loại" }));

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pn2Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(lblMaL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pn2Layout.createSequentialGroup()
                                    .addGap(179, 179, 179)
                                    .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btn1))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_LH, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaL)
                    .addComponent(lbl_LH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        LoaiHangDTO loaiDTO=new LoaiHangDTO();
        LoaiHangBLL loaiBLL=new LoaiHangBLL();        
        if(tf2.getText().equals("Nhập mã loại")||tf1.getText().equals("Nhập tên loại"))
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!","Thông báo",0);
        else{          
            String patternMaHH = "^[a-zA-Z0-9]+$";
            if (tf2.getText().matches(patternMaHH) == false)
                JOptionPane.showMessageDialog(null, "Mã hàng không được chứa ký tự đặc biệt!", "Thông báo", 0);
            else {
                loaiDTO.setTEN_LOAI(tf1.getText());
                loaiDTO.setMA_LOAI(tf2.getText());
                if (loaiBLL.insertl_hang(loaiDTO) != 0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Thêm Loại hàng mới thành công!", "Thông báo", 1);
                    tf2.setText("");
                    tf1.setText("");
                } else
                    JOptionPane.showMessageDialog(null, "Thêm Loại hàng mới thất bại!", "Thông báo", 0);
            }         
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        LoaiHangDTO loaiDTO=new LoaiHangDTO();
        LoaiHangBLL loaiBLL=new LoaiHangBLL();        
        if(tf1.getText().equals("Nhập mã loại")||tf2.getText().equals("Nhập tên loại")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!","Thông báo",0);
        }
        else{
            String patternMaHH = "^[a-zA-Z0-9]+$";
            if (tf2.getText().matches(patternMaHH) == false)
                JOptionPane.showMessageDialog(null, "Mã hàng không được chứa ký tự đặc biệt!", "Thông báo", 0);
            else {
                loaiDTO.setTEN_LOAI(tf1.getText());
                loaiDTO.setMA_LOAI(tf2.getText());
                if (loaiBLL.updatel_hang(loaiDTO, id) != 0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Sửa Loại hàng thành công!", "Thông báo", 1);
                    tf2.setText("");
                    tf1.setText("");
                } else
                    JOptionPane.showMessageDialog(null, "Sửa Loại hàng thất bại!", "Thông báo", 0);
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        LoaiHangDTO loaiDTO=new LoaiHangDTO();
        loaiDTO.setMA_LOAI(tf2.getText());
        if(tf2.getText().equals("Nhập mã loại")) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã loại hàng!","Thông báo",0);
        else{
            LoaiHangBLL loaiBLL=new LoaiHangBLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (loaiBLL.deletetl_hang(loaiDTO)!=0) {
                    loadAll();                
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    tf2.setText("");
                    tf1.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã loại hàng này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn4ActionPerformed

    private void tbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl2MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tbl2.getSelectedRow();
                
        if(tbl2.getModel().getValueAt(selectedIndex,0)!=null&&tbl2.getModel().getValueAt(selectedIndex,1)!=null&&tbl2.getModel().getValueAt(selectedIndex,2)!=null){        
            tf2.setText(tbl2.getModel().getValueAt(selectedIndex,1).toString());
            tf2.setForeground(Color.BLACK);
            id=tbl2.getModel().getValueAt(selectedIndex,1).toString();
            tf1.setText(tbl2.getModel().getValueAt(selectedIndex,2).toString()); 
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tbl2MouseClicked

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        LoaiHangDTO loaiDTO=new LoaiHangDTO();
        if(cb1.getSelectedIndex()==0){
            if(tf3.getText().equals("Nhập dữ liệu cần tìm"))
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã loại hàng cần tìm!","Thông báo",0);
            else{
                String patternMaHH = "^[a-zA-Z0-9]+$";
                if (tf3.getText().matches(patternMaHH) == false)
                    JOptionPane.showMessageDialog(null, "Mã loại hàng không được chứa ký tự đặc biệt!", "Thông báo", 0);
                else{
                    loaiDTO.setMA_LOAI(tf3.getText());
                    getLoaiMa(loaiDTO);
                }    
            }   
        }
        else{
            loaiDTO.setMA_LOAI(tf3.getText());
            if(tf3.getText().equals("Nhập dữ liệu cần tìm"))
                JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Tên loại hàng cần tìm!","Thông báo",0);
            else
                getLoaiTen(loaiDTO);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn7.doClick();
        }
    }//GEN-LAST:event_tf3KeyPressed

    private void tf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf1.requestFocus();
        }
    }//GEN-LAST:event_tf2KeyPressed

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập mã loại")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2MouseClicked

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập tên loại")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseClicked
        // TODO add your handling code here:
        if(tf3.getText().equals("Nhập dữ liệu cần tìm")){
            tf3.setText("");
            tf3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf3MouseClicked

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập mã loại");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập tên loại");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusLost
        // TODO add your handling code here:
        if(tf3.getText().equals("")){
            tf3.setText("Nhập dữ liệu cần tìm");
            tf3.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf3FocusLost

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập tên loại")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1FocusGained

    public void loadAll() {
	String[] header = { "STT","MÃ LOẠI HÀNG","TÊN LOẠI HÀNG"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<LoaiHangDTO> arr = new ArrayList<LoaiHangDTO>();
	 LoaiHangBLL loaiBLL = new LoaiHangBLL();
	 arr = loaiBLL.getAllL_Hang();
	 LoaiHangDTO loaiDTO = new LoaiHangDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 loaiDTO = arr.get(i);		 
		 String id = loaiDTO.getMA_LOAI();
		 String name = loaiDTO.getTEN_LOAI();	
                 
		  Object[] row = { i+1,id, name};
		 dtm.addRow(row);
	 }
	 tbl2.setModel(dtm);
    }
    
    public void getLoaiMa(LoaiHangDTO loaiDTO) {
	String[] header = { "STT","MÃ LOẠI HÀNG","TÊN LOẠI HÀNG"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<LoaiHangDTO> arr = new ArrayList<LoaiHangDTO>();
	 LoaiHangBLL loaiBLL = new LoaiHangBLL();
	 arr = loaiBLL.searchL_HangMa(loaiDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 loaiDTO = arr.get(i);		 
		 String id = loaiDTO.getMA_LOAI();
		 String name = loaiDTO.getTEN_LOAI();	
                 
		  Object[] row = { i+1,id, name};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Loại hàng này không tồn tại.","Thông báo",0);
	 tbl2.setModel(dtm);
    }
    public void getLoaiTen(LoaiHangDTO loaiDTO) {
	String[] header = { "STT","MÃ LOẠI HÀNG","TÊN LOẠI HÀNG"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<LoaiHangDTO> arr = new ArrayList<LoaiHangDTO>();
	 LoaiHangBLL loaiBLL = new LoaiHangBLL();
	 arr = loaiBLL.searchL_HangTen(loaiDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 loaiDTO = arr.get(i);		 
		 String id = loaiDTO.getMA_LOAI();
		 String name = loaiDTO.getTEN_LOAI();	
                 
		  Object[] row = { i+1,id, name};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Loại hàng này không tồn tại.","Thông báo",0);
	 tbl2.setModel(dtm);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblMaL;
    private javax.swing.JLabel lbl_LH;
    private javax.swing.JPanel pn2;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
