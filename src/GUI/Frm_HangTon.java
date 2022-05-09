/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HangHoaBLL;
import DTO.HangHoaDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Frm_HangTon extends javax.swing.JFrame {

    /**
     * Creates new form Frm_HangTon
     */
    public Frm_HangTon() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        loadAllHangTon();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("DANH SÁCH HÀNG TỒN KHO");

        tbTon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tbTon.setModel(new javax.swing.table.DefaultTableModel(
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
                "TÊN HÀNG", "SL NHẬP", "SL XUẤT", "SL TỒN"
            }
        ));
        tbTon.setRowHeight(35);
        jScrollPane1.setViewportView(tbTon);
        if (tbTon.getColumnModel().getColumnCount() > 0) {
            tbTon.getColumnModel().getColumn(0).setPreferredWidth(200);
            tbTon.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbTon.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbTon.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void loadAllHangTon() {
        String[] header = {"TÊN HÀNG", "SL NHẬP", "SL XUẤT", "SL TỒN"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<HangHoaDTO> arr = new ArrayList<HangHoaDTO>();
        HangHoaDTO hhDTO = new HangHoaDTO();
        HangHoaBLL hhBLL = new HangHoaBLL();
        arr = hhBLL.TK_HangTon();
        for (int i = 0; i < arr.size(); i++) {
            hhDTO = arr.get(i);
            String name = hhDTO.getTEN_HANG();
            int sln =  hhDTO.getSLN();
            int slx = hhDTO.getSLX();
            int slton = hhDTO.getSO_LUONG();
            
            Object[] row = {name, sln, slx, slton};
            dtm.addRow(row);
        }
        tbTon.setModel(dtm);
        tbTon.getColumnModel().getColumn(0).setPreferredWidth(400);
        tbTon.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbTon.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbTon.getColumnModel().getColumn(3).setPreferredWidth(50);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTon;
    // End of variables declaration//GEN-END:variables
}
