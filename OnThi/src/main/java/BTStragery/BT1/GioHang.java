package BTStragery.BT1;

import java.util.ArrayList;

public class GioHang {

    ArrayList<HangHoa> dsSP = new ArrayList<HangHoa>();
    IThanhToan thanhToan;

    public GioHang() {
    }

    public void addSP(HangHoa hh) {
        this.dsSP.add(hh);
    }

    public void xoaSP() {
    }

    public double TongTienHang(){
        //Tinh tong Tien Hnag
        double tongTienHang = 0;
        for (HangHoa i : dsSP) {
            tongTienHang += i.gia;
        }
        return tongTienHang;
    }
    
    public void ThanhToan(HinhThucTT httt){
        
        if(httt == HinhThucTT.ThanhToanOL){
            this.thanhToan = new TTOnline();
            System.out.println("Tong tien phai tra: "+this.thanhToan.ThanhToan(this.TongTienHang()));
        }
        else{
            this.thanhToan = new TTCOD();
            System.out.println("Tong tien phai tra: "+this.thanhToan.ThanhToan(this.TongTienHang()));
        }
    }
}
