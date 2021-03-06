
package GUI;

import BLL.ChiTietPN_BLL;
import BLL.HangHoaBLL;
import BLL.NCC_BLL;
import BLL.NhanVienBLL;
import BLL.PNhapBLL;
import DTO.ChiTietPN_DTO;
import DTO.HangHoaDTO;
import DTO.NCC_DTO;
import DTO.NhanVienDTO;
import DTO.PNhapDTO;
import java.awt.*;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Frm_LapPN extends javax.swing.JFrame {

    
    String[] header = { "STT","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","SỐ LƯỢNG","THÀNH TIỀN"};
    DefaultTableModel dtm = new DefaultTableModel(header, 0); 
    int stt=0;
    int tongTien=0;
    public Frm_LapPN() {
        initComponents();
        addControl();
        addComboBoxNCC();        
        setMaPN();
        addComboBoxMaPN();
        //tfDate.setText(String.valueOf(java.time.LocalDate.now()));
        datePN.setDate(Date.valueOf(java.time.LocalDate.now()));
    }
    
    private void addControl(){
        
        panel.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        btnadd.setBackground(Color.PINK);        
        btn.setBackground(Color.PINK); 
        btnReport.setBackground(Color.PINK);
        tf1.setText("Nhập Mã hàng");
        tf2.setText("Nhập số lượng");
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
    }
        
    public void addComboBoxNCC(){
        ArrayList<NCC_DTO> arr = new ArrayList<NCC_DTO>();
	 NCC_BLL nccBLL = new NCC_BLL();
	 arr = nccBLL.getAllNCC();	 
	 NCC_DTO accDTO = new NCC_DTO();
	 for (int i = 0; i < arr.size(); i++) {
		 accDTO = arr.get(i);
		 cb1.addItem(accDTO.getMA_NCC()+"-"+accDTO.getTEN_NCC());		 
	 }
    }   
        
    private void setMaPN(){
        PNhapBLL pnBLL=new PNhapBLL();
        lblMAPN.setText(pnBLL.getMaPN());
    }
    
    private void addComboBoxMaPN(){
        ArrayList<PNhapDTO> arr = new ArrayList<PNhapDTO>();
	 PNhapBLL pnBLL = new PNhapBLL();
	 arr = pnBLL.getAllPN();	 
	 PNhapDTO pnDTO = new PNhapDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 pnDTO = arr.get(i);
		 cbMaPN.addItem(pnDTO.getMA_PN());		 
	 }
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lblmaphieu = new javax.swing.JLabel();
        lblmanhacc = new javax.swing.JLabel();
        lblngaylap = new javax.swing.JLabel();
        lblmanv = new javax.swing.JLabel();
        lbltongtien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpnhap = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        lblMAPN = new javax.swing.JLabel();
        cbMaPN = new javax.swing.JComboBox<>();
        lblManv = new javax.swing.JLabel();
        lTien = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        btnadd2 = new javax.swing.JButton();
        datePN = new com.toedter.calendar.JDateChooser();

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl1.setText(" LẬP PHIẾU NHẬP");

        lblmaphieu.setBackground(new java.awt.Color(255, 255, 255));
        lblmaphieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblmaphieu.setText("MÃ PHIẾU:");

        lblmanhacc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblmanhacc.setText("           NHÀ CUNG CẤP:");

        lblngaylap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblngaylap.setText("NGÀY NHẬP:");

        lblmanv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblmanv.setText("           MÃ NHÂN VIÊN:");

        lbltongtien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbltongtien.setText("           TỔNG TIỀN:");

        tbpnhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbpnhap.setModel(new javax.swing.table.DefaultTableModel(
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
                "STT", "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        tbpnhap.setGridColor(new java.awt.Color(204, 204, 204));
        tbpnhap.setRowHeight(30);
        tbpnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpnhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpnhap);

        btnadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnadd.setText("LƯU");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("          MÃ PHIẾU: ");

        cb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Nhà Cung cấp]" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        lblMAPN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        cbMaPN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbMaPN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Mã phiếu]" }));
        cbMaPN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaPNItemStateChanged(evt);
            }
        });

        lblManv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblManv.setText("....");

        lTien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lTien.setText("0");

        btnReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReport.setText("IN PHIẾU");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CHỌN HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn.setText("THÊM");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("    SỐ LƯỢNG:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("     MÃ HÀNG:");

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

        btnadd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd2.setText("+");
        btnadd2.setPreferredSize(new java.awt.Dimension(51, 30));
        btnadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        datePN.setDateFormatString("yyyy - MM - dd");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmaphieu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lblngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datePN, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblMAPN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblManv, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblmanhacc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(857, 857, 857))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmaphieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMAPN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmanhacc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblManv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(datePN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        NCC_DTO nccDTO=new NCC_DTO();
        PNhapDTO pnDTO=new PNhapDTO();
        //lấy giá trị mã nhà cung cấp từ combo box 1
        String value1=(String) cb1.getSelectedItem();
        String maNcc="";
        if(cb1.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Nhà Cung cấp","Thông báo",0);
        else{
            for(int i=0;i<value1.length();i++){
                if(value1.charAt(i)!='-') maNcc+=value1.charAt(i);
                else break;
            }
            pnDTO.setMA_NCC(maNcc);
            pnDTO.setNGAY_LAP(new Date(datePN.getDate().getTime()));
            pnDTO.setMA_NV(lblManv.getText());           
             //set mã phiếu cho chi tiết phiếu nhập và phiếu nhập
            PNhapBLL pnBLL=new PNhapBLL();
            ChiTietPN_DTO ctpnDTO=new ChiTietPN_DTO();
            ChiTietPN_BLL ctpnBLL=new ChiTietPN_BLL();
            ctpnDTO.setMA_PN(lblMAPN.getText());
            pnDTO.setMA_PN(lblMAPN.getText());
            if (tbpnhap.getModel().getValueAt(0, 0) != null && tbpnhap.getModel().getValueAt(0, 1) != null) {
                //insert phiếu nhập
                if (pnBLL.insertPN(pnDTO) != 0) {
                    JOptionPane.showMessageDialog(null, "Tạo phiếu nhập thành công!", "Thông báo", 1);
                    for (int i = 0; i < tbpnhap.getModel().getRowCount(); i++) {
                        //chép dữ liệu từ table vào csdl (insert ctpn)
                        ctpnDTO.setMA_HANG(tbpnhap.getModel().getValueAt(i, 1).toString());
                        ctpnDTO.setSO_LUONG(Integer.parseInt(tbpnhap.getModel().getValueAt(i, 4).toString()));
                        if (ctpnBLL.insertCtietPN(ctpnDTO) == 0) {
                            JOptionPane.showMessageDialog(null, "Tạo phiếu nhập thất bại!", "Thông báo", 0);
                            break;
                        }
                        HangHoaDTO hangDTO = new HangHoaDTO();
                        hangDTO.setMA_HANG(tbpnhap.getModel().getValueAt(i, 1).toString());
                        HangHoaBLL hangBLL = new HangHoaBLL();
                        int num = Integer.parseInt(tbpnhap.getModel().getValueAt(i, 4).toString());
                        if (hangBLL.updateSL(hangDTO, num) == 0) {
                            JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thất bại!", "Thông báo", 0);
                        }
                    }
                    pnDTO.setTONG_TIEN(pnBLL.TongTien(pnDTO));
                    pnBLL.updateTTien(pnDTO);
                    addComboBoxMaPN();
                } else {
                    JOptionPane.showMessageDialog(null, "Tạo phiếu nhập thất bại!", "Thông báo", 0);
                }
            }
            else JOptionPane.showMessageDialog(null, "Vui lòng chọn hàng cần nhập!","Thông báo",0);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tbpnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpnhapMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbpnhapMouseClicked

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb1ActionPerformed

    private void btnadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd2ActionPerformed
        // TODO add your handling code here:
        Frm_ThemHang addItem=new Frm_ThemHang();
        addItem.setVisible(true);
        addItem.LapPN=this;
        addItem.loaiPhieu = "PN";
    }//GEN-LAST:event_btnadd2ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        ChiTietPN_DTO ctpnDTO=new ChiTietPN_DTO();        
        if(tf1.getText().equals("Nhập Mã hàng")||tf2.getText().equals("Nhập số lượng")) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã hàng và số lượng!","Thông báo",0);
        else{
            ctpnDTO.setMA_PN(lblMAPN.getText());
            HangHoaDTO hangDTO=new HangHoaDTO();
            hangDTO.setMA_HANG(tf1.getText());
            ArrayList<HangHoaDTO> arr = new ArrayList<HangHoaDTO>();
            HangHoaBLL hangBLL = new HangHoaBLL();
            arr = hangBLL.searchHangMa(hangDTO);
            if(arr.size()==0) JOptionPane.showMessageDialog(null, "Mã sản phẩm này không tồn tại!","Thông báo",0);
            else{
                ctpnDTO.setMA_HANG(tf1.getText());                
                String pattern="\\d{1,}";
                if(tf2.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "Số lượng phải là số nguyên dương!","Thông báo",0);                
                else{
                    int so_luong=Integer.parseInt(tf2.getText());
                    ctpnDTO.setSO_LUONG(so_luong);
                    ChiTietPN_BLL ctpnBLL=new ChiTietPN_BLL();
                    tongTien+=getCTPN2(dtm,stt);
                    stt++;
                    Locale locale = new Locale("en", "EN");
                    String pattern2 = "###,###.##";
                    DecimalFormat decimalFormat = (DecimalFormat)NumberFormat
                        .getNumberInstance(locale);
                    decimalFormat.applyPattern(pattern2); 
                    lTien.setText(decimalFormat.format(tongTien));
                    tf1.setText("");
                }
                
            }
            
            tf2.setText("");
        }
    }//GEN-LAST:event_btnActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        PNhapDTO pnDTO=new PNhapDTO();     
        pnDTO.setMA_PN(lblMAPN.getText());
        PNhapBLL pnBLL=new PNhapBLL();        
        if(pnBLL.searchPN(pnDTO).size()==0) JOptionPane.showMessageDialog(null,"Vui lòng thực hiện tạo phiếu trước khi in!","Thông báo",0);
        else{            
            pnBLL.XuatPN(pnDTO);
        } 
    }//GEN-LAST:event_btnReportActionPerformed

    private void cbMaPNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaPNItemStateChanged
        // TODO add your handling code here:
        PNhapDTO pnDTO=new PNhapDTO();
        ChiTietPN_DTO ctpnDTO=new ChiTietPN_DTO();
        pnDTO.setMA_PN(String.valueOf(cbMaPN.getSelectedItem()));
        ctpnDTO.setMA_PN(String.valueOf(cbMaPN.getSelectedItem()));
        if(cbMaPN.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn Mã phiếu cần tìm!","Thông báo",0);
        }
        else{
                     
            getPN(pnDTO);
            getCTPN(ctpnDTO);
            
        }
    }//GEN-LAST:event_cbMaPNItemStateChanged

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập Mã hàng")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
            
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập số lượng")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
            
    }//GEN-LAST:event_tf2MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập Mã hàng");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập số lượng");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    public void getPN(PNhapDTO pnDTO) {
	 	 
	 ArrayList<PNhapDTO> arr = new ArrayList<PNhapDTO>();
         NhanVienDTO nvDTO=new NhanVienDTO();
         NhanVienBLL nvBLL=new NhanVienBLL();
	 PNhapBLL pnBLL = new PNhapBLL();    
         NCC_BLL nccBLL=new NCC_BLL();
         NCC_DTO nccDTO=new NCC_DTO();
	 arr = pnBLL.searchPN(pnDTO);
	 for (int i = 0; i < arr.size(); i++) {
            pnDTO = arr.get(i);		 
            lblMAPN.setText(pnDTO.getMA_PN()); 
            nccDTO.setMA_NCC(pnDTO.getMA_NCC());
            cb1.removeAllItems();
            cb1.addItem(pnDTO.getMA_NCC()+"-"+nccBLL.getTenNCC(nccDTO));
            datePN.setDate(pnDTO.getNGAY_LAP());
            lblManv.setText(pnDTO.getMA_NV());            
            //lblTien.setText(String.valueOf(pnDTO.getTONG_TIEN()));
	}        
	 
    }
   //add hàng vào bảng với csdl
    public void getCTPN(ChiTietPN_DTO ctpnDTO) {
	String[] header = { "STT","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","SỐ LƯỢNG","THÀNH TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<ChiTietPN_DTO> arr = new ArrayList<ChiTietPN_DTO>();
	 ChiTietPN_BLL ctpnBLL = new ChiTietPN_BLL();
	 arr = ctpnBLL.searchCtietPN(ctpnDTO);	
         int Total=0;
	 for (int i = 0; i < arr.size(); i++) {
		 ctpnDTO = arr.get(i);		 
		 String id = ctpnDTO.getMA_HANG();
                 HangHoaDTO hangDTO=new HangHoaDTO();
                 hangDTO.setMA_HANG(id);
                 HangHoaBLL hangBLL=new HangHoaBLL();
		 String name = hangBLL.getTenHang(hangDTO);
                 int price=hangBLL.getGia(hangDTO);
                 int num=ctpnDTO.getSO_LUONG();
                 int ttien=price*num;
                 Total+=ttien;
		  Object[] row = { i+1,id, name,price,num,ttien};
		 dtm.addRow(row);
	 }
	       tbpnhap.setModel(dtm);
        Locale locale = new Locale("en", "EN");
        String pattern2 = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
                .getNumberInstance(locale);
        decimalFormat.applyPattern(pattern2);
        lTien.setText(decimalFormat.format(Total));
    }
    //add vào bảng ko dùng csdl
    public int getCTPN2(DefaultTableModel dtm,int i) {
	//int tongTien=0;
	String id =tf1.getText();
        HangHoaDTO hangDTO=new HangHoaDTO();
        hangDTO.setMA_HANG(id);
        HangHoaBLL hangBLL=new HangHoaBLL();
	String name = hangBLL.getTenHang(hangDTO);
        int price=hangBLL.getGia(hangDTO);
        int num=Integer.parseInt(tf2.getText());
        int ttien=price*num;                 
        i++;
	Object[] row = { i,id, name,price,num,ttien};
	dtm.addRow(row);	 
	 tbpnhap.setModel(dtm);         
         return ttien;       
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnadd2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cbMaPN;
    private com.toedter.calendar.JDateChooser datePN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTien;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblMAPN;
    public javax.swing.JLabel lblManv;
    private javax.swing.JLabel lblmanhacc;
    private javax.swing.JLabel lblmanv;
    private javax.swing.JLabel lblmaphieu;
    private javax.swing.JLabel lblngaylap;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbpnhap;
    public javax.swing.JTextField tf1;
    public javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables

    

}
