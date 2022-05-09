package DTO;

public class ChiTietHD_DTO 
{
    private String MA_HD;
    private String MA_HANG;
    private int SO_LUONG;
    public ChiTietHD_DTO()
    {
        MA_HD=null;
        MA_HANG=null;
        SO_LUONG=0;
    }
    public ChiTietHD_DTO(String MA_HD, String MA_HANG, int SO_LUONG)
    {
        this.MA_HANG=MA_HANG;
        this.MA_HD=MA_HD;
        this.SO_LUONG=SO_LUONG;
    }

    public String getMA_HD() {
        return MA_HD;
    }

    public String getMA_HANG() {
        return MA_HANG;
    }

    public int getSO_LUONG() {
        return SO_LUONG;
    }

    public void setMA_HD(String MA_HD) {
        this.MA_HD = MA_HD;
    }

    public void setMA_HANG(String MA_HANG) {
        this.MA_HANG = MA_HANG;
    }

    public void setSO_LUONG(int SO_LUONG) {
        this.SO_LUONG = SO_LUONG;
    }
    
}
