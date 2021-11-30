/*
*Ngày tạo : 28 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.Khanhtq2008110082.BaiKiemTraCuoiKy;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date ngayHetHan;
    public HangThucPham(String maHang, String tenHangHoa, long giaNhap, int soLuongTonKho, String ngayNhapKho , String ngayHetHan)throws ParseException {
        super("HTP-" + maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
        this.ngayHetHan = chuyenChuoiSangNgay(ngayHetHan);
        //TODO Auto-generated constructor stub
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    DecimalFormat ft = new DecimalFormat("###,###,### VND");
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format( "%-20s|%-20s|", chuyenNgaySangChuoi(getNgayHetHan()) , ft.format(tinhTien()));
        return s;
    }

    
}
