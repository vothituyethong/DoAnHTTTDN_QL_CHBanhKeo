package DAL;

import DTO.PXuatDTO;
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

public class PXuatDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int insertPX(PXuatDTO pxDTO){
        int result=0;
        String sqlInsert="INSERT INTO p_xuat(MA_PX, NGAY_LAP, MA_NV, MA_KH, TONG_TIEN) VALUES (?,?,?,?,0)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,pxDTO.getMA_PX());
            preparedStatement.setDate(2,pxDTO.getNGAY_LAP());
            preparedStatement.setString(3,pxDTO.getMA_NV());
            preparedStatement.setString(4,pxDTO.getMA_KH());
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
    public int deletePX(PXuatDTO pxDTO){
        int result=0;
        String sqlDelete="DELETE FROM p_xuat WHERE MA_PX=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,pxDTO.getMA_PX());
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
    public int updatePX(PXuatDTO pxDTO){
        int result=0;
        String sqlupdate="UPDATE p_xuat SET MA_PX=?, NGAY_LAP=?, MA_NV=?, MA_KH=?, TONG_TIEN=? WHERE MA_PX=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,pxDTO.getMA_PX());
            preparedStatement.setDate(2,pxDTO.getNGAY_LAP());
            preparedStatement.setString(3,pxDTO.getMA_NV());
            preparedStatement.setString(4,pxDTO.getMA_KH());
            preparedStatement.setInt(5,pxDTO.getTONG_TIEN());
            preparedStatement.setString(6,pxDTO.getMA_PX());
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
    public ArrayList<PXuatDTO> getAllPX(){
        ArrayList<PXuatDTO> result=new ArrayList<PXuatDTO>();
        String sqlSelectAll="SELECT * from p_xuat";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                PXuatDTO pxDTO=new PXuatDTO();
                pxDTO.setMA_PX(resultset.getString("MA_PX"));
                pxDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                pxDTO.setMA_NV(resultset.getString("MA_NV"));
                pxDTO.setMA_KH(resultset.getString("MA_KH"));
                pxDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pxDTO);
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
    public ArrayList<PXuatDTO> searchPX(PXuatDTO pxDTO) {
        ArrayList<PXuatDTO> result=new ArrayList<PXuatDTO>();
        String sql="SELECT * FROM p_xuat WHERE MA_PX=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,pxDTO.getMA_PX());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                pxDTO.setMA_PX(resultset.getString("MA_PX"));
                pxDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                pxDTO.setMA_NV(resultset.getString("MA_NV"));
                pxDTO.setMA_KH(resultset.getString("MA_KH"));
                pxDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pxDTO);
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
    public int TongTien(PXuatDTO pxDTO){             
        int tongTien=0;        
        String sql="SELECT hanghoa.GIA,ct_px.SLUONG FROM hanghoa,ct_px WHERE hanghoa.MA_HANG=ct_px.MA_HANG AND ct_px.MA_PX=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);   
            preparedStatement.setString(1,pxDTO.getMA_PX()); 
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
   
    //tăng/giảm tổng tiền chỉnh sửa chi tiết phiếu xuất
    public int updateTTien(PXuatDTO pxDTO){   
        int result=0;
        String sqlupdate="UPDATE p_xuat SET TONG_TIEN=? WHERE MA_PX=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setInt(1,pxDTO.getTONG_TIEN());            
            preparedStatement.setString(2,pxDTO.getMA_PX());
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
    
    //Thống kê doanh thu theo Phiếu xuất
    public ArrayList<PXuatDTO> ThongKeDoanhThuPX (Date dateFrom, Date dateTo) {
        ArrayList<PXuatDTO> result=new ArrayList<PXuatDTO>();
         String sql ="";
        if(dateFrom != null && dateTo != null){
            sql="SELECT * FROM p_xuat WHERE NGAY_LAP BETWEEN '"+dateFrom+"' AND '"+dateTo+"'";
        }
        if(dateFrom != null && dateTo == null){
            sql="SELECT * FROM p_xuat WHERE NGAY_LAP >= '"+dateFrom+"'";
        }
        if(dateFrom == null && dateTo != null){
            sql="SELECT * FROM p_xuat WHERE NGAY_LAP <= '"+dateTo+"'";
        }
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                PXuatDTO pxDTO = new PXuatDTO();
                pxDTO.setMA_PX(resultset.getString("MA_PX"));
                pxDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                pxDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pxDTO);
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
    //hàm report phiếu xuất
    public void XuatPX(PXuatDTO pxDTO){
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            Hashtable map=new Hashtable();
            JasperReport report=JasperCompileManager.compileReport("src/Report/reportPX.jrxml");
            map.put("MA_PX", pxDTO.getMA_PX());
            JasperPrint p=JasperFillManager.fillReport(report,map,con);
            JasperViewer.viewReport(p,false);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
