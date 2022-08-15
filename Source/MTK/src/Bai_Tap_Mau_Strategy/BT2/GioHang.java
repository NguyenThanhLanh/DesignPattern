package Bai_Tap_Mau_Strategy.BT2;


import java.util.ArrayList;
import java.util.List;

public class GioHang {
   List<HangHoa> hh = new ArrayList<>();
   IThanhToan HinhThucTT;

   //set && get
    public List<HangHoa> getHh() {
        return hh;
    }
    public void setHh(List<HangHoa> hh) {
        this.hh = hh;
    }
    public IThanhToan getHinhThucTT() {
        return HinhThucTT;
    }
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        HinhThucTT = hinhThucTT;
    }

    // in danh sach ra man hinh
    public void inDS(){
        hh.forEach(hangHoa -> {
            System.out.println("Ten hang: "+hangHoa.tenHang+
                    "\nGia: "+hangHoa.gia+
                    "\nMo ta: "+hangHoa.moTa);
        });
    }

    //tra ve gia tri double la ket qua gia tien cua cua hang
    public double thanhToan(){
//        double tien = hh.stream().mapToDouble(hangHoa -> hangHoa.gia).sum();
//        return HinhThucTT.thanhToan((int) tien);


        double[] tien = {0};
        hh.forEach(hangHoa -> {
            tien[0] = tien[0] + hangHoa.gia;
        });

        return tien[0];
    }
    

}
