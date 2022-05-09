package DTO;

import java.sql.Date;

public class HDonDTO 
{
    private String MA_HD;
    private Date NGAY_LAP;
    private String MA_NV;
    private String MA_KH;
    private int TONG_TIEN;
    public HDonDTO()
    {
        MA_HD=null;
        NGAY_LAP=null;
        MA_NV=null;
        MA_KH=null;
        TONG_TIEN=0;
    }
    public HDonDTO(String MA_HD, Date NGAY_LAP, String MA_NV, String MA_KH, int TONG_TIEN)
    {
        this.MA_HD=MA_HD;
        this.NGAY_LAP=NGAY_LAP;
        this.MA_NV=MA_NV;
        this.MA_KH=MA_KH;
        this.TONG_TIEN=TONG_TIEN;
    }

    public String getMA_HD() {
        return MA_HD;
    }

    public Date getNGAY_LAP() {
        return NGAY_LAP;
    }

    public String getMA_NV() {
        return MA_NV;
    }

    public String getMA_KH() {
        return MA_KH;
    }

    public int getTONG_TIEN() {
        return TONG_TIEN;
    }

    public void setMA_HD(String MA_HD) {
        this.MA_HD = MA_HD;
    }

    public void setNGAY_LAP(Date NGAY_LAP) {
        this.NGAY_LAP = NGAY_LAP;
    }

    public void setMA_NV(String MA_NV) {
        this.MA_NV = MA_NV;
    }

    public void setMA_KH(String MA_KH) {
        this.MA_KH = MA_KH;
    }

    public void setTONG_TIEN(int TONG_TIEN) {
        this.TONG_TIEN = TONG_TIEN;
    }
}
