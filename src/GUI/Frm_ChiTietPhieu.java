
package GUI;

import BLL.ChiTietHD_BLL;
import BLL.ChiTietPN_BLL;
import BLL.ChiTietPX_BLL;
import BLL.HangHoaBLL;
import BLL.PNhapBLL;
import BLL.PXuatBLL;
import DTO.ChiTietHD_DTO;
import DTO.ChiTietPN_DTO;
import DTO.ChiTietPX_DTO;
import DTO.HangHoaDTO;
import DTO.PNhapDTO;
import DTO.PXuatDTO;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_ChiTietPhieu extends javax.swing.JFrame {

   
    Frm_QLPhieuNhap QLPN;
    Frm_QLPhieuXuat QLPX;
    Frm_QLHoaDon QLHD;
    String MaPhieu_cu=null;
    int SL_cu=0;
    
    public Frm_ChiTietPhieu() {
        initComponents();        
        addControl();
        
    }

    private void addControl(){
        this.setLocationRelativeTo(null);
        panel.setBackground(Color.WHITE);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTitle.setText("CHI TIẾT PHIẾU ");

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
        tb1.setRowHeight(30);
        jScrollPane1.setViewportView(tb1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TỔNG TIỀN:");

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0");

        lblID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblID.setText("ID");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(lblTitle))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitle)
                .addGap(5, 5, 5)
                .addComponent(lblID)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotal))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void getCTPN(ChiTietPN_DTO ctpnDTO) {
        String[] header = {"STT", "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<ChiTietPN_DTO> arr = new ArrayList<ChiTietPN_DTO>();
        ChiTietPN_BLL ctpnBLL = new ChiTietPN_BLL();
        arr = ctpnBLL.searchCtietPN(ctpnDTO);
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            ctpnDTO = arr.get(i);
            String id = ctpnDTO.getMA_HANG();
            HangHoaDTO hangDTO = new HangHoaDTO();
            hangDTO.setMA_HANG(id);
            HangHoaBLL hangBLL = new HangHoaBLL();
            String name = hangBLL.getTenHang(hangDTO);
            int price = hangBLL.getGia(hangDTO);
            int num = ctpnDTO.getSO_LUONG();
            int ttien = price * num;
            total += ttien;
            Object[] row = {i + 1, id, name, price, num, ttien};
            dtm.addRow(row);
        }
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
                .getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);
        lblTotal.setText(decimalFormat.format(total));
        tb1.setModel(dtm);
    }
   public void getCTPX(ChiTietPX_DTO ctpxDTO) {
	String[] header = { "STT","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","SỐ LƯỢNG","THÀNH TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<ChiTietPX_DTO> arr = new ArrayList<ChiTietPX_DTO>();
	 ChiTietPX_BLL ctpxBLL = new ChiTietPX_BLL();
	 arr = ctpxBLL.searchCtietPX(ctpxDTO);	 
         int total = 0;
	 for (int i = 0; i < arr.size(); i++) {
		 ctpxDTO = arr.get(i);		 
		 String id = ctpxDTO.getMA_HANG();
                 HangHoaDTO hangDTO=new HangHoaDTO();
                 hangDTO.setMA_HANG(id);
                 HangHoaBLL hangBLL=new HangHoaBLL();
		 String name = hangBLL.getTenHang(hangDTO);
                 int price=hangBLL.getGia(hangDTO);
                 int num=ctpxDTO.getSO_LUONG();
                 int ttien=price*num;
                 total += ttien;
		  Object[] row = { i+1,id, name,price,num,ttien};
		 dtm.addRow(row);
	 }
        Locale locale = new Locale("en", "EN");
       String pattern = "###,###.##";
       DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
               .getNumberInstance(locale);
       decimalFormat.applyPattern(pattern);
       lblTotal.setText(decimalFormat.format(total));
       tb1.setModel(dtm);
    }
   
    public void getCTHD(ChiTietHD_DTO cthdDTO) {
        String[] header = {"STT", "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<ChiTietHD_DTO> arr = new ArrayList<ChiTietHD_DTO>();
        ChiTietHD_BLL cthdBLL = new ChiTietHD_BLL();
        arr = cthdBLL.searchCtietHD(cthdDTO);
         int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            cthdDTO = arr.get(i);
            String id = cthdDTO.getMA_HANG();
            HangHoaDTO hangDTO = new HangHoaDTO();
            hangDTO.setMA_HANG(id);
            HangHoaBLL hangBLL = new HangHoaBLL();
            String name = hangBLL.getTenHang(hangDTO);
            int price = hangBLL.getGia(hangDTO);
            int num = cthdDTO.getSO_LUONG();
            int ttien = price * num;
            total += ttien;
            Object[] row = {i + 1, id, name, price, num, ttien};
            dtm.addRow(row);
        }
        Locale locale = new Locale("en", "EN");
       String pattern = "###,###.##";
       DecimalFormat decimalFormat = (DecimalFormat) NumberFormat
               .getNumberInstance(locale);
       decimalFormat.applyPattern(pattern);
       lblTotal.setText(decimalFormat.format(total));
        tb1.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblID;
    public javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
