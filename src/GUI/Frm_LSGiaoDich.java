package GUI;

import BLL.HDonBLL;
import BLL.NhanVienBLL;
import DTO.HDonDTO;
import DTO.NhanVienDTO;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_LSGiaoDich extends javax.swing.JFrame {

    public Frm_LSGiaoDich() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        
    }
    
    public String MaNV;

    public void setLabelHoTenNV(){
        NhanVienDTO nvDTO=new NhanVienDTO();
        nvDTO.setMA_NV(MaNV);
        NhanVienBLL nvBLL=new NhanVienBLL();
        String name=nvBLL.getTenNV(nvDTO);
        lblHoten.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DPdateFrom = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        DPdateTo = new com.toedter.calendar.JDateChooser();
        btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHD = new javax.swing.JTable();
        lbl2 = new javax.swing.JLabel();
        lblTTienHD = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHoten = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LỊCH SỬ GIAO DỊCH");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Từ ngày: ");

        DPdateFrom.setDateFormatString("dd/MM/yyyy");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Đến ngày:");

        DPdateTo.setDateFormatString("dd/MM/yyyy");

        btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn.setText("Tìm kiếm");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Bán lẻ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tbHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbHD.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HÓA ĐƠN", "NGÀY LẬP", "THÀNH TIỀN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHD.setRowHeight(34);
        jScrollPane2.setViewportView(tbHD);
        if (tbHD.getColumnModel().getColumnCount() > 0) {
            tbHD.getColumnModel().getColumn(0).setResizable(false);
            tbHD.getColumnModel().getColumn(1).setResizable(false);
            tbHD.getColumnModel().getColumn(2).setResizable(false);
            tbHD.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl2.setText("TỔNG TIỀN: ");

        lblTTienHD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTTienHD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTTienHD.setText("0");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Họ tên nhân viên:");

        lblHoten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblHoten.setText("TenNV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lblTTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(DPdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(DPdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblHoten))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(DPdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(DPdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn))
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblTTienHD))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        
        if (DPdateFrom.getDate() == null && DPdateTo.getDate() == null) {

            HDonBLL hdBLL = new HDonBLL();
            loadAllHD_Nv(hdBLL.getAllHD_Nv(MaNV));
        } else {
            if (DPdateFrom.getDate() != null && DPdateTo.getDate() != null) {
                Date dateFrom = new Date(DPdateFrom.getDate().getTime());
                Date dateTo = new Date(DPdateTo.getDate().getTime());
                if (dateFrom.before(dateTo)) {

                    HDonBLL hdBLL = new HDonBLL();
                    loadAllHD_Nv(hdBLL.LSGiaoDichNV(dateFrom, dateTo, MaNV));
                } else {
                    JOptionPane.showMessageDialog(null, "Khoảng thời gian không hợp lệ. Ngày bắt đầu phải bé hơn Ngày kết thúc", "Thông báo", 0);
                }
            } else {
                Date dateFrom = null;
                Date dateTo = null;
                if (DPdateFrom.getDate() != null) {
                    dateFrom = new Date(DPdateFrom.getDate().getTime());
                } else {
                    dateTo = new Date(DPdateTo.getDate().getTime());
                }

                HDonBLL hdBLL = new HDonBLL();
                loadAllHD_Nv(hdBLL.LSGiaoDichNV(dateFrom, dateTo, MaNV));
            }
        }
        

    }//GEN-LAST:event_btnActionPerformed

    public void loadAllHD_Nv(ArrayList<HDonDTO> arr) {
        String[] header = {"STT", "MÃ HÓA ĐƠN", "NGÀY LẬP", "THÀNH TIỀN"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        int total = 0;
        HDonDTO hdDTO = new HDonDTO();
        for (int i = 0; i < arr.size(); i++) {
            hdDTO = arr.get(i);
            String id = hdDTO.getMA_HD();
            Date date = hdDTO.getNGAY_LAP();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate= DateFor.format(date);
            int tien = hdDTO.getTONG_TIEN();
            total+=tien;
            Object[] row = {i + 1, id, stringDate, tien};
            dtm.addRow(row);
        }
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat)NumberFormat
            .getNumberInstance(locale);
        decimalFormat.applyPattern(pattern); 
        lblTTienHD.setText(decimalFormat.format(total));
        tbHD.setModel(dtm);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DPdateFrom;
    private com.toedter.calendar.JDateChooser DPdateTo;
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblHoten;
    private javax.swing.JLabel lblTTienHD;
    private javax.swing.JTable tbHD;
    // End of variables declaration//GEN-END:variables
}
