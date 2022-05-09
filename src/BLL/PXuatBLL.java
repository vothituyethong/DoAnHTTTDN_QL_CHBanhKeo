package BLL;

import DAL.PXuatDAL;
import DTO.PXuatDTO;
import java.sql.Date;
import java.util.ArrayList;

public class PXuatBLL{
    PXuatDAL pxDAL=new PXuatDAL();    

    public int insertPXuat(PXuatDTO px_DTO){
        int result=pxDAL.insertPX(px_DTO);
        return result;
    }
    
    public int deletetPXuat(PXuatDTO px_DTO){
        int result=pxDAL.deletePX(px_DTO);
        return result;
    }
    
    public int updatePXuat(PXuatDTO px_DTO){
        int result=pxDAL.updatePX(px_DTO);
        return result;
    }
    
    public int TongTien(PXuatDTO px_DTO){
        int result=pxDAL.TongTien(px_DTO);
        return result;
    }
    
    public int updateTTien(PXuatDTO pxDTO){
        pxDTO.setTONG_TIEN(pxDAL.TongTien(pxDTO));
        int result=pxDAL.updateTTien(pxDTO);
        return result;
    }
    
    public ArrayList<PXuatDTO> getAllPXuat(){
        return pxDAL.getAllPX();
    }
    
    public ArrayList<PXuatDTO> searchPXuat(PXuatDTO px_DTO){
        return pxDAL.searchPX(px_DTO);
    }
    
    public ArrayList<PXuatDTO> ThongKeDoanhThuPX(Date dateFrom, Date dateTo){
        return pxDAL.ThongKeDoanhThuPX(dateFrom, dateTo);
    }
    
    public String getNextMaPX(){
        String x=null;
        int n=pxDAL.getAllPX().size();
        n++;
        if(n<10)
        x="00"+Integer.toString(n);
        else{if(n<100)
            x="0"+Integer.toString(n);
        else
        x=Integer.toString(n);
        }
        return "X"+x;
    }
    
    
     public void XuatPX(PXuatDTO pxDTO){
        pxDAL.XuatPX(pxDTO);
    }
}
