package DAL;
import DTO.ChiTietHD_DTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ChiTietHD_DAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=0;
        String sqlInsert="INSERT INTO ct_hd (MA_HD, MA_HANG, SLUONG) VALUES (?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,ctietHD_DTO.getMA_HD());
            preparedStatement.setString(2,ctietHD_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietHD_DTO.getSO_LUONG());
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
    //xóa 1 ctpx
    public int deleteCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_hd WHERE MA_HD=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietHD_DTO.getMA_HD());
            preparedStatement.setString(2,ctietHD_DTO.getMA_HANG());
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
    //xóa tất cả ctpx có cùng mã phiếu
    public int deleteAllCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_hd WHERE MA_HD=? ";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietHD_DTO.getMA_HD());               
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
    public int updateCtietHD(ChiTietHD_DTO ctietHD_DTO,String id){
        int result=0;
        String sqlupdate="UPDATE ct_hd SET MA_HD=?, MA_HANG=?, SLUONG=? WHERE MA_HD=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,ctietHD_DTO.getMA_HD());
            preparedStatement.setString(2,ctietHD_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietHD_DTO.getSO_LUONG());
            preparedStatement.setString(4,ctietHD_DTO.getMA_HD());
            preparedStatement.setString(5,id);
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
    public ArrayList<ChiTietHD_DTO> getAllctietHD(){
        ArrayList<ChiTietHD_DTO> result=new ArrayList<ChiTietHD_DTO>();
        String sqlSelectAll="SELECT * from ct_hd";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ChiTietHD_DTO ctietHD_DTO=new ChiTietHD_DTO();
                ctietHD_DTO.setMA_HD(resultset.getString("MA_HD"));
                ctietHD_DTO.setMA_HANG(resultset.getString("MA_HANG"));
                ctietHD_DTO.setSO_LUONG(resultset.getInt("SLUONG"));
                result.add(ctietHD_DTO);
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
    public ArrayList<ChiTietHD_DTO> searchCtietHD(ChiTietHD_DTO ctietHD_DTO) {
        ArrayList<ChiTietHD_DTO> result=new ArrayList<ChiTietHD_DTO>();
        String sql="SELECT * FROM ct_hd WHERE MA_HD=? ";
        ChiTietHD_DTO ctHD;
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ctietHD_DTO.getMA_HD());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ctHD = new ChiTietHD_DTO();
                ctHD.setMA_HANG(resultset.getString("MA_HANG")); 
                ctHD.setSO_LUONG(resultset.getInt("SLUONG"));
                result.add(ctHD);
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
    
    //hàm thống kê top 5 sản phẩm bán chạy
    public ArrayList<ChiTietHD_DTO> TK_Top5SP(){
        ArrayList<ChiTietHD_DTO> result=new ArrayList<ChiTietHD_DTO>();
        String sqlCreate = "create table temp as "
                + "select MA_HANG, SLUONG "
                + "from ct_hd "
                + "UNION ALL "
                + "select MA_HANG, SLUONG "
                + "from ct_px; ";
        String sqlSelect = "select TEN_HANG, SUM(hanghoa.GIA*temp.SLUONG) as TTIEN "
                + "from hanghoa, temp "
                + "where hanghoa.MA_HANG = temp.MA_HANG "
                + "group by TEN_HANG "
                + "order by TTIEN DESC "
                + "limit 5;";
        String sqlDrop = "drop table temp";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            con.prepareStatement(sqlCreate).execute();
            preparedStatement=con.prepareStatement(sqlSelect);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ChiTietHD_DTO cthdDTO=new ChiTietHD_DTO();                
                cthdDTO.setMA_HANG(resultset.getString("TEN_HANG"));
                cthdDTO.setSO_LUONG(resultset.getInt("TTIEN"));
                result.add(cthdDTO);
            }
            con.prepareStatement(sqlDrop).execute();
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
