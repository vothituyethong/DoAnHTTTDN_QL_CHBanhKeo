package BLL;

import DAL.HDonDAL;
import DTO.HDonDTO;
import java.sql.Date;
import java.util.ArrayList;

public class HDonBLL{
    HDonDAL hdDAL=new HDonDAL();    

    public int insertHDon(HDonDTO hd_DTO){
        int result=hdDAL.insertHD(hd_DTO);
        return result;
    }
    
    public int deletetHDon(HDonDTO hd_DTO){
        int result=hdDAL.deleteHD(hd_DTO);
        return result;
    }
    
    public int updateHDon(HDonDTO hd_DTO){
        int result=hdDAL.updateHD(hd_DTO);
        return result;
    }
    
    public int TongTien(HDonDTO hd_DTO){
        int result=hdDAL.TongTien(hd_DTO);
        return result;
    }
    public int updateTTien(HDonDTO hdDTO){
        hdDTO.setTONG_TIEN(hdDAL.TongTien(hdDTO));
        int result=hdDAL.updateTTien(hdDTO);
        return result;
    }
    
    public ArrayList<HDonDTO> getAllHDon(){
        return hdDAL.getAllHD();
    }
    
    public ArrayList<HDonDTO> getAllHD_Nv(String maNV){
        return hdDAL.getAllHD_Nv(maNV);
    }
    
    public ArrayList<HDonDTO> searchHDon(HDonDTO hd_DTO){
        return hdDAL.searchHD(hd_DTO);
    }
     
    public ArrayList<HDonDTO> ThongKeDoanhThuHD(Date dateFrom, Date dateTo){
        return hdDAL.ThongKeDoanhThuHD(dateFrom, dateTo);
    }
    
    public ArrayList<HDonDTO> LSGiaoDichNV(Date dateFrom, Date dateTo, String manv){
        return hdDAL.LSGiaoDichNV(dateFrom, dateTo, manv);
    }
    
    public String getMaHD(){
        String x=null;
        int n=hdDAL.getAllHD().size();
        n++;
        if(n<10)
        x="00"+Integer.toString(n);
        else{if(n<100)
            x="0"+Integer.toString(n);
        else
        x=Integer.toString(n);
        }
        return "HD"+x;
    }
     public void XuatHD(HDonDTO hdDTO){
        hdDAL.XuatHD(hdDTO);
    }
     
     public ArrayList<HDonDTO> TK_DoanhThuNV(String maNV){
        return hdDAL.TK_DoanhThuNV(maNV);
    }
}
