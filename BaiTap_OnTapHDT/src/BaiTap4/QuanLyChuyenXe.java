
package BaiTap4;

import java.util.ArrayList;

public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> qlcx = new ArrayList<ChuyenXe>();

    public QuanLyChuyenXe() {
    }
    
    public void ThemChuyenXe(ChuyenXe xe){
        qlcx.add(xe);
    }
    
    public void XuatThongTinChiTietTungChuyenXe(){
        System.out.println("Thong tin chi tiet tung chuyen xe: ");
        qlcx.forEach((xe) -> {
            xe.Xuat();
        });
    }
    
    public void DSChuyenXe(){
        System.out.println("Danh sach cac chuyen xe: ");
        qlcx.forEach((xe) -> {
            System.out.println(xe.msCX+"\t");
        });
    }
    
    public double TongDoanhThuXeNoiThanh(){
        double TongDoanhThu = 0;
        for(ChuyenXe i: qlcx){
            if(i instanceof XeNoiThanh){
                TongDoanhThu+= i.doanhThu;
            }
        }
        return TongDoanhThu;
    }
    
    public double TongDoanhThuXeNgoaiThanh(){
        double TongDoanhThu = 0;
        for(ChuyenXe i: qlcx){
            if(i instanceof XeNgoaiThanh){
                TongDoanhThu+= i.doanhThu;
            }
        }
        return TongDoanhThu;
    }
    
    public double TongDoanhThu(){
        double tongDT = 0;
        for(ChuyenXe i: qlcx){
            tongDT+=i.doanhThu;
        }
        return tongDT;
    } 
    
}
