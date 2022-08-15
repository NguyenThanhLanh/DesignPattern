package TemplateMenthod.BaiTap1;

import java.util.ArrayList;
import java.util.List;

public abstract class GioHang{
    List<MatHang> gioHang = new ArrayList<>();
    public void themMH(MatHang t){
        if(!gioHang.contains(t)){
            gioHang.add(t);
        }
        else System.out.println("Mat hang da ton tai");
    }
    public double tinhTien(){
        double s=0;
        for (MatHang t:gioHang) {
            s=s+t.donGia*t.soLuong;
        }
        return s;
    }
    public double tienPhaiTT(){
        return tinhTien() - tinhChietKhau()*tinhTien();
    }
    public void hienThiGioHang(){
        if(gioHang.size() !=0) {
            System.out.println("Danh sach san pham");
            for (MatHang t : gioHang) {
                System.out.println(( gioHang.indexOf(t) +1)+" "+ t.toString());
            }
            System.out.println();
            System.out.println("Tong tien: " + tinhTien());
            System.out.println("Tien chiet khau: " + tinhChietKhau());
            System.out.println("Tien khach can phai thanh toan: " + tienPhaiTT());
        }
        else System.out.println("Gio hang trong");
    }
    public abstract double tinhChietKhau();
}
