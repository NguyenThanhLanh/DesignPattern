
package Strategy.BT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public List<HangHoa> getDshh() {
        return dshh;
    }

    public void setDshh(ArrayList<HangHoa> dshh) {
        this.dshh = dshh;
    }
    
    public void Xuat(){
        dshh.forEach((hh)->{hh.Xuat();});
    }
    
    public int tongTien(){
        int sum=0;
        for(HangHoa i: dshh)
        sum = sum+i.gia;
      return sum;
    }
    
    public void ThanhToan(int tongTien){
        System.out.println("Nhap phuong thuc muon thanh toan: (true: thanh toan online, false: thanh toan COD)");
        Scanner scanner = new Scanner(System.in);
        boolean pt = scanner.nextBoolean();
        if(pt){
             hinhThucTT = new ThanhToanOnline();
             System.out.println("Tong tien cua phai tra: " + hinhThucTT.thanhToan(tongTien));
        }
        else
        {
            hinhThucTT = new ThanhToanOnline();
            System.out.println("Tong tien phai tra: "+hinhThucTT.thanhToan(tongTien));
        }
    }
}
