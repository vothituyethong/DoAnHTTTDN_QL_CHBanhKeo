package GUI;

import BLL.ChiTietHD_BLL;
import BLL.KhachHangBLL;
import BLL.NhanVienBLL;
import BLL.HDonBLL;
import DTO.ChiTietHD_DTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.HDonDTO;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Frm_QLHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form Frm_QLPhieuXuat
     */
    public Frm_QLHoaDon() {
        initComponents();
        addControl();
        addComboBoxMaHD();
        loadAll();
    }
    
    private void addControl(){
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        panel.setBackground(Color.WHITE);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);
        btnReport.setBackground(Color.PINK);
    }

    private void addComboBoxMaHD(){
        ArrayList<HDonDTO> arr = new ArrayList<HDonDTO>();
	 HDonBLL hdBLL = new HDonBLL();
	 arr = hdBLL.getAllHDon();	 
	 HDonDTO hdDTO = new HDonDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 hdDTO = arr.get(i);
		 cbMaHD.addItem(hdDTO.getMA_HD());		 
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
        lblTitle = new javax.swing.JLabel();
        btnReport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbMaHD = new javax.swing.JComboBox<>();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTitle.setText("QUẢN LÝ HÓA ĐƠN");

        btnReport.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReport.setText("IN HÓA ĐƠN");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("MÃ HĐ:");

        cbMaHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbMaHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Mã hóa đơn]" }));
        cbMaHD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaHDItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btn4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn4.setText("XEM CHI TIẾT");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn3.setText("HIỂN THỊ TẤT CẢ");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        tb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
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
                "STT", "MÃ HĐ", "NGÀY BÁN", "NHÂN VIÊN", "TÊN KHÁCH HÀNG", "TỔNG TIỀN"
            }
        ));
        tb1.setRowHeight(30);
        jScrollPane2.setViewportView(tb1);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btn3)
                        .addGap(43, 43, 43)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2)))
                .addGap(110, 110, 110))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(310, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (cbMaHD.getSelectedIndex() == 0) {
            try {
                int selectedIndex = tb1.getSelectedRow();
                String maHD = tb1.getModel().getValueAt(selectedIndex, 1).toString();

                Frm_ChiTietPhieu cthd = new Frm_ChiTietPhieu();
                cthd.lblTitle.setText("CHI TIẾT HÓA ĐƠN");
                cthd.lblID.setText("Mã hóa đơn: " + maHD);
                cthd.setVisible(true);
                cthd.QLHD = this;
                ChiTietHD_DTO cthdDTO = new ChiTietHD_DTO();
                cthdDTO.setMA_HD(maHD);
                cthd.getCTHD(cthdDTO);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn Hóa đơn cần tra cứu chi tiết!", "Thông báo", 0);
            }
        } else {
            Frm_ChiTietPhieu cthd = new Frm_ChiTietPhieu();
            cthd.lblTitle.setText("CHI TIẾT HÓA ĐƠN");
            cthd.lblID.setText("Mã hóa đơn: " + cbMaHD.getSelectedItem());
            cthd.setVisible(true);
            cthd.QLHD = this;
            ChiTietHD_DTO cthdDTO = new ChiTietHD_DTO();
            cthdDTO.setMA_HD(cbMaHD.getSelectedItem().toString());
            cthd.getCTHD(cthdDTO);
        }
        
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        
        if (cbMaHD.getSelectedIndex() == 0) {
            try {
                int selectedIndex = tb1.getSelectedRow();
                String maHD = tb1.getModel().getValueAt(selectedIndex, 1).toString();
                HDonDTO hdDTO = new HDonDTO();
                HDonBLL hdBLL = new HDonBLL();
                hdDTO.setMA_HD(maHD);
                hdBLL.XuatHD(hdDTO);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn Hóa đơn cần in!", "Thông báo", 0);
            }
        } else {
            HDonDTO hdDTO = new HDonDTO();
            HDonBLL hdBLL = new HDonBLL();
            hdDTO.setMA_HD(cbMaHD.getSelectedItem().toString());
            hdBLL.XuatHD(hdDTO);
        }
    }//GEN-LAST:event_btnReportActionPerformed

    private void cbMaHDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaHDItemStateChanged
        // TODO add your handling code here:
        if(cbMaHD.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Mã hóa đơn cần tìm!","Thông báo",0);
        else{
            HDonDTO hdDTO=new HDonDTO();
            hdDTO.setMA_HD(cbMaHD.getSelectedItem().toString());
            getHD(hdDTO);
        }
    }//GEN-LAST:event_cbMaHDItemStateChanged

    /**
     * @param args the command line arguments
     */
   
    public void loadAll() {
	String[] header = { "STT","MÃ HĐ","NGÀY BÁN","NHÂN VIÊN","KHÁCH HÀNG", "TỔNG TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<HDonDTO> arr = new ArrayList<HDonDTO>();
	 HDonBLL hdBLL = new HDonBLL();
	 arr = hdBLL.getAllHDon();
	 HDonDTO hdDTO = new HDonDTO();
         System.out.println(arr.size());
	 for (int i = 0; i < arr.size(); i++) {
		 hdDTO = arr.get(i);		 
		 String id = hdDTO.getMA_HD();	
                 
                 Date date=hdDTO.getNGAY_LAP();
                 
                 NhanVienDTO nvDTO=new NhanVienDTO();
                 nvDTO.setMA_NV(hdDTO.getMA_NV());
                 NhanVienBLL nvBLL=new NhanVienBLL();
                 String nv=nvBLL.getTenNV(nvDTO);    
                 
                 KhachHangDTO khDTO=new KhachHangDTO();
                 khDTO.setMA_KH(hdDTO.getMA_KH());
                 KhachHangBLL khBLL=new KhachHangBLL();
                 String kh=khBLL.getKHByMaKH(khDTO).getTEN_KH();
                 
                 int tien=hdDTO.getTONG_TIEN();
                 
		  Object[] row = {i+1, id, date,nv,kh,tien};
		 dtm.addRow(row);
	 }
	 tb1.setModel(dtm);
    }
    public void getHD(HDonDTO hdDTO) {
	String[] header = { "STT","MÃ HĐ","NGÀY XUẤT","NHÂN VIÊN","KHÁCH HÀNG", "TỔNG TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<HDonDTO> arr = new ArrayList<HDonDTO>();
	 HDonBLL hdBLL = new HDonBLL();
	 arr = hdBLL.searchHDon(hdDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 hdDTO = arr.get(i);		 
		 String id = hdDTO.getMA_HD();	
                 
                 Date date=hdDTO.getNGAY_LAP();
                 
                 NhanVienDTO nvDTO=new NhanVienDTO();
                 nvDTO.setMA_NV(hdDTO.getMA_NV());
                 NhanVienBLL nvBLL=new NhanVienBLL();
                 String nv=nvBLL.getTenNV(nvDTO);    
                 
                 KhachHangDTO khDTO=new KhachHangDTO();
                 khDTO.setMA_KH(hdDTO.getMA_KH());
                 KhachHangBLL khBLL=new KhachHangBLL();
                 String kh=khBLL.getKHByMaKH(khDTO).getTEN_KH();
                 
                 int tien=hdDTO.getTONG_TIEN();
                 
		  Object[] row = {i+1, id, date,nv,kh,tien};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Hóa đơn này không tồn tại!","Thông báo",0);
	 tb1.setModel(dtm);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cbMaHD;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
