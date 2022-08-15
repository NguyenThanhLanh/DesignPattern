package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLSV {
    ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
    ISoSanh SoSanh;
    
    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setSoSanh(ISoSanh SoSanh) {
        this.SoSanh = SoSanh;
    }
    public void ThemSV(SinhVien sv){
        dssv.add(sv);
    }
    
    public void SapXep(){
        System.out.println("Chon phuong thuc sap xep: (True: Sap xep theo ten, False: Sap xep theo diem)");
        boolean bt;
        Scanner scanner = new Scanner(System.in);
        bt = scanner.nextBoolean();
        if(bt==true){
            SoSanh = new SoSanhTheoTen();
            int sl = dssv.size();
            for(int i = 0; i < sl-1; i++){
                for(int j = i+1; j<sl; j++){
                    if(SoSanh.soSanh(dssv.get(i), dssv.get(j))== 1){
                        Collections.swap(dssv, i, j);
                    }
                }
            }
        }
        else{
            SoSanh = new SoSanhTheoDiem();
            int sl = dssv.size();
            for(int i = 0; i < sl-1; i++){
                for(int j = i+1; j<sl; j++){
                    if(SoSanh.soSanh(dssv.get(i), dssv.get(j))==-1){
                        Collections.swap(dssv, i, j);
                    }
                }
            }
        }
    }
    
    public void Xuat(){
        dssv.forEach(sv -> sv.Xuat());
    }
    
}
