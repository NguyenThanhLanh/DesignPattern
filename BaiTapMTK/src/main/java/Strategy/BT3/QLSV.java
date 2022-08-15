
package Strategy.BT3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }
    
    public void SapXep(){
        System.out.println("Chon phuong thuc sap xep: (true: sap xep theo ten/ false: sap xep theo diem)");
        Scanner sc = new Scanner(System.in);
        boolean pt = sc.nextBoolean();
        sc.nextLine();        
        if(pt){
            soSanh = new SoSanhTheoTen();
            dssv.sort((o1, o2) -> { return soSanh.soSanh(o1,o2);}); 
        }
        else{
            soSanh = new SoSanhTheoDiem();
            dssv.sort((o1, o2) -> { return soSanh.soSanh(o1,o2);});
        }
    }
    
    public void Xuat(){
        dssv.forEach((sv)->{sv.Xuat();});
    }
}
