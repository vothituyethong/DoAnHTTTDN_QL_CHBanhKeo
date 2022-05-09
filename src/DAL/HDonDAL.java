package DAL;

import DTO.HDonDTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class HDonDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int insertHD(HDonDTO hdDTO){
        int result=0;
        String sqlInsert="INSERT INTO hoadon(MA_HD, NGAY_LAP, MA_NV, MA_KH, TONG_TIEN) VALUES (?,?,?,?,0)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,hdDTO.getMA_HD());
            preparedStatement.setDate(2,hdDTO.getNGAY_LAP());
            preparedStatement.setString(3,hdDTO.getMA_NV());
            preparedStatement.setString(4,hdDTO.getMA_KH());
            result= preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }    
    //xóa
    public int deleteHD(HDonDTO hdDTO){
        int result=0;
        String sqlDelete="DELETE FROM hoadon WHERE MA_HD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,hdDTO.getMA_HD());
            result=preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //sửa
    public int updateHD(HDonDTO hdDTO){
        int result=0;
        String sqlupdate="UPDATE hoadon SET MA_HD=?, NGAY_LAP=?, MA_NV=?, MA_KH=?, TONG_TIEN=? WHERE MA_HD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,hdDTO.getMA_HD());
            preparedStatement.setDate(2,hdDTO.getNGAY_LAP());
            preparedStatement.setString(3,hdDTO.getMA_NV());
            preparedStatement.setString(4,hdDTO.getMA_KH());
            preparedStatement.setInt(5,hdDTO.getTONG_TIEN());
            preparedStatement.setString(6,hdDTO.getMA_HD());
            result= preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
            e.printStackTrace();
            }
        }
        return result;
    }
    //lấy tất cả các dòng dữ liệu
    public ArrayList<HDonDTO> getAllHD(){
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
        String sqlSelectAll="SELECT * from hoadon";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HDonDTO hdDTO=new HDonDTO();
                hdDTO.setMA_HD(resultset.getString("MA_HD"));
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setMA_NV(resultset.getString("MA_NV"));
                hdDTO.setMA_KH(resultset.getString("MA_KH"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
    //lấy tất cả các hóa đơn theo nhân viên
    public ArrayList<HDonDTO> getAllHD_Nv(String maNV){
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
        String sqlSelectAll="SELECT * FROM hoadon WHERE MA_NV = '"+maNV+"'";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HDonDTO hdDTO=new HDonDTO();
                hdDTO.setMA_HD(resultset.getString("MA_HD"));
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
    //tìm kiếm
    public ArrayList<HDonDTO> searchHD(HDonDTO hdDTO) {
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
        String sql="SELECT * FROM hoadon WHERE MA_HD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hdDTO.getMA_HD());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                hdDTO.setMA_HD(resultset.getString("MA_HD"));
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setMA_NV(resultset.getString("MA_NV"));
                hdDTO.setMA_KH(resultset.getString("MA_KH"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //tính tổng tiền
    public int TongTien(HDonDTO hdDTO){             
        int tongTien=0;        
        String sql="SELECT hanghoa.GIA,ct_hd.SLUONG FROM hanghoa,ct_hd WHERE hanghoa.MA_HANG=ct_hd.MA_HANG AND ct_hd.MA_HD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);   
            preparedStatement.setString(1,hdDTO.getMA_HD()); 
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){
                tongTien+=resultset.getInt("GIA")*resultset.getInt("SLUONG");               
            }                                  
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return tongTien;    
    }
    
    //tăng/giảm tổng tiền chỉnh sửa chi tiết hóa đơn
    public int updateTTien(HDonDTO hdDTO){   
        int result=0;
        String sqlupdate="UPDATE hoadon SET TONG_TIEN=? WHERE MA_HD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setInt(1,hdDTO.getTONG_TIEN());            
            preparedStatement.setString(2,hdDTO.getMA_HD());
            result=preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
            e.printStackTrace();
            }
        }        
        return result;
    }
    
     //Thống kê doanh thu Hóa đơn
    public ArrayList<HDonDTO> ThongKeDoanhThuHD (Date dateFrom, Date dateTo) {
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
         String sql ="";
        if(dateFrom != null && dateTo != null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP BETWEEN '"+dateFrom+"' AND '"+dateTo+"'";
        }
        if(dateFrom != null && dateTo == null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP >= '"+dateFrom+"'";
        }
        if(dateFrom == null && dateTo != null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP <= '"+dateTo+"'";
        }
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HDonDTO hdDTO = new HDonDTO();
                hdDTO.setMA_HD(resultset.getString("MA_HD"));
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
     //Lịch sử giao dịch của nhân viên
    public ArrayList<HDonDTO> LSGiaoDichNV (Date dateFrom, Date dateTo, String manv) {
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
         String sql ="";
        if(dateFrom != null && dateTo != null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP BETWEEN '"+dateFrom+"' AND '"+dateTo+"' AND MA_NV = '"+manv+"'";
        }
        if(dateFrom != null && dateTo == null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP >= '"+dateFrom+"' AND MA_NV = '"+manv+"'";
        }
        if(dateFrom == null && dateTo != null){
            sql="SELECT * FROM hoadon WHERE NGAY_LAP <= '"+dateTo+"' AND MA_NV = '"+manv+"'";
        }
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HDonDTO hdDTO = new HDonDTO();
                hdDTO.setMA_HD(resultset.getString("MA_HD"));
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //hàm report hóa đơn
    public void XuatHD(HDonDTO hdDTO){
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            Hashtable map=new Hashtable();
            JasperReport report=JasperCompileManager.compileReport("src/Report/reportHD.jrxml");
            map.put("MA_HD", hdDTO.getMA_HD());
            JasperPrint p=JasperFillManager.fillReport(report,map,con);
            JasperViewer.viewReport(p,false);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //hàm thống kê doanh thu của nhân viên
    public ArrayList<HDonDTO> TK_DoanhThuNV(String maNV){
        ArrayList<HDonDTO> result=new ArrayList<HDonDTO>();
        String sql="SELECT NGAY_LAP, SUM(TONG_TIEN) as TONG_TIEN \n" +
                    "FROM `hoadon` \n" +
                    "WHERE MA_NV='"+maNV+"' GROUP BY NGAY_LAP";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HDonDTO hdDTO=new HDonDTO();                
                hdDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                hdDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(hdDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    
    
}
