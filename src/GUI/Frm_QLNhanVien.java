
package GUI;
import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Frm_QLNhanVien extends javax.swing.JFrame {
    public String id;
    public Frm_QLNhanVien() {
        initComponents();
        addControl();
        loadAll();
    }
    private void addControl(){
    
        pn3.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);   
        btn5.setBackground(Color.PINK);
        btnExp.setBackground(Color.PINK);   
        btnImp.setBackground(Color.PINK);
        
        tf1.setText("Nhập mã n.viên");
        tf2.setText("Nhập tên n.viên");
        tf5.setText("Nhập địa chỉ");
        tf6.setText("Nhập sđt");
        tf7.setText("Nhập dữ liệu cần tìm");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
        tf5.setForeground(Color.DARK_GRAY);
        tf6.setForeground(Color.DARK_GRAY);
        tf7.setForeground(Color.DARK_GRAY);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn3 = new javax.swing.JPanel();
        lbl_NV = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        tf7 = new javax.swing.JTextField();
        btn5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        btnExp = new javax.swing.JButton();
        btnImp = new javax.swing.JButton();
        dateNS = new com.toedter.calendar.JDateChooser();

        lbl_NV.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_NV.setText("QUẢN LÝ NHÂN VIÊN");

        lbl1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl1.setText(" Mã Nhân Viên:");

        lbl2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl2.setText(" Tên Nhân Viên:");

        lbl3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl3.setText(" Ngày Sinh:");

        lbl4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl4.setText(" Giới Tính:");

        lbl5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl5.setText(" Địa Chỉ:");

        lbl6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl6.setText(" Số Điện Thoại:");

        tf1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        tf5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        tf6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tf6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf6FocusLost(evt);
            }
        });
        tf6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf6MouseClicked(evt);
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

        tf7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf7MouseClicked(evt);
            }
        });
        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf7KeyPressed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn5.setText("TÌM KIẾM");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        tbl3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "NGÀY SINH", "GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI"
            }
        ));
        tbl3.setRowHeight(30);
        tbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl3);

        buttonGroup1.add(rd1);
        rd1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rd1.setSelected(true);
        rd1.setText("Nam");

        buttonGroup1.add(rd2);
        rd2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rd2.setText("Nữ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText(" Chức vụ:");

        cb4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Chức vụ]", "Quản lý", "Nhân viên kho", "Nhân viên bán hàng" }));

        cb5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Nhân viên", "Tên Nhân viên" }));

        btnExp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExp.setText("XUẤT FILE EXCEL");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnImp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnImp.setText("NHẬP FILE EXCEL");
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });

        dateNS.setDateFormatString("yyyy - MM - dd");
        dateNS.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn3Layout.createSequentialGroup()
                                                .addComponent(rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pn3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(dateNS, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(510, 510, 510)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImp)
                            .addComponent(btnExp))))
                .addGap(35, 35, 35))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_NV)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(dateNS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(tf1.getText().equals("Nhập mã n.viên")||tf2.getText().equals("Nhập tên n.viên")||tf5.getText().equals("Nhập địa chỉ")||tf6.getText().equals("Nhập sđt")) 
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Nhân viên cần thêm mới!","Thông báo",0);
        else{
            nvDTO.setMA_NV(tf1.getText());
            nvDTO.setTEN_NV(tf2.getText());
            Date ngay = new Date(dateNS.getDate().getTime());
                    //Date ngay=Date.valueOf(String.valueOf(year) +"-"+String.valueOf(month)+"-"+String.valueOf(day));                    
                    nvDTO.setNG_SINH(ngay);
                    if(rd1.isSelected()) nvDTO.setG_TINH("Nam");
                    else   nvDTO.setG_TINH("Nữ");
                    nvDTO.setD_CHI(tf5.getText());
                    
                    String pattern="^0\\d{9,10}$";
                    if(tf6.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
                    else{
                        nvDTO.setSDT(tf6.getText());
                        if(cb4.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Chức vụ!","Thông báo",0);
                        else{
                            nvDTO.setCHUC_VU((String)cb4.getSelectedItem());
                            NhanVienBLL nvBLL=new NhanVienBLL();
                            if (nvBLL.insertnvien(nvDTO)!=0) {
                                loadAll();
                                JOptionPane.showMessageDialog(null, "Thêm Nhân viên mới thành công!","Thông báo",1);
                                tf1.setText("");
                                tf2.setText("");
                                dateNS.setDate(null);
                                tf5.setText("");
                                tf6.setText("");
                                cb4.setSelectedIndex(0);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Thêm Nhân viên mới thất bại!","Thông báo",0);
                            }
                        }
                    }                   
                    
                
            
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void tbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl3MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tbl3.getSelectedRow();
                
        if(tbl3.getModel().getValueAt(selectedIndex,0)!=null&&tbl3.getModel().getValueAt(selectedIndex,1)!=null&&tbl3.getModel().getValueAt(selectedIndex,2)!=null&&tbl3.getModel().getValueAt(selectedIndex,3)!=null){        
        tf1.setText(tbl3.getModel().getValueAt(selectedIndex,1).toString());
        id=tbl3.getModel().getValueAt(selectedIndex,1).toString();
        tf2.setText(tbl3.getModel().getValueAt(selectedIndex,2).toString());
        dateNS.setDate(Date.valueOf(tbl3.getModel().getValueAt(selectedIndex,3).toString()));   
        String gtinh=tbl3.getModel().getValueAt(selectedIndex,4).toString();
        if(gtinh.equals("Nam")) rd1.setSelected(true);
        else rd2.setSelected(true);
        tf5.setText(tbl3.getModel().getValueAt(selectedIndex,5).toString());
        tf6.setText(tbl3.getModel().getValueAt(selectedIndex,6).toString());
        String cvu=tbl3.getModel().getValueAt(selectedIndex,7).toString();
        cb4.setSelectedItem(cvu);
        }
    }//GEN-LAST:event_tbl3MouseClicked

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        nvDTO.setMA_NV(tf1.getText());
        if(tf1.getText().equals("Nhập mã n.viên")||tf1.getText()==null) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã Nhân viên cần xóa!","Thông báo",0);
        else{
            NhanVienBLL nvBLL=new NhanVienBLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (nvBLL.deletetnvien(nvDTO)!=0) {
                    loadAll();                
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    dateNS.setDate(null);
                    tf5.setText("");
                    tf6.setText("");
                    cb4.setSelectedIndex(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã Nhân viên này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(tf1.getText().equals("Nhập mã n.viên")||tf2.getText().equals("Nhập tên n.viên")||tf5.getText().equals("Nhập địa chỉ")||tf6.getText().equals("Nhập sđt")) 
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Nhân viên cần sửa!","Thông báo",0);
        else{
            nvDTO.setMA_NV(tf1.getText());
            nvDTO.setTEN_NV(tf2.getText());
            Date ngay = new Date(dateNS.getDate().getTime());                    
                    nvDTO.setNG_SINH(ngay);
                    if(rd1.isSelected()) nvDTO.setG_TINH("Nam");
                    else   nvDTO.setG_TINH("Nữ");
                    nvDTO.setD_CHI(tf5.getText());
                    //test số điện thoại
                    String pattern="^0\\d{9,10}$";
                    if(tf6.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
                    else{
                        nvDTO.setSDT(tf6.getText());
                        if(cb4.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Chức vụ!","Thông báo",0);
                        else{
                            nvDTO.setCHUC_VU((String)cb4.getSelectedItem());
                            NhanVienBLL nvBLL=new NhanVienBLL();
                            if (nvBLL.updatenvien(nvDTO,id)!=0) {
                                loadAll();
                                JOptionPane.showMessageDialog(null, "Sửa Nhân viên thành công!","Thông báo",1);
                                tf1.setText("");
                                tf2.setText("");
                                dateNS.setDate(null);
                                tf5.setText("");
                                tf6.setText("");
                                cb4.setSelectedIndex(0);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Sửa Nhân viên thất bại!","Thông báo",0);
                            }
                        }
                    }           
                    
                
            
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(cb5.getSelectedIndex()==0){
            nvDTO.setMA_NV(tf7.getText());
            if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Nhân viên cần tìm!","Thông báo",0);
            }
            else
                getNvMa(nvDTO);            
        }
        else{
            nvDTO.setTEN_NV(tf7.getText());
            if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên Nhân viên cần tìm!","Thông báo",0);
            }
            else
                getNvTen(nvDTO);
        }
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        NhanVienBLL nvBLL=new NhanVienBLL();
        nvBLL.ExportExcel();
        JOptionPane.showMessageDialog(null,"Xuất file Excel thành công","Thông báo", 1);
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xlsx");
        fc.setFileFilter(filter);
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile(); //Lấy URL
            NhanVienBLL nvBLL=new NhanVienBLL();
            nvBLL.ImportExcel(file);
            loadAll();
            JOptionPane.showMessageDialog(null, "Nhập file excel thành công!");
       }
    }//GEN-LAST:event_btnImpActionPerformed

    private void tf7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf7KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn5.doClick();
        }
    }//GEN-LAST:event_tf7KeyPressed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf2.requestFocus();
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf6.requestFocus();
        }
    }//GEN-LAST:event_tf5KeyPressed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập mã n.viên")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên n.viên")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        // TODO add your handling code here:
        if(tf5.getText().equals("Nhập địa chỉ")){
            tf5.setText("");
            tf5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf5MouseClicked

    private void tf6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf6MouseClicked
        // TODO add your handling code here:
        if(tf6.getText().equals("Nhập sđt")){
            tf6.setText("");
            tf6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf6MouseClicked

    private void tf7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MouseClicked
        // TODO add your handling code here:
        if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
            tf7.setText("");
            tf7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf7MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập mã n.viên");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập tên n.viên");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    private void tf5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusLost
        // TODO add your handling code here:
        if(tf5.getText().equals("")){
            tf5.setText("Nhập địa chỉ");
            tf5.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf5FocusLost

    private void tf6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusLost
        // TODO add your handling code here:
        if(tf6.getText().equals("")){
            tf6.setText("Nhập sđt");
            tf6.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf6FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên n.viên")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2FocusGained

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
        // TODO add your handling code here:
        if(tf6.getText().equals("Nhập sđt")){
            tf6.setText("");
            tf6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf6FocusGained

    /**
     * @param args the command line arguments
     */
    
    public void loadAll() {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.getAllNvien();
	 NhanVienDTO nvDTO = new NhanVienDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                 Date date=nvDTO.getNG_SINH();
                 /*SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
                 String stringDate= DateFor.format(date);*/
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
                 String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
	 tbl3.setModel(dtm);
    }
    
    public void getNvMa(NhanVienDTO nvDTO) {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.searchNvienMa(nvDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                Date date=nvDTO.getNG_SINH();
                 /*SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
                 String stringDate= DateFor.format(date);*/
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
                 String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhân viên này không tồn tại.","Thông báo",0);
	 tbl3.setModel(dtm);
    }
    public void getNvTen(NhanVienDTO nvDTO) {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.searchNvienTen(nvDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                 Date date=nvDTO.getNG_SINH();
                 /*SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
                 String stringDate= DateFor.format(date);*/
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
                 String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhân viên này không tồn tại.","Thông báo",0);
	 tbl3.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnImp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private com.toedter.calendar.JDateChooser dateNS;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl_NV;
    private javax.swing.JPanel pn3;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
