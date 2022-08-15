
package BT1_rework;

import java.util.ArrayList;

public abstract class GioHang {
    ArrayList<MatHang> dssp = new ArrayList<MatHang>();
    
    protected void add(MatHang mh){
        dssp.add(mh);
    }
    
    protected void Xuat(){
        for(MatHang i: dssp){
            i.Xuat();
            System.out.println("==============================");
        }
        System.out.println("Tong tien: "+ this.TongTienGH());
        System.err.println("So tien chiec khau: "+ this.tinhCK());
        System.out.println("So tien phai tra: "+ (this.TongTienGH() - this.tinhCK()));
    }
    
    protected double TongTienGH(){
        double tongtien=0;
        for(MatHang i: dssp){
            tongtien+=i.TongTienSP();
        }
        return tongtien;
    };
    protected abstract double tinhCK();
}
