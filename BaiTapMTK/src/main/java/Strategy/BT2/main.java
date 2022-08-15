
package Strategy.BT2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GioHang dsh = new GioHang();
        boolean p;
        int gia;
        String name, mota;
        
        //Nhap
        do{ System.out.println("Nhap ten hang hoa: ");
            name = scanner.nextLine();
            System.out.println("Nhap gia san pham: ");  
            gia = scanner.nextInt();
            scanner.nextLine();//trôi lệnh
            System.out.println("Nhap mota");
            mota = scanner.nextLine();
            scanner.nextLine();
            HangHoa hh = new HangHoa(name, gia, mota);
            dsh.dshh.add(hh);
            System.out.println("Ban co muon mua nua khong? (true/false)");
            p = Boolean.parseBoolean(scanner.next());
            scanner.nextLine();
            
        }while(p);
        
        //Xuat
        dsh.Xuat();
        System.out.println("Tong so tien: "+dsh.tongTien());
        dsh.ThanhToan(dsh.tongTien());
        
    }
}
