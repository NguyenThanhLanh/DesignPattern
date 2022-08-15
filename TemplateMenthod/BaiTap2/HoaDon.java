package TemplateMenthod.BaiTap2;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {
    List<MatHang> dsHangHoa = new ArrayList<>();
    public void themMH(MatHang t){
        if(!dsHangHoa.contains(t)){
            dsHangHoa.add(t);
        }
        else System.out.println("Mat hang da ton tai");
    }
    public double tinhTien(){
        double s=0;
        for (MatHang t:dsHangHoa) {
            s=s+t.donGia*t.soLuong;
        }
        return s;
    }
    public void hienThiGioHang(){
        if(dsHangHoa.size() !=0) {
            System.out.println("Danh sach san pham");
            for (MatHang t : dsHangHoa) {
                System.out.println(( dsHangHoa.indexOf(t) +1)+" "+ t.toString());
            }
            System.out.println();
            System.out.println("Tong tien: " + tinhTien());
            System.out.println("Tien chiet khau: " + tinhChietKhau());
            System.out.println("Tien khach can phai thanh toan: " + tienPhaiTT());
        }
        else System.out.println("Gio hang trong");
    }
    public double tienPhaiTT(){
        return tinhTien() - tinhChietKhau()*tinhTien();
    }
    public abstract double tinhChietKhau();
}
