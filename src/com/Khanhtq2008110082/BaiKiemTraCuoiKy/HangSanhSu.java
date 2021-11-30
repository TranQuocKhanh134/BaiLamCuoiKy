/*
*Ngày tạo : 28 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.Khanhtq2008110082.BaiKiemTraCuoiKy;

import java.text.DecimalFormat;
import java.text.ParseException;

public class HangSanhSu extends HangHoa {
    private String xuatXu;

    public HangSanhSu(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho ,String xuatXu)throws ParseException {
        super("HSS-"+maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.xuatXu = xuatXu;
        //TODO Auto-generated constructor stub
    }
    public String getXuatXu() {
        return xuatXu;
    }
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s;
        s = super.toString() + String.format("%-20s|%-20s|",getXuatXu(),ft.format(tinhTien()));
        return s;
    }
    
}
