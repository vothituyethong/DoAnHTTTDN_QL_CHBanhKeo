package BLL;

import DAL.ChiTietHD_DAL;
import DTO.ChiTietHD_DTO;
import java.util.ArrayList;

public class ChiTietHD_BLL{
    ChiTietHD_DAL cthdDAL=new ChiTietHD_DAL();    

    public int insertCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=cthdDAL.insertCtietHD(ctietHD_DTO);
        return result;
    }
    
    public int deleteCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=cthdDAL.deleteCtietHD(ctietHD_DTO);
        return result;
    }
    
    public int deleteAllCtietHD(ChiTietHD_DTO ctietHD_DTO){
        int result=cthdDAL.deleteAllCtietHD(ctietHD_DTO);
        return result;
    }
    
    public int updateCtietHD(ChiTietHD_DTO ctietHD_DTO,String id){
        int result=cthdDAL.updateCtietHD(ctietHD_DTO,id);
        return result;
    }
    
    public ArrayList<ChiTietHD_DTO> getAllctietHD(){
        return cthdDAL.getAllctietHD();
    }
    
    public ArrayList<ChiTietHD_DTO> searchCtietHD(ChiTietHD_DTO ctietHD_DTO){
        return cthdDAL.searchCtietHD(ctietHD_DTO);
    }
    
    public ArrayList<ChiTietHD_DTO> TK_Top5SP(){
        return cthdDAL.TK_Top5SP();
    }
}
