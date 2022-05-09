
package GUI;

import BLL.NhanVienBLL;
import BLL.TaiKhoanBLL;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Frm_Login extends javax.swing.JFrame {

   
    public Frm_Login() {
        initComponents();
        addControl();
    }
    
    private void addControl(){
        Font ft=new Font("Times New Roman",Font.BOLD,22);
        lbl1.setFont(ft);
        lbl2.setFont(ft);
        panel.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO MAILISA");
        btn1.setBackground(Color.PINK);
        //btn1.requestFocus();
        Anh1.setIcon(createIcon("/resources/account.jpg"));
        Anh2.setIcon(createIcon("/resources/key.jpg"));
        lbl1.requestFocus();
        tf1.setText("Nhập tên tài khoản");
        pf1.setText("Nhập password");
        tf1.setForeground(Color.DARK_GRAY);
        pf1.setForeground(Color.DARK_GRAY);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        Anh1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        Anh2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("ĐĂNG NHẬP");

        lbl1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbl1.setText("Tên tài khoản");

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

        lbl2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbl2.setText("Mật khẩu");

        pf1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf1FocusLost(evt);
            }
        });
        pf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf1MouseClicked(evt);
            }
        });
        pf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf1KeyPressed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btn1.setForeground(new java.awt.Color(51, 51, 51));
        btn1.setText("Đăng nhập");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Anh1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anh2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Anh1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Anh2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁNH KẸO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MAILISA");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/shop.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(jLabel2))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        TaiKhoanDTO tkDTO=new TaiKhoanDTO();
        tkDTO.setUSERNAME(tf1.getText());
        tkDTO.setPASSWORD(String.valueOf(pf1.getPassword()));
        TaiKhoanBLL tkBLL=new TaiKhoanBLL();
        if(tf1.getText().equals("Nhập tên tài khoản")||String.valueOf(pf1.getPassword()).equals("Nhập password")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin.","Thông báo",0);
        }
        else{
            ArrayList<TaiKhoanDTO> arr = new ArrayList<TaiKhoanDTO>();	 
            arr = tkBLL.Login(tkDTO);
            if(arr.size()==0) 
                JOptionPane.showMessageDialog(null, "Tên tài khoản hoặc mật khẩu không hợp lệ.","Thông báo",1);
            else{                
                for(int i=0;i<arr.size();i++){
                    int lock=tkDTO.getKHOA();                    
                    String user=tkDTO.getMA_NV();
                    NhanVienDTO nvDTO=new NhanVienDTO();
                    nvDTO.setMA_NV(user);
                    NhanVienBLL nvBLL=new NhanVienBLL();
                    String name=nvBLL.getTenNV(nvDTO);
                    String quyen=tkDTO.getMA_QUYEN();                
                    if(quyen.equals("STORE")&&lock==0){
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công.","Thông báo",1);
                        /*Frm_Admin ad=new Frm_Admin();
                        ad.setVisible(true);
                        this.dispose();*/
                        Frm_NhanVienBH nv=new Frm_NhanVienBH();
                        nv.setVisible(true);
                        nv.manv = nvDTO.getMA_NV();
                        nv.lblManv.setText(name);
                        this.dispose();
                    }
                    else {
                        if(quyen.equals("MN")&&lock==0){
                            JOptionPane.showMessageDialog(null, "Đăng nhập thành công.","Thông báo",1);
                            Frm_QuanLy mn=new Frm_QuanLy();
                            mn.setVisible(true);
                            mn.lblMaNV.setText(name);
                            this.dispose();
                        }
                        else {
                            if(quyen.equals("STOCK")&&lock==0){
                                JOptionPane.showMessageDialog(null, "Đăng nhập thành công.","Thông báo",1);
                                Frm_NhanVienKho nv=new Frm_NhanVienKho();
                                nv.setVisible(true);    
                                nv.lblManv.setText(name);
                                this.dispose();
                            }
                            else JOptionPane.showMessageDialog(null, "Tài khoản đã bị khóa!","Thông báo",0);
                        }
                            
                    }
                        
                }
            }                            
             
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            pf1.requestFocus();          
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void pf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn1.doClick();
        }
    }//GEN-LAST:event_pf1KeyPressed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập tên tài khoản")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void pf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf1MouseClicked
        // TODO add your handling code here:
        if(String.valueOf(pf1.getPassword()).equals("Nhập password")){
            pf1.setText("");
            pf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pf1MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập tên tài khoản");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void pf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusLost
        // TODO add your handling code here:
        if(String.valueOf(pf1.getPassword()).equals("")){
            pf1.setText("Nhập password");
            pf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_pf1FocusLost

    private void pf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf1FocusGained
        // TODO add your handling code here:
        if(String.valueOf(pf1.getPassword()).equals("Nhập password")){
            pf1.setText("");
            pf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pf1FocusGained

    private static ImageIcon createIcon(String path){
        java.net.URL iconURL=Frm_NhanVienKho.class.getResource(path);
        if(iconURL!=null){
            return new ImageIcon(iconURL);
        }
        else{
            System.out.println("Không tìm thấy icon.");
            return null;
        }
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
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anh1;
    private javax.swing.JLabel Anh2;
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
